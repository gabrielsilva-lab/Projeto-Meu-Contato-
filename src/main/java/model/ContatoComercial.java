
package model;

public class ContatoComercial extends Contato {
       private String empresa;
       public ContatoComercial(String nome, String telefone, String email, String empresa) {
           super(nome,telefone,email);
           this.empresa = empresa;
       }
       
       public void setEmpresa(String empresa) {
           this.empresa = empresa;
       }
       
       public String getEmpresa() {
           return empresa;
       }
       
       
       public void exibirDados() {
           System.out.println("Empresa: "+getEmpresa());
       }
}
