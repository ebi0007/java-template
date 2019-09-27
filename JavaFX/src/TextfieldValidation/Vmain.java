package TextfieldValidation;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Vmain extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("TextfieldValidation.fxml"));
        primaryStage.setTitle("Ebimem");

        Scene Scene1=new Scene(root);
        primaryStage.setScene(Scene1 );
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
