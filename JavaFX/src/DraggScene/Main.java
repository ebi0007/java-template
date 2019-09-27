package DraggScene;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    public static Stage primaryStage;
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("drag.fxml"));
        primaryStage.setTitle("Design with Ebimem");

        Scene Scene1=new Scene(root);
//        Scene1.setFill(Color.TRANSPARENT);
        primaryStage.setScene(Scene1);
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.show();


    }

    public static void main(String[] args) {

        launch(args);
    }
}
