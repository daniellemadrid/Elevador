package aula4;

public class SomaElementos {

    public static void main(String[] args) {

        int[] numeros = new int[5];
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
            System.out.println(soma);
        }
    }
}
