package backend;
import java.util.ArrayList;
import java.util.List;

public class ATOM_STUB_TABLE  extends AtomTable{
	{
	name = "ATOM_STUB_TABLE";
	description = "stub table";
	}

	
	 ATOM_COMMON_TABLE_HEADER	sHeader = new ATOM_COMMON_TABLE_HEADER();
	 ATOM_STUB_OBJECT stubObject = new ATOM_STUB_OBJECT();
		public ATOM_STUB_TABLE(BinaryDataBlock bdb) {
			setBinaryDataBlock(bdb);
			stubObject.setLength(bdb.getLength()-4);
			init();
		}
	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(sHeader);
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
