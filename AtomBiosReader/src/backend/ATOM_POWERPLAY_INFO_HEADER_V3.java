package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_INFO_HEADER_V3 extends AContainer{
	ATOM_POWERPLAY_INFO_HEADER_V2 basicTable2 = new ATOM_POWERPLAY_INFO_HEADER_V2();
    ShortStructure usFormatID = new ShortStructure();  // To be used ONLY by PPGen.
    ShortStructure usFanTableOffset = new ShortStructure();
    ShortStructure usExtendendedHeaderOffset = new ShortStructure();

	
	
	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();

		list.add(basicTable2);
		list.add(usFormatID);
		list.add(usFanTableOffset);
		list.add(usExtendendedHeaderOffset);
		return list;
	}
	
	@Override
	public void fillSubListDescriptions() {

		basicTable2.setName("basicTable2");
		usFormatID.setName("usFormatID");
		usFanTableOffset.setName("usFanTableOffset");
		usExtendendedHeaderOffset.setName("usExtendendedHeaderOffset");
		
		usFormatID.setDescription("To be used ONLY by PPGen.");
		super.fillSubListDescriptions();
	}
}
