package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_MCLK_DEPENDENCY_OBJECT extends AContainer {
	ByteStructure  ucVddcInd = new ByteStructure();/* Vddc voltage */
	ShortStructure usVddci = new ShortStructure();
	ShortStructure usVddgfxOffset = new ShortStructure();/* Offset relative to Vddc voltage */
	ShortStructure usMvdd = new ShortStructure();
	LongStructure ulMclk = new LongStructure();
	ShortStructure usReserved = new ShortStructure();
	


	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(ucVddcInd);
		list.add(usVddci);
		list.add(usVddgfxOffset);
		list.add(usMvdd);
		list.add(ulMclk);
		list.add(usReserved);
		return list;
	}
	@Override
	public void fillSubListDescriptions() {
		ucVddcInd.setName("ucVddcInd");
		ucVddcInd.setDescription("Vddc voltage");

		usVddci.setName("usVddci");
		usVddgfxOffset.setName("usVddgfxOffset");
		usVddgfxOffset.setDescription("Offset relative to Vddc voltage");

		usMvdd.setName("usMvdd");
		ulMclk.setName("ulMclk");
		
		usReserved.setName("usReserved");

		super.fillSubListDescriptions();
	}

}
