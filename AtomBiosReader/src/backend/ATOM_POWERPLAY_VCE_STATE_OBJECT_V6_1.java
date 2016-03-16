package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_VCE_STATE_OBJECT_V6_1 extends AContainer {
	
	ByteStructure  ucVCEClockInfoIndex = new ByteStructure();
    ByteStructure  ucClockInfoIndex = new ByteStructure(); //

	
	
	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(ucVCEClockInfoIndex);
		list.add(ucClockInfoIndex);


		return list;
	}
	@Override
	public void fillSubListDescriptions() {
		ucVCEClockInfoIndex.setName("ucVCEClockInfoIndex");
		ucClockInfoIndex.setName("ucClockInfoIndex");
		ucClockInfoIndex.setDescription("highest 2 bits indicates memory p-states, lower 6bits indicates index to ClockInfoArrary");
		super.fillSubListDescriptions();
	}

}
