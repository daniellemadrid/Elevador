package testesAula4;

import aula4.exerc4.SomaElementos;
import org.junit.Test;

public class SomaElementosTeste {

    @Test
   public void deveriaExibirTriplaDeElementos(){
        int numero = 5;
        int[] arranjo = {0,1,2,5,5,5,3,4,5,77,5,8,};

        SomaElementos teste = new SomaElementos();

        System.out.println("A tripla do arranjo é: " + teste.somandoElementosArranjo(arranjo,numero));
    }
}
