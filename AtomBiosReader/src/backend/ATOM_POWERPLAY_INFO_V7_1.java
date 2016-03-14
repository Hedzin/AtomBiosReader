package backend;
import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_INFO_V7_1  extends AtomTable{
	{
	name = "ATOM_POWERPLAY_INFO_V7_1";
	description = "PowerPlay Info Table";
	}
	
	
	 ATOM_COMMON_TABLE_HEADER	sHeader = new ATOM_COMMON_TABLE_HEADER();
	 
	 ATOM_POWERPLAY_INFO_OBJECT_V7_1 ppObject = new ATOM_POWERPLAY_INFO_OBJECT_V7_1();
	 StructureType type = StructureType.subFixed;
	 

	public ATOM_POWERPLAY_INFO_V7_1(BinaryDataBlock bdb) {
		setBinaryDataBlock(bdb);
		init();
	}

	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(sHeader);
		list.add(ppObject);

		return list;
	}
	
	@Override
	public void fillSubListDescriptions() {
		System.out.println(sHeader);
		sHeader.setName("CommonTableHeader");
		ppObject.setName("ATOM_POWERPLAY_INFO_OBJECT_V7_1");
		ppObject.setDescription("powerplay object");
		super.fillSubListDescriptions();
	}

}
