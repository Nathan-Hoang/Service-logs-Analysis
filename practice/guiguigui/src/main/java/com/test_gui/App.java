package com.test_gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/test_gui/primary.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        PrimaryController controller = loader.getController();
        controller.bindTableHeightsToScene(scene);
        stage.setTitle("Service Log Analyzer");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}