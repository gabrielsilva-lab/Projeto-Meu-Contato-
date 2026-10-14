
package controller;

import java.util.ArrayList;
import model.Contato;

public class Agenda {
    ArrayList<Contato>contatos = new ArrayList<>();
    
    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }
    
    public void listarContatos() {
        for(Contato agenda : contatos) { // Percorre a agenda
            System.out.println(agenda); // Mostra a agenda
        }
    }
    
    public Contato buscarPorNome(String nome) {
        for(Contato contato : contatos)  {
            if(contato.getNome().equalsIgnoreCase(nome)) {
                    return contato;
            }
        }
    
            return null;
    }
    
    public void remover(String nome) {
        Contato contato = buscarPorNome(nome);
        
        if(contato != null) {
            contatos.remove(contato);
            System.out.println("Contato Removido");
        }
        
        else {
            System.out.println("Contato nao encontrado");
        }
    }

}
