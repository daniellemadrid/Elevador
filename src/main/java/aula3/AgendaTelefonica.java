package aula3;

import java.util.HashMap;


public class AgendaTelefonica {
    HashMap<String, String> agenda = new HashMap<>();

    public void inserir(String nome, String numero) {

        agenda.put(nome, numero);
    }

    public String buscar(String nome) {
        String buscando = agenda.get(nome);
        return buscando;
    }

    public void remover(String nome) {
        if (buscar(nome) != null) {
            agenda.remove(nome);
        }

    }

    public int tamanho() {
        return agenda.size();
    }

}

