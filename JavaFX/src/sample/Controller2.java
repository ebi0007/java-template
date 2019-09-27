package sample;

import com.sun.org.omg.CORBA.Initializer;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import  javafx.scene.control.TextField;
import  javafx.scene.control.TextArea;
import  javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class Controller2 implements Initializable  {

    @Override
    public void initialize( URL url, ResourceBundle rb){

    }
    @FXML
    public TextField tf1;
    public TextField tf2;
    @FXML
    public Label txtout;
    @FXML
    public Button bot;
    @FXML
    public TextArea txta;

    public static String st1,st2;
//*********************
    public void txtF1(){
         st1=tf1.getText();
         st2=tf2.getText();

    }
//*********************
    public void printoutt() throws Exception{
//        Pane p1 = new Pane();
//        Scene NScene= new Scene(p1);
        Stage stage = (Stage) bot.getScene().getWindow();
        // do what you have to do
        stage.close();

        Stage stage1=new Stage();
        Parent root1 = FXMLLoader.load(getClass().getResource("MyProjectOut.fxml"));

//        txtout.setText("ebi");
        stage1.setTitle("My output");
        Scene Scene1=new Scene(root1);
        stage1.setScene(Scene1);
        stage1.show();


//        System.out.println("NAme is:"+tf1.getText());
    }


}
