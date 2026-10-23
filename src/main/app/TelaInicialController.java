
package app;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TelaInicialController {
    @FXML
    private void botaofecharTela(ActionEvent event) {
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.close();
        //System.exit(0);
    }
    
    @FXML
    private void botaoAdicionar(ActionEvent event) {
        abrirTela(event,"/app/telaAdicionarContato.fxml","Adicionar Contato");
        System.out.println("Adicionar Contato");
    }
    
    @FXML
    private void botaoListar(ActionEvent event) {
        abrirTela(event,"/app/telaListarContato.fxml","Listar Contato");
        System.out.println("Listar Contato");
    }
    
    @FXML
    private void botaoBuscar(ActionEvent event) {
        abrirTela(event,"/app/telaBuscarPorNome.fxml","Buscar Contato");
        System.out.println("Buscar Contato por nome");
    }
    
    @FXML 
    private void botaoRemover(ActionEvent event) {
        abrirTela(event,"/app/telaRemoverContato.fxml","Remover Contato");
        System.out.println("Remover Contato");
    }
    
    
    private void abrirTela(ActionEvent event, String caminho, String titulo) {
       
        try{
            Parent root = FXMLLoader.load(getClass().getResource(caminho));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle(titulo);
            stage.show();
        }
        catch(IOException | RuntimeException e){
            e.printStackTrace();
        }
    }     
}
