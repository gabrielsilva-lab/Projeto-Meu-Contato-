
package aplicacao.listarContato;

import java.awt.Desktop.Action;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class listarContatoController {
    
    @FXML
    public void btnListar(ActionEvent event){
        try{
            Parent root = FXMLLoader.load(getClass().getResource("telaListarContato.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("Listar Contato");
            stage.show();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
