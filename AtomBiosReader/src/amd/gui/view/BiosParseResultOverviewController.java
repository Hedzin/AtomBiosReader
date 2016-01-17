package amd.gui.view;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import amd.gui.AtomBiosReader;
import amd.gui.model.BiosTable;


public class BiosParseResultOverviewController {
	@FXML
	private TableView<BiosTable> biosTables;
	@FXML
	private TableColumn<BiosTable, String> tableNameColumn;
//	@FXML
//	private TableColumn<BiosTable, String> lastNameColumn;

//	@FXML
//	private Label firstNameLabel;
//	@FXML
//	private Label lastNameLabel;
//	@FXML
//	private Label streetLabel;
//	@FXML
//	private Label postalCodeLabel;
//	@FXML
//	private Label cityLabel;
//	@FXML
//	private Label birthdayLabel;

	// Reference to the main application.
	private AtomBiosReader mainApp;

	/**
	 * The constructor. The constructor is called before the initialize()
	 * method.
	 */
	public BiosParseResultOverviewController() {
	}

	/**
	 * Initializes the controller class. This method is automatically called
	 * after the fxml file has been loaded.
	 */
	@FXML
	private void initialize() {
		// Initialize the person table with the two columns.
		tableNameColumn.setCellValueFactory(cellData -> cellData.getValue().tableNameProperty());
		//lastNameColumn.setCellValueFactory(cellData -> cellData.getValue().lastNameProperty());

		// Clear person details.
		showBiosTableDetails(null);

		// Listen for selection changes and show the person details when
		// changed.
		System.out.println(biosTables);
		biosTables.getSelectionModel().selectedItemProperty()
				.addListener((observable, oldValue, newValue) -> showBiosTableDetails(newValue));

	}

	/**
	 * Is called by the main application to give a reference back to itself.
	 * 
	 * @param mainApp
	 */
	public void setMainApp(AtomBiosReader mainApp) {
		this.mainApp = mainApp;

		// Add observable list data to the table
		biosTables.setItems(mainApp.getBiosTablesData());
	}

	/**
	 * Fills all text fields to show details about the person. If the specified
	 * person is null, all text fields are cleared.
	 * 
	 * @param person
	 *            the person or null
	 */
	private void showBiosTableDetails(BiosTable table) {
		if (table != null) {
			// Fill the labels with info from the person object.
//			firstNameLabel.setText(person.getFirstName());
//			lastNameLabel.setText(person.getLastName());
//			streetLabel.setText(person.getStreet());
//			postalCodeLabel.setText(Integer.toString(person.getPostalCode()));
//			cityLabel.setText(person.getCity());
//			birthdayLabel.setText(DateUtil.format(person.getBirthday()));
		} else {
			// Person is null, remove all the text.
//			firstNameLabel.setText("");
//			lastNameLabel.setText("");
//			streetLabel.setText("");
//			postalCodeLabel.setText("");
//			cityLabel.setText("");
//			birthdayLabel.setText("");
		}
	}
	
	/**
	 * Called when the user clicks on the delete button.
	 */
	@FXML
	private void handleSave() {
//	    int selectedIndex = personTable.getSelectionModel().getSelectedIndex();
//	    if (selectedIndex >= 0) {
//	        personTable.getItems().remove(selectedIndex);
//	    } else {
//	        // Nothing selected.
//	        Alert alert = new Alert(AlertType.WARNING);
//	        alert.initOwner(mainApp.getPrimaryStage());
//	        alert.setTitle("No Selection");
//	        alert.setHeaderText("No Person Selected");
//	        alert.setContentText("Please select a person in the table.");
//
//	        alert.showAndWait();
//	    }
	}
	/**
	 * Called when the user clicks the new button. Opens a dialog to edit
	 * details for a new person.
	 */
	@FXML
	private void handleLoad() {
//	    Person tempPerson = new Person();
//	    boolean okClicked = mainApp.showPersonEditDialog(tempPerson);
//	    if (okClicked) {
//	        mainApp.getPersonData().add(tempPerson);
//	    }
	}


}