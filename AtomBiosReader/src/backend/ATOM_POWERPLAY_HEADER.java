package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_HEADER extends AContainer {
	ByteStructure  revId = new ByteStructure();
	ByteStructure  numEntries = new ByteStructure();
	@Override
	public int getLength() {
		int length = 2;
		return length;
	}
	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(revId);
		list.add(numEntries);
		return list;
	}
	
	@Override
	public void fillSubListDescriptions() {
		revId.setName("RevisionId");
		numEntries.setName("NumEntries");
		super.fillSubListDescriptions();
	}
}
