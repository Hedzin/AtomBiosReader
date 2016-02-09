package amd.gui.model;

import java.time.LocalDate;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import backend.BinaryDataBlock;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Model class for a BiosTable.
 *
 * @author Andrei Palishchuk
 */
public class BiosTable {

	private final StringProperty tableName;
	public BinaryDataBlock binDataBlock;
//	private final StringProperty lastName;
//	private final StringProperty street;
//	private final IntegerProperty postalCode;
//	private final StringProperty city;
//	private final ObjectProperty<LocalDate> birthday;

	/**
	 * Constructor with some initial data.
	 * 
	 */
	public BiosTable(BinaryDataBlock binDataBlock) {
		this.binDataBlock = binDataBlock;
		String name = binDataBlock.getName();
		if(name==null||name.trim().equals(""))this.tableName = new SimpleStringProperty("UNKNOWN");
		else this.tableName = new SimpleStringProperty(name);
//		this.lastName = new SimpleStringProperty(lastName);
//
//		// Some initial dummy data, just for convenient testing.
//		this.street = new SimpleStringProperty("some street");
//		this.postalCode = new SimpleIntegerProperty(1234);
//		this.city = new SimpleStringProperty("some city");
//		this.birthday = new SimpleObjectProperty<LocalDate>(LocalDate.of(1999, 2, 21));
	}

	public String getTableName() {
		return tableName.get();
	}

	public void setFirstName(String tableName) {
		this.tableName.set(tableName);
	}

	public StringProperty tableNameProperty() {
		return tableName;
	}
}