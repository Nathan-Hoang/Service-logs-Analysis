package com.test_gui;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.*;

public class PrimaryController {

    @FXML private TableView<?> logTable;
    @FXML private TableView<?> statusTable;

    @FXML
    private void onFilterPressed() {
        System.out.println("Filter? There's no filter here!");
    }

    @FXML
    private void onDashboardButtonPressed() {
        System.out.println("Display what? You haven't coded shit.");
    }

    @FXML
    private void onStreamButtonPressed() {
        System.out.println("U think you streamer lah?");
    }

    @FXML
    private void onExplorerButtonPressed() {
        System.out.println("Go explore grass.");
    }
    
    public void bindTableHeightsToScene(Scene scene) {
        // Bind both tables' height to half the scene height
        logTable.prefHeightProperty().bind(scene.heightProperty().divide(2));
        statusTable.prefHeightProperty().bind(scene.heightProperty().divide(2));
    }
}
