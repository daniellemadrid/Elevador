package testesAula4;

import aula4.SomaElementos;

public class SomaElementosTeste {

    public static void main(String[] args){
        int numero = 5;
        int[] arranjo = {0,1,2,5,5,5,3,4,5,77,5,8,};

        SomaElementos teste = new SomaElementos();

        System.out.println("A tripla do arranjo é: " + teste.somandoElementosArranjo(arranjo,numero));
    }
}
