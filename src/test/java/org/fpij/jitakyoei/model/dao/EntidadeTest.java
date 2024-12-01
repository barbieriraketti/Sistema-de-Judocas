package org.fpij.jitakyoei.model.dao;

import static org.junit.Assert.*;

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

public class EntidadeTest {
    private static Entidade entidade;
    private static Endereco endereco;

    @BeforeClass
    public static void setUp() {
        entidade = new Entidade();
        endereco = new Endereco();
    }

    @Test
    public void testEntidade() {
        entidade.setNome("nome da entidade");        
        entidade.setCnpj("123456");
        Assert.assertEquals("123456", entidade.getCnpj());
        Assert.assertEquals("nome da entidade", entidade.getNome());
    }
    
    @Test
    public void testEndereco() {
        endereco.setRua("Avenida Paulista");
        endereco.setNumero("6666");
        endereco.setCidade("SP");
        endereco.setEstado("SP");
        entidade.setEndereco(endereco);
        Assert.assertEquals(endereco, entidade.getEndereco());
    }
}
