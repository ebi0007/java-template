package LoginProject;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class ControlerForButton implements Initializable {

    @FXML
    TextField PB;
    @FXML
    Button btc;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        PasswordField P= new PasswordField();
        P.setPromptText("Password");
    }

    public void onclick(ActionEvent event){
        Stage x=(Stage) btc.getScene().getWindow();
        x.close();
    }



}

