package Example;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class E_Main extends Application {

    public static void main(String[] args){
        launch(args);

    }

    @Override
    public void start(Stage mystage) throws Exception{
        Pane myroot = new Pane();
        Scene myscene =new Scene(myroot,500,500, Color.YELLOW);
        mystage.setScene(myscene);
        mystage.setTitle("First Example.");
        mystage.setResizable(false);

        for(int i=0;i<500;i+=5){
            Line myline1=new Line(i,0,500,i);
            myroot.getChildren().add(myline1);

            Line myline2=new Line(0,i,i,500);
            myroot.getChildren().add(myline2);

            Line myline3=new Line(0,i,500-i,0);
            myroot.getChildren().add(myline3);

            Line myline4=new Line(i,500,500,500-i);
            myroot.getChildren().add(myline4);

        }

        mystage.show();


    }


}
