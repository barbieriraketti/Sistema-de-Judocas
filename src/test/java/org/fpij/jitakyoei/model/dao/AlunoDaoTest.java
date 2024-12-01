package org.fpij.jitakyoei.model.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import org.fpij.jitakyoei.model.beans.Aluno;
import org.fpij.jitakyoei.model.beans.Endereco;
import org.fpij.jitakyoei.model.beans.Entidade;
import org.fpij.jitakyoei.model.beans.Filiado;
import org.fpij.jitakyoei.model.beans.Professor;
import org.fpij.jitakyoei.model.dao.DAO;
import org.fpij.jitakyoei.model.dao.DAOImpl;
import org.fpij.jitakyoei.util.DatabaseManager;

class AlunoTest {
    private static Aluno aluno;

    @BeforeClass
    public static void setUp() {
        aluno = new Aluno();
    }

    @Test
    public void setFiliado() {
        Filiado filiado = new Filiado();
        filiado.setNome("Carlos Souza");
        filiado.setCpf("123.456.789-00");

        aluno.setFiliado(filiado);
        assertEquals(filiado, aluno.getFiliado());
        assertEquals("Carlos Souza", aluno.getFiliado().getNome());
        assertEquals("123.456.789-00", aluno.getFiliado().getCpf());
    }

    @Test
    public void setProfessor() {
        Professor professor = new Professor();
        Filiado filiadoProf = new Filiado();
        filiadoProf.setNome("Professor João");
        professor.setFiliado(filiadoProf);

        aluno.setProfessor(professor);
        assertEquals(professor, aluno.getProfessor());
        assertEquals("Professor João", aluno.getProfessor().getFiliado().getNome());
    }

    @Test
    public void setEntidade() {
        Entidade entidade = new Entidade();
        entidade.setNome("Academia Jitakyoei");

        aluno.setEntidade(entidade);
        assertEquals(entidade, aluno.getEntidade());
        assertEquals("Academia Jitakyoei", aluno.getEntidade().getNome());
    }
}
