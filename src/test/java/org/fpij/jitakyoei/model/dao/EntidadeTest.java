import static org.junit.Assert.*;
import org.fpij.jitakyoei.model.beans.*;
import org.fpij.jitakyoei.util.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

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
        assertEquals("123456", entidade.getCnpj());
        assertEquals("nome da entidade", entidade.getNome());
    }
    
    @Test
    public void testEndereco() {
        endereco.setRua("Avenida Paulista");
        endereco.setNumero("6666");
        endereco.setCidade("SP");
        endereco.setEstado("SP");
        entidade.setEndereco(endereco);
        assertEquals(endereco, entidade.getEndereco());
    }
}
