package aula3;

public class Main {
    public static void main(String[] args) {

        AgendaTelefonica agenda = new AgendaTelefonica();

        agenda.inserir("dani", "12345");
        agenda.inserir("carol", "2222222");
        agenda.inserir("vanderlei", "33333");
        agenda.inserir("vitor", "44444");
        agenda.inserir("manu", "55555");
        agenda.inserir("maria", "666666");
        agenda.inserir("helena", "77777");

        System.out.println(agenda.tamanho());
        agenda.remover("manu");
        System.out.println(agenda.tamanho());
        String numero = agenda.buscar("dani");
        System.out.println(numero);
    }
}

