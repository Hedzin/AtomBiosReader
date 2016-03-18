package backend;
import java.util.ArrayList;
import java.util.List;

public class ATOM_STUB_TABLE  extends AtomTable{
	public ATOM_STUB_TABLE(BinaryDataBlock bdb) {
		setBinaryDataBlock(bdb);
		init();
	}

	{
	name = "ATOM_STUB_TABLE";
	description = "stub table";
	}

	
	 ATOM_COMMON_TABLE_HEADER	sHeader = new ATOM_COMMON_TABLE_HEADER();
	 ATOM_STUB_OBJECT stubObject = new ATOM_STUB_OBJECT();

	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(sHeader);
		
			int structureSize = binDataBlock.getLength();
			int stubSize = structureSize-4;
			stubObject.setLength(stubSize);
			list.add(stubObject);

		

		return list;
	}
	
	@Override
	public void fillSubListDescriptions() {
		sHeader.setName("CommonTableHeader");
		stubObject.setName("UNPARSED DATA");
		stubObject.setDescription("not supported, yet");
		super.fillSubListDescriptions();
	}

}
