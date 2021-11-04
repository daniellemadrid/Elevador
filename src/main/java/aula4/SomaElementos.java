package aula4;

public class SomaElementos {

    public int somandoElementosArranjo(int[] arranjo, int Atripla) {
        int soma = 0;
        for (int i = 0; i < arranjo.length; i++) {
            if(Atripla == arranjo[i]){
                soma++;
            }

        }
        return soma;
    }
}
