package sample;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import sun.util.logging.PlatformLogger;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

import static com.sun.org.apache.xalan.internal.utils.SecuritySupport.getResourceAsStream;
import static javafx.scene.layout.BackgroundPosition.CENTER;
import static javafx.scene.layout.BackgroundRepeat.ROUND;

public class Main extends Application {

    public static Stage primaryStage;
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Test.fxml"));
        primaryStage.setTitle("Design with Ebimem");

        primaryStage.getIcons().add(new Image("\\Images\\J.png"));
        primaryStage.setResizable(true);


        Scene Scene1=new Scene(root);
//        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.setScene(Scene1);
        primaryStage.show();


    }

    public static void main(String[] args) {

        launch(args);
    }
}
