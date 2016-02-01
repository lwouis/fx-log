package org.hildan.fxlog;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        URL url = null;
        try {
            url = getClass().getResource("/org.hildan.fxlog/view/main.fxml");
            Parent root = FXMLLoader.load(url);
            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("/org.hildan.fxlog/application.css").toExternalForm());
            stage.setTitle("FX Log");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            System.err.println("Exception on FXMLLoader.load()");
            System.err.println("View url: " + url);
            System.err.println("----------------------------------------\n");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
