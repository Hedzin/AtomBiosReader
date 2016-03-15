package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_STATE_OBJECT_V2 extends AContainer {

	ByteStructure ucNumDPMLevels = new ByteStructure(); //number of valid dpm levels in this state; Driver uses it to calculate the whole size of the state: sizeof(ATOM_PPLIB_STATE_V2) + (ucNumDPMLevels - 1) * sizeof(UCHAR)
	ByteStructure nonClockInfoIndex = new ByteStructure();//a index to the array of nonClockInfos
	ByteStructure clockInfoIndex = new ByteStructure();//Driver will read the first ucNumDPMLevels in this array



	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(ucNumDPMLevels);
		list.add(nonClockInfoIndex);
		list.add(clockInfoIndex);
		return list;
	}
	@Override
	public void fillSubListDescriptions() {
		ucNumDPMLevels.setName("ucNumDPMLevels");
		nonClockInfoIndex.setName("nonClockInfoIndex");
		clockInfoIndex.setName("clockInfoIndex");

		ucNumDPMLevels.setDescription("number of valid dpm levels in this state; Driver uses it to calculate the whole size of the state: sizeof(ATOM_PPLIB_STATE_V2) + (ucNumDPMLevels - 1) * sizeof(UCHAR)");
		nonClockInfoIndex.setDescription("a index to the array of nonClockInfos");
		clockInfoIndex.setDescription("Driver will read the first ucNumDPMLevels in this array");
		
		super.fillSubListDescriptions();
	}

}
