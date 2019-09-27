package ParsonlineProject;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller_P implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources){

    }

    @FXML
    public JFXButton loginbutton,canselbutton;
    @FXML
    public JFXTextField usernamet;
    @FXML
    public JFXPasswordField passwordt;

    public void canselAction(ActionEvent event){
        System.exit(0);
    }
//********************************************************************
    public void loginAction( ActionEvent event) throws Exception{
        if(usernamet.getText().equals("admin") & passwordt.getText().equals("123")){
    //************* bastane panjere ghabli**********************
           Stage st=(Stage) loginbutton.getScene().getWindow();
           st.close();

   //******************ijade panjere jadid***********************
            Stage inputstage=new Stage();
            Parent rooti = FXMLLoader.load(getClass().getResource("InputPage.fxml"));

            inputstage.setTitle("Input");
            inputstage.getIcons().add(new Image("\\ParsonlineProject\\Images_P\\i2.jpg"));
            inputstage.setResizable(false);

            rooti.setId("inputpagebackground");
            rooti.getStylesheets().addAll(this.getClass().getResource("Css_P.css").toExternalForm());

            Scene Scene2=new Scene(rooti);
            inputstage.setScene(Scene2);
            inputstage.show();


        }
    }
//********************************************************************

}
