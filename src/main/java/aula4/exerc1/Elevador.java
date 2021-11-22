package aula4.exerc1;


public class Elevador {
    int totalDeAndares;
    int capacidadeElevador;//kg
    int pessoasPresentes;
    int andarAtual;

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setTotalDeAndares(int totalAndares) {
        this.totalDeAndares = totalDeAndares;
    }

    public int getTotalDeAndares() {
        return totalDeAndares;
    }

    public void setCapacidadeElevador(int capacidade) {
        this.capacidadeElevador = capacidade;
    }

    public int getCapacidadeElevador() {
        return capacidadeElevador;
    }

    public void setPessoasPresentes(int pessoasPresentes) {
        this.pessoasPresentes = pessoasPresentes;
    }

    public int getPessoasPresentes() {
        return pessoasPresentes;
    }


    public void iniciar(int capacidadeElevador, int totalDeAndares) {
        this.capacidadeElevador = capacidadeElevador;
        this.totalDeAndares = totalDeAndares;
    }

    public void entrar() {
        if (pessoasPresentes < capacidadeElevador) {
            pessoasPresentes++;
            System.out.println("Pode entrar");
            System.out.println("Total de pessoas: " + pessoasPresentes);
        } else {
            System.out.println("Não entre, a capacidade máxima foi atingida");
        }
    }

    public void sair() {
        if (pessoasPresentes > 0) {
            pessoasPresentes--;
            System.out.println("Há pessoas saindo");
            System.out.println("Total de pessoas: " + pessoasPresentes);
        } else {
            System.out.println("O elevador está vázio");
        }
    }

    public void subir() {
        if (andarAtual < totalDeAndares) {
            andarAtual++;
            System.out.println("O elevador está subindo");
            System.out.println("Você está no " + andarAtual + " andar");
        } else {
            System.out.println("Você está no último andar");
        }
    }

    public void descer() {
        if (andarAtual > 0) {
            andarAtual--;
            System.out.println("O elevador está descendo");
            System.out.println("Você está no  " + andarAtual + " andar");
        } else {
            System.out.println("Você está no térreo");
        }
    }
}


