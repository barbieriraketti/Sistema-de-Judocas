package org.fpij.jitakyoei.model.beans;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {
    private Aluno aluno;

    @BeforeEach
    void setUp() {
        aluno = new Aluno();
    }

    @Test
    void setFiliado() {
        Filiado filiado = new Filiado();
        filiado.setNome("Carlos Souza");
        filiado.setCpf("123.456.789-00");

        aluno.setFiliado(filiado);
        assertEquals(filiado, aluno.getFiliado());
        assertEquals("Carlos Souza", aluno.getFiliado().getNome());
        assertEquals("123.456.789-00", aluno.getFiliado().getCpf());
    }

    @Test
    void setProfessor() {
        Professor professor = new Professor();
        Filiado filiadoProf = new Filiado();
        filiadoProf.setNome("Professor João");
        professor.setFiliado(filiadoProf);

        aluno.setProfessor(professor);
        assertEquals(professor, aluno.getProfessor());
        assertEquals("Professor João", aluno.getProfessor().getFiliado().getNome());
    }

    @Test
    void setEntidade() {
        Entidade entidade = new Entidade();
        entidade.setNome("Academia Jitakyoei");

        aluno.setEntidade(entidade);
        assertEquals(entidade, aluno.getEntidade());
        assertEquals("Academia Jitakyoei", aluno.getEntidade().getNome());
    }
}
