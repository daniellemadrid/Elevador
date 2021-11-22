package testesAula4;

import aula4.exerc3.Repeticao;
import org.junit.Test;

public class RepeticaoTeste {

    private static Repeticao stringTeste = new Repeticao();

    @Test
    public void deveriaExibirStringRepetida(){
        System.out.println(stringTeste.verificacaoRepeticao("dani dani dani dani", "ani"));
    }
}
