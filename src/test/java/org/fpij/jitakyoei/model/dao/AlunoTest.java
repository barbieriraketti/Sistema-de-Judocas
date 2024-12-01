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

public class AlunoTest {
    private static Aluno aluno;
    private static Filiado filiado;
    private static Filiado filiadoProf;
    private static Professor professor;
    private static Entidade entidade;
    

    @BeforeClass
    public static void setUp() {
        aluno = new Aluno();
        professor = new Professor();
        filiado = new Filiado();
        filiadoProf = new Filiado();
        entidade = new Entidade();
    }

    @Test
    public void testFiliado() {
        filiado.setNome("nome do filiado");
        filiado.setCpf("123456");

        aluno.setFiliado(filiado);
        assertEquals(filiado, aluno.getFiliado());
        assertEquals("nome do filiado", aluno.getFiliado().getNome());
        assertEquals("123456", aluno.getFiliado().getCpf());
    }

    @Test
    public void testProfessor() {
        filiadoProf.setNome("nome do professor");
        professor.setFiliado(filiadoProf);

        aluno.setProfessor(professor);
        assertEquals(professor, aluno.getProfessor());
        assertEquals("nome do professor", aluno.getProfessor().getFiliado().getNome());
    }

    @Test
    public void testEntidade() {
        entidade.setNome("nome da entidade");
        aluno.setEntidade(entidade);
        assertEquals(entidade, aluno.getEntidade());
        assertEquals("nome da entidade", aluno.getEntidade().getNome());
    }
}
