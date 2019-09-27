package Background ;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Screen;
import javafx.stage.Stage;

import static javafx.scene.layout.BorderWidths.AUTO;

public class E_Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start (Stage myStage) throws  Exception{

        Parent myPane = FXMLLoader.load(getClass().getResource("background.fxml"));
//        Pane myPane= new Pane();


//        Circle c=new Circle(100.0f,100.0f,60.0f);
//        myPane.getChildren().addAll(c);

//*************************    BKG1     ******************************
//        Image image=new Image("file:C:/Users/seven/Desktop/11.jpg");
//        ImageView newimage= new ImageView(image);
//        newimage.setFitWidth(850);
//        newimage.setFitHeight(620);
//        myPane.getChildren().add(newimage);
//*************************    BKG2     ******************************
//        Image image=new Image("file:C:/Users/seven/Desktop/11.jpg");
//        BackgroundImage x= new BackgroundImage(image,
//                                               BackgroundRepeat.ROUND,
//                                               BackgroundRepeat.ROUND,
//                                               BackgroundPosition.CENTER,
//                                               new BackgroundSize( AUTO, AUTO,true,true,true,true)
//                                               );
//        Background BK=new Background(x);
//        myPane.setBackground(BK);
//*************************    BKG3 load from  css      ******************************

        myPane.setId("BKimage");
        myPane.getStylesheets().addAll(this.getClass().getResource("background.css").toExternalForm());

 //***************************************************************

        Scene myScene= new Scene(myPane);
        myStage.setScene(myScene);
        myStage.setTitle("Background !");
        myStage.setResizable(true);
        myStage.show();


    }




}
