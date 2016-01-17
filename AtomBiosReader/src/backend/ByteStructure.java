package backend;

public class ByteStructure extends AEditableValue {
	Byte value = null;
	int lenght = 1;
	@Override
	public int getLength() {
		return lenght;
	}
}
