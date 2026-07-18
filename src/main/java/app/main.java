
package app;

import java.util.Scanner;
import controller.Agenda;
import model.Contato;
import utils.ValidadorEmail;


public class main {
    
    public static void main(String[]args) {
        try (Scanner entrada = new Scanner(System.in)) {
            Agenda agenda = new Agenda();
            
            int opcao=0;
            while(opcao != 5) { // Tudo ocorre dentro da repetição até o usuário digitar 5 e sair da aplicação.
                System.out.println("===== AGENDA DE CONTATOS =====");
                System.out.println("1: Adicionar Contatos");
                System.out.println("2: Listar Contatos");
                System.out.println("3: Buscar Contatos Por Nome");
                System.out.println("4: Remover Contato");
                System.out.println("5: Sair do programa");
                System.out.println("==== ==== ==== ==== ==== =====");
                
                System.out.println("Escolha uma opcao: ");
                opcao = entrada.nextInt();
                
                entrada.nextLine(); // Limpa o buffer do teclado.
                
                switch(opcao) {
                    case 1:
                            System.out.print("Nome: ");
                            String nome = entrada.nextLine();

                            System.out.print("Telefone: ");
                            String telefone = entrada.nextLine();

                            System.out.print("Email: ");
                            String email = entrada.nextLine();
                            
                            if(!ValidadorEmail.validarEmail(email)) {
                                System.out.println("E-mail invalido");
                                break;
                            }
                            Contato contato = new Contato(nome,telefone,email); // Pega os dados do Contato
                            agenda.adicionarContato(contato); // Chama o método adicionarContato() e guarda o contato na Agenda
                            System.out.println("Contato Adicionado");
                            break;
                        
                    
                    case 2:
                        System.out.println("Lista de Contatos da Agenda");
                        agenda.listarContatos(); // Exibe a lista de contatos
                        break;
                    
                    case 3:
                        System.out.print("Digite o nome que deseja buscar: ");
                        String buscar = entrada.nextLine();
                        
                        Contato encontrarContato = agenda.buscarPorNome(buscar);
                        
                        if(encontrarContato != null) {
                            System.out.println("Contato encontrado");
                            System.out.println(encontrarContato);
                        }
                        
                        else {
                            System.out.println("Contato nao encontrado");
                        }
                        break;
                        
                    case 4:
                        System.out.print("Digite o nome que deseja remover: ");
                        String excluir = entrada.nextLine();
                        
                        agenda.remover(excluir);
                        break;
                    case 5:
                        System.out.println("Saindo do programa...");
                        break;
                        
                    default :
                        System.out.println("Opcao invalida! Digite novamente.");
                        break;
                }   
            }
        }
    }
}

