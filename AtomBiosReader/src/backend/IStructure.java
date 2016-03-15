package backend;
import java.util.List;

public interface IStructure {
	boolean isOffsetBased();
	int getOffsetPosition();
	void setOffsetPosition(int position);
	int getLength();

	List<IStructure> getSubStructureList();

//	StructureType getType();
//
//	StructureDataType getDataType();

	BinaryDataBlock getBinaryDataBlock();
	
	void setLength(int lenght);
	void process();

	void setBinaryDataBlock(BinaryDataBlock bdb);

	void init();
	//void populateDetailsInBDB();
	void setName(String name);
	String getName();
	void setDescription(String description);
	String getDescription();
	void fillSubListDescriptions();
}
