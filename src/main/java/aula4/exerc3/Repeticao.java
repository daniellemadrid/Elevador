package aula4.exerc3;

public class Repeticao {
    public int verificacaoRepeticao(String a, String b) {
        if (a.contains(b)) {
            String[] repet = a.split(b);
            return repet.length;
        }
        return 0;
    }
}
