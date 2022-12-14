/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package usuário;

import java.awt.event.MouseEvent;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public abstract class Usuário extends Application {
   
    public static void main(String[] args) {
        launch(args);
    }
    private Node[] botao;
    @Override
    public abstract void start(Stage primaryStage) throws Exception;{
         primaryStage.setTitle("Interface");
         Button botão = new Button("Clique Aqui");
         botão.setOnAction(new EventHandler<ActionEvent>(){

           
            public void handle(ActionEvent event){
               System.out.println("Entre");

}
});
            StackPane root = new StackPane();
            root.getChildren().addAll(botão);
            primaryStage.setScene(new Scene(root, 700, 500));
            primaryStage.show();
}
    
}
