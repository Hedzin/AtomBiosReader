package backend;

public class StringStructure extends AEditableValue {
	String value = null;
	int lenght = 1;
	@Override
	public int getLength() {
		return lenght;
	}
	public StringStructure(int lenght) {
		this.lenght = lenght;
	}
}
