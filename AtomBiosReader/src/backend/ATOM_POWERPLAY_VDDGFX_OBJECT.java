package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_VDDGFX_OBJECT extends AContainer {

	ShortStructure Vdd = new ShortStructure();/* Base voltage */
	ShortStructure CACLow = new ShortStructure();
	ShortStructure CACMid = new ShortStructure();
	ShortStructure CACHigh = new ShortStructure();

	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(Vdd);
		list.add(CACLow);
		list.add(CACMid);
		list.add(CACHigh);
		return list;
	}
	@Override
	public void fillSubListDescriptions() {
		Vdd.setName("VDD");
		Vdd.setDescription("Base voltage");
		CACLow.setName("CACLow");
		CACMid.setName("CACMid");
		CACHigh.setName("CACHigh");
		super.fillSubListDescriptions();
	}

}
