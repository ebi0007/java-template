package DraggScene;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class TestController implements Initializable {
    @FXML
    public JFXButton exitbutton;
    @FXML
    public Button bt;

    double x=0;
    double y=0;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        exitbutton.setOnAction(e ->{
//            System.exit(0);
        });
        bt.setOnAction(e ->{
            System.out.println("Ebi");
//            System.exit(0);
        });
    }

///****************** dar file fxml  do amale dragmouse va pressed ra dar mouse event tarif mikonim
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
