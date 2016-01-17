package amd.gui.view;

import java.io.File;

import amd.gui.AtomBiosReader;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.FileChooser;

/**
 * 
 * @author Andrei Palishchuk
 */
public class RootLayoutController {

    // Reference to the main application
    private AtomBiosReader mainApp;

    /**
     * Is called by the main application to give a reference back to itself.
     * 
     * @param mainApp
     */
    public void setMainApp(AtomBiosReader mainApp) {
        this.mainApp = mainApp;
    }

    /**
     * Creates an something new.
     */
    @FXML
    private void handleNew() {
    	/*
        mainApp.getPersonData().clear();
        mainApp.setPersonFilePath(null);
        */
    }

    /**
     * Opens a FileChooser
     */
    @FXML
    private void handleOpen() {
        FileChooser fileChooser = new FileChooser();

        // Set extension filter
//        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter(
//                "XML files (*.xml)", "*.xml");
//        fileChooser.getExtensionFilters().add(extFilter);

        // Show save file dialog
        File file = fileChooser.showOpenDialog(mainApp.getPrimaryStage());

        if (file != null) {
            mainApp.loadBiosFromFile(file);
        }
    }

    /**
     * Saves the file that is currently open. If there is no
     * open file, the "save as" dialog is shown.
     */
    @FXML
    private void handleSave() {
        File biosFile = mainApp.getBiosFilePath();
        if (biosFile != null) {
            mainApp.saveBiosToFile(biosFile);
        } else {
            handleSaveAs();
        }
    }

    /**
     * Opens a FileChooser to let the user select a file to save to.
     */
    @FXML
    private void handleSaveAs() {
        FileChooser fileChooser = new FileChooser();

        // Set extension filter
//        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter(
//                "XML files (*.xml)", "*.xml");
//        fileChooser.getExtensionFilters().add(extFilter);

        // Show save file dialog
        File file = fileChooser.showSaveDialog(mainApp.getPrimaryStage());

        if (file != null) {
            // Make sure it has the correct extension
//            if (!file.getPath().endsWith(".xml")) {
//                file = new File(file.getPath() + ".xml");
//            }
            mainApp.saveBiosToFile(file);
        }
    }

    /**
     * Opens an about dialog.
     */
    @FXML
    private void handleAbout() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("ATOM Bios Reader");
        alert.setHeaderText("About");
        alert.setContentText("Author: Andrei Palishchuk\nWebsite: https://github.com/Hedzin/AtomBiosReader");

        alert.showAndWait();
    }

    /**
     * Closes the application.
     */
    @FXML
    private void handleExit() {
        System.exit(0);
    }
}