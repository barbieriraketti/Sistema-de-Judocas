import static org.junit.Assert.*;
import org.fpij.jitakyoei.model.beans.*;
import org.fpij.jitakyoei.util.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

public class FaixaTest {
    private static Faixa faixa;
    private static Filiado filiado;
    private static Aluno aluno;
    private static List<Faixa> faixas;

    @BeforeClass
    public static void setUp() {
        Faixa faixa = new Faixa();
        Filiado filiado = new Filiado();
        Aluno aluno = new Aluno();
        faixas = new ArrayList<>();
    }

     @Test
    public void testCor() {        
        CorFaixa cor = CorFaixa.PRETA5DAN;
        faixa.setCor(cor);
        assertEquals(cor, faixa.getCor());
    }

    @Test
    public void testFaixaAluno() {
        CorFaixa cor = CorFaixa.PRETA5DAN;
        
        filiado.setNome("nome do filiado");
        
        
        faixa.setCor(cor);
        faixas.add(faixa);
        filiado.setFaixas(faixas);

        aluno.setFiliado(filiado);
        
        assertEquals(faixas, aluno.getFiliado().getFaixas());
    }
}
