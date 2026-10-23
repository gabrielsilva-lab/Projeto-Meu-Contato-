
package app;

import javafx.stage.Stage;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Parent;


public class TelaMain extends Application {
    
        @Override
        public void start(Stage primaryStage) throws Exception {
            Parent root = FXMLLoader.load(getClass().getResource("/app/TelaInicial.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setTitle("Tela Inicial");
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        
        public static void main(String[] args) {
            launch(args);
        }   
    }
