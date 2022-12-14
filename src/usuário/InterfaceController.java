package usuário;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class InterfaceController {

    @FXML
    private PasswordField CampoSenha;

    @FXML
    private TextField CampoUsuario;

    @FXML
    private Hyperlink CriarConta;

    @FXML
    private Hyperlink EsqueceuSenha;

    @FXML
    private Button FazerLogin;

    @FXML
    private CheckBox Lembre;

    @FXML
    private Button Sair;

    @FXML
    void Conta(ActionEvent event) {

    }

    @FXML
    void Esquecer(ActionEvent event) {
         
    }

    @FXML
    void FazerLogin(ActionEvent event) {
         String Usuário  = campoUsuario.getText();
         String Senha  = campoUsuario.getText();

         if(Usuário.equals("Maria") && Senha.equals("00000")){
            
    }
         else{
               System.out.println("Usuário ou Senha Errado!");
}
         System.out.println("You clicked me!");
         
    }

    @FXML
    void SalvarSenha(ActionEvent event) {

    }

      @FXML
    void exit(ActionEvent event) {

    }

    @FXML
    private Label label;    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    
    public void initialize(URL url, ResourceBundle rb) {
      
    }    

    
    
    
    
    
    
    
    
    
    
    
    
    private static class campoUsuario {

        private static String getText() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public campoUsuario() {
        }
    }
}






