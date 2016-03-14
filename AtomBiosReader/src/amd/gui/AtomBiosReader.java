package amd.gui;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.prefs.Preferences;

import amd.gui.model.BiosTable;
import amd.gui.view.BiosParseResultOverviewController;
import amd.gui.view.RootLayoutController;
import backend.ATOM_BIOS;
import backend.AtomBiosReaderCLI;
import backend.IAtomTable;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class AtomBiosReader extends Application {
	private Stage primaryStage;
	private BorderPane rootLayout;
	private ATOM_BIOS atomBios;
	
	/**
	 * The data as an observable list of Persons.
	 */
	private ObservableList<BiosTable> biosTables = FXCollections.observableArrayList();

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("ATOM Bios Reader");

		// Set the application icon.
		// this.primaryStage.getIcons().add(new
		// Image("file:resources/images/address_book_32.png"));

		initRootLayout();

		showBiosParseResultOverview();
	}

	public static void main(String[] args) {
		launch(args);
	}

	/**
	 * Initializes the root layout and tries to load the last opened person
	 * file.
	 */
	public void initRootLayout() {
		try {
			// Load root layout from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(AtomBiosReader.class.getResource("view/RootLayout.fxml"));
			rootLayout = (BorderPane) loader.load();

			// Show the scene containing the root layout.
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);

			// Give the controller access to the main app.
			RootLayoutController controller = loader.getController();
			controller.setMainApp(this);

			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Try to load last opened person file.
		/*
		 * File file = getPersonFilePath(); if (file != null) {
		 * loadPersonDataFromFile(file); }
		 */
	}

	/**
	 * Returns the main stage.
	 * 
	 * @return
	 */
	public Stage getPrimaryStage() {
		return primaryStage;
	}


	public void loadBiosFromFile(File file) {
		try {
			// stub
			
			atomBios = AtomBiosReaderCLI.parse(file);
			biosTables.clear();
			List<IAtomTable> tableList = atomBios.tableList;
			for (IAtomTable atomTable : tableList) {
				biosTables.add(new BiosTable(atomTable.getBinaryDataBlock()));
			}

			
		} catch (Exception e) { // catches ANY exception
			e.printStackTrace();
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Error");
			alert.setHeaderText("Could not load data");
			alert.setContentText("Could not load data from file:\n" + file.getPath());

			alert.showAndWait();
		}

	}

	public File getBiosFilePath() {
	    Preferences prefs = Preferences.userNodeForPackage(AtomBiosReader.class);
	    String filePath = prefs.get("filePath", null);
	    if (filePath != null) {
	        return new File(filePath);
	    } else {
	        return null;
	    }
	}

	public void saveBiosToFile(File biosFile) {
		
	    try {
	    	// TODO Auto-generated method stub
	    } catch (Exception e) { // catches ANY exception
	        Alert alert = new Alert(AlertType.ERROR);
	        alert.setTitle("Error");
	        alert.setHeaderText("Could not save data");
	        alert.setContentText("Could not save data to file:\n" + biosFile.getPath());

	        alert.showAndWait();
	    }
	}
	/**
	 * Shows the bios parser result overview inside the root layout.
	 */
	public void showBiosParseResultOverview() {
		try {
			// Load person overview.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(AtomBiosReader.class.getResource("view/BiosParseResultOverview.fxml"));
			AnchorPane biosParseResultOverview = (AnchorPane) loader.load();

			// Set person overview into the center of root layout.
			rootLayout.setCenter(biosParseResultOverview);

			// Give the controller access to the main app.
			BiosParseResultOverviewController controller = loader.getController();
			controller.setMainApp(this);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public ObservableList<BiosTable> getBiosTablesData() {
		return biosTables;
	}
}
