package ParsonlineProject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main_P  extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Loginpage.fxml"));

        primaryStage.setTitle("Login");
        primaryStage.getIcons().add(new Image("\\ParsonlineProject\\Images_P\\l1.png"));
        primaryStage.setResizable(false);
//
        Scene Scene1=new Scene(root);
        primaryStage.setScene(Scene1);
        primaryStage.show();

    }

}
