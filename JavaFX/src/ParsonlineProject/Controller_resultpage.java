package ParsonlineProject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller_resultpage implements Initializable {
    @FXML
    BarChart barchart;
    @FXML
    public Label LL1,LL2,LL3;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Controller_inputpage RR=new Controller_inputpage();
        String st=Double.toString(RR.Rmyusage);

        showchart(RR.Rmyusage,RR.Ravgusage,RR.Rday);

        LL1.setText(Double.toString(RR.Ravgusage).substring(0,4));
        LL2.setText(Double.toString(RR.Rmyusage));

        if (RR.Rmyusage>=RR.Ravgusage){
            LL3.setStyle("-fx-text-fill:#ED0101; -fx-font-size: 16px;-fx-font-family: B Titr Bold");
            LL3.setText("مصرف شمابیشتر از حد میانگین بوده است.");
        }
        else {
            LL3.setStyle("-fx-text-fill:#07B40E  ; -fx-font-size: 16px;-fx-font-family: B Titr Bold");
            LL3.setText("مصرف شما کمتر از حد میانگین بوده است.");
        }




    }
 //********************************************************************************
 public void showchart(double myusage,double avgusage,int day){

     XYChart.Series dataSeries1 = new XYChart.Series();
     dataSeries1.setName("Usage Per "+Integer.toString(day)+" Days"+"\n");
     dataSeries1.getData().add(new XYChart.Data("AverageUsage", avgusage));
     barchart.getData().add(dataSeries1);

     XYChart.Series dataSeries2 = new XYChart.Series();
     dataSeries2.setName("Usage Per "+Integer.toString(day)+" Days");
     dataSeries2.getData().add(new XYChart.Data("UserUsage"  , myusage));
     barchart.getData().add(dataSeries2);
 }
 //********************************************************************************
    @FXML
    public Label L1;



}
