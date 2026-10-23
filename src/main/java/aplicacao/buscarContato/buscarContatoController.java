package aplicacao.buscarContato;

import java.awt.Desktop.Action;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class buscarContatoController {
    
    @FXML
    public void entrar(ActionEvent event) {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("telaBuscarPorNome.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("Buscar Contato");
            stage.show();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    
    }
}
