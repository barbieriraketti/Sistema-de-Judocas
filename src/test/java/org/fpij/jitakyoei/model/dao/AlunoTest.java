import static org.junit.Assert.*;
import org.fpij.jitakyoei.model.beans.*;
import org.fpij.jitakyoei.util.*;

import org.junit.BeforeClass;
import org.junit.Test;

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
