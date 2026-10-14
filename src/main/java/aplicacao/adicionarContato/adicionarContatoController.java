
package aplicacao.adicionarContato;

import java.awt.Desktop.Action;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class adicionarContatoController {
    
    @FXML
    public void entrar(ActionEvent event) {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("telaAdicionarContato.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow(); 
            stage.setScene(scene);
            stage.setTitle("Adicionar Contato");
            stage.show();
        }
        
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    private void botaoSalvar(ActionEvent event) {
        System.out.println("Salvar Contato");
    }
    
    @FXML
    private void botaoVoltar(ActionEvent event) {
        System.out.println("Voltar a pagina anterior");
    }
    
}
