package aula4;

public class Elevador {
    int terreo = 0;
    int totalDeAndares = 15;
    int capacidadeElevador = 80;//kg
    int pessoasPresentes = 20;
    int pessoa;
    int andarAtual;


    public int iniciar() {

        if (pessoa > capacidadeElevador) {
            System.err.print("Peso maximo atingido");
        } else {
            System.out.println("Entre!");
        }
        return pessoa;
    }

    public void Entrar() {
        if (pessoa < pessoasPresentes) {
            System.out.println("Há espaço, pode entrar");
        } else {
            System.err.println("Não há espaço no elevador, espere!");
        }
    }

    public void sair() {
        if (pessoasPresentes > 1) {
            System.err.println("Você terá que sair");
        } else {
            System.out.println("Pode continuar");
        }
    }

    public void subir() {

        if (andarAtual == totalDeAndares) {
            System.err.println("Não é possível subir, você está no último andar");
        } else {
            System.out.println("Subindo!");
        }
    }


    public void descer() {
        if (andarAtual == terreo) {
            System.err.println("não é possível descer, vc está no térreo");
        }
    }
}
