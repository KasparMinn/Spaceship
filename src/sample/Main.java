package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import sample.crafts.V9000;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        primaryStage.setTitle("Hello World");
        primaryStage.show();

        Group mainGroup = new Group();
        Scene mainScene = new Scene(mainGroup, 800, 400);

        Text currentShip = new Text();
        currentShip.setText(displayCraft());

        mainGroup.getChildren().addAll(currentShip);
        primaryStage.setScene(mainScene);

    }

    public static void main(String[] args) {
        launch(args);
    }

    public static String displayCraft() {

        V9000 vSpaceCraft = new V9000("V9000-B", "LXO", "14th of March", "Black", true);
        return vSpaceCraft.toString();

    }
}
