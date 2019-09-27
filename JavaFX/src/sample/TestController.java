package sample;

import com.jfoenix.controls.JFXButton;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class TestController implements Initializable {
    @FXML
    public JFXButton exitbutton;
    double x=0;
    double y=0;
    @FXML
    public TextField textf;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        exitbutton.setOnAction(e ->{
            System.exit(0);
        });
    }

    public void key(ActionEvent event){
        textf.textProperty().addListener(observable -> {
            if(textf.getText().equals("ebi")) textf.setStyle("-fx-border-color: red; -fx-border-width: 2px");
        });



    }

    @FXML
    void dragged(MouseEvent event) {
        Node node =(Node) event.getSource();
        Stage stage =(Stage)  node.getScene().getWindow();

        stage.setX(event.getScreenX()- x);
        stage.setY(event.getScreenY() - y);

    }

    @FXML
    void pressed(MouseEvent event) {
        x=event.getSceneX();
        y= event.getSceneY();

    }

}
