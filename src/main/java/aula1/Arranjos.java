package aula1;



public class Arranjos {

    public static void main(String args[]) {

        int[] numeros = new int[20];
        int[] numeros2 = new int[20];
        int[] numeros3 = union(numeros, numeros2);


        System.out.println("Exibindo o arranjo: ");
        for (int i = 0; i < 20; i++) {
            numeros[i] = i * 10;
            if (i == 10) {
                numeros[i] = 50;
            }
            System.out.println(numeros[i]);
        }
        for (int i = 0; i < 20; i++) {
            numeros2[i] = (i + 10) * 10;

            System.out.println(numeros2[i]);
        }

        System.out.println("Invertendo o arranjo: ");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        System.out.println("Ocorrencias de um elemento: " + nOcorrencias(numeros, 50));

        System.out.println("Retorna true se tem um elemento repetido: " + hasRepeat(numeros));

        System.out.println("Quantidade de repetidos: " + nroRepeat(numeros));

        int[] x = listRepeat(numeros);
        System.out.println("Lista de repetidos: ");
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
        System.out.println("A união é:");
        union(numeros, numeros2);

        System.out.println("A intersecção é:");
        int[] xy = intersect(numeros, numeros2);
        for (int i = 0; i < xy.length; i++) {
            System.out.println(xy[i]);
        }

        System.out.println("A diferença é:");
        difference(numeros, numeros2);

    }

    public static int nOcorrencias(int[] l, Integer el) {
        int cont = 0;
        for (int i = 0; i < l.length; i++) {
            if (l[i] == el) {
                cont++;
            }
        }
        return cont;
    }

    public static boolean hasRepeat(int[] l) {
        boolean numero = false;
        for (int i = 0; i < l.length; i++) {
            for (int j = 0; j < i; j++) {
                if (l[i] == l[j]) {
                    numero = true;
                }
            }

        }
        return numero;
    }

    public static int nroRepeat(int[] l) {
        int cont = 0;
        for (int i = 0; i < l.length; i++) {
            for (int f = 0; f < i; f++) {
                if (l[i] == l[f]) {
                    cont++;
                }
            }
        }
        return cont;
    }

    public static int[] listRepeat(int[] l) {
        int[] lista = new int[nroRepeat(l)];
        int cont = 0;
        for (int i = 0; i < l.length; i++) {
            for (int f = 1; f < i; f++) {
                if (l[i] == l[f]) {
                    lista[cont] = l[i];
                    cont++;
                }
            }
        }
        return lista;
    }

    public static int[] union(int[] l1, int[] l2) {
        int[] uniao = new int[(l1.length + l2.length)];
        int cont = 0;
        for (int i = 0; i < l1.length; i++) {
            uniao[cont] = l1[i];
            System.out.print(uniao[cont] + " ");
            cont++;
        }
        for (int i = 0; i < l2.length; i++) {
            uniao[cont] = l2[i];
            System.out.print(uniao[cont] + " ");
            cont++;
        }
        return uniao;
    }

    public static int[] intersect(int[] l1, int[] l2) {
        int[] lista = new int[(l1.length + l2.length)];
        int cont = 0;
        for (int i = 0; i < l1.length; i++) {
            for (int j = 0; j < l2.length; j++) {
                if (l1[i] == l2[j]) {
                    lista[cont] = l1[i];
                    cont++;
                }
            }
        }
        return lista;
    }

    public static int[] difference(int[] l1, int[] l2) {
        int diferenca = l1.length + l2.length;
        int[] list = new int[diferenca];
        int k = 0, cont = 0;
        for (int i = 0; i < l1.length; i++) {
            cont = 0;
            for (int j = 0; j < l2.length; j++) {
                if (l1[i] == l2[j]) {
                    cont++;
                }
            }
            if (cont == 0) {
                list[k] = l1[i];
                System.out.println("Esse numero: " + l1[i]);
                k++;
            }
        }
        return list;
    }
}


