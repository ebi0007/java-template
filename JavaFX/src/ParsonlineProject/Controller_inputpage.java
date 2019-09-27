package ParsonlineProject;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.effect.BoxBlur;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller_inputpage implements Initializable  {
    public  static double Rmyusage;
    public  static double Ravgusage;
    public  static int Rday;
    @FXML
    public JFXComboBox cm1, cm2,cm3,cm4;
    @FXML
    public JFXTextField tf1,tf2,tf3;
    @FXML
    public JFXButton bt1,bt2;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        String[] arr = new String[30];
        for (int i = 1; i <= 30; i++) {
            arr[i-1] = Integer.toString(i);
            cm1.getItems().addAll(arr[i-1]);
            cm3.getItems().addAll(arr[i-1]);
        }

        String[] arr2 = new String[12];
        for (int i = 1; i <= 12; i++) {
            arr2[i-1] = Integer.toString(i);
            cm2.getItems().addAll(arr2[i-1]);
            cm4.getItems().addAll(arr2[i-1]);
        }
    }


//***********************************************************
    public void cansel (ActionEvent event){
        System.exit(0);
    }
//***********************************************************

    public void calculate (ActionEvent event) throws Exception{

        int i1=  Integer.parseInt(tf1.getText());
        double i2=  Double.parseDouble(tf2.getText());
        double i3= Double.parseDouble(tf3.getText());
        Rmyusage=i3;
        double avgindate=i2/(i1*30);
        System.out.println(avgindate);

        int cm11=Integer.parseInt((String) cm1.getValue());
        int cm22=Integer.parseInt((String) cm2.getValue());
        int cm33=Integer.parseInt((String) cm3.getValue());
        int cm44=Integer.parseInt((String) cm4.getValue());

        int day=0;
        if (cm33>=cm11) {day=cm33-cm11+(cm44-cm22)*30;}
          else {day=cm33+30-cm11+(cm44-1-cm22)*30;}

        Rday=day;
        double avgusage=avgindate*day;
        Ravgusage=avgusage;
//        System.out.println(Ravgusage);

        Stage st=(Stage) bt1.getScene().getWindow();
        st.close();

        //******************ijade panjere jadid************************
        Stage inputstage=new Stage();
        Parent rootr = FXMLLoader.load(getClass().getResource("Resultpage.fxml"));

        inputstage.setTitle("Result");
//    inputstage.getIcons().add(new Image("\\ParsonlineProject\\Images_P\\i2.jpg"));
        inputstage.setResizable(false);

        rootr.setId("resultpagebackground");
        rootr.getStylesheets().addAll(this.getClass().getResource("Css_P.css").toExternalForm());


        Scene Scene2=new Scene(rootr);
        inputstage.setScene(Scene2);
        inputstage.show();

    }
//****************************************************************************








}