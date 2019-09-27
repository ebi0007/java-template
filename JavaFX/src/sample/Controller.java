package sample;

import com.sun.org.omg.CORBA.Initializer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;


public class Controller implements Initializable  {


    @FXML
    public Button dok;
    public Button dok2;
    @FXML
    public ComboBox cm;


    @Override
    public void initialize( URL url, ResourceBundle rb){
     //// meghdar dehi be combo box
        cm.getItems().removeAll(cm.getItems());
        cm.getItems().addAll("Option A", "Option B", "Option C");
        cm.getSelectionModel().select("Option B");

    }
//************************** click roye button
    public void onReact(ActionEvent event){
        System.out.println("this is first button");
    }
/////////******** Action bade click dar menu bar
    public void print(){
        System.out.println("print files");
    }
/////////////// Action bade click roye toggleButton
    public void tt(){
        print();
    }
/////***************** combobox va daryafte khoroji
    public void combo(ActionEvent event){
//        x = cm.getValue();
        System.out.println("Your choice is: "+cm.getValue());
    }





}

