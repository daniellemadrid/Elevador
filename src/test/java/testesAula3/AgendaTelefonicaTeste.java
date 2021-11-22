package testesAula3;

import aula3.AgendaTelefonica;
import org.junit.Test;

public class AgendaTelefonicaTeste {

    @Test
    public void deveriaExibirOsDadosDaAgenda () {

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
