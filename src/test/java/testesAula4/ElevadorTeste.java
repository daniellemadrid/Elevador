package testesAula4;

import aula4.exerc1.Elevador;
import org.junit.Test;

public class ElevadorTeste {
    @Test
    public void deveriaExibirOsDadosDoElevador() {
        Elevador elevador = new Elevador();
        elevador.setAndarAtual(6);
        elevador.getAndarAtual();

        elevador.setCapacidadeElevador(14);
        elevador.getCapacidadeElevador();

        elevador.setPessoasPresentes(2);
        elevador.getPessoasPresentes();

        elevador.setTotalDeAndares(15);
        elevador.getTotalDeAndares();

        elevador.iniciar(15, 20);
        elevador.entrar();
        elevador.sair();
        elevador.subir();
        elevador.descer();
    }
}
