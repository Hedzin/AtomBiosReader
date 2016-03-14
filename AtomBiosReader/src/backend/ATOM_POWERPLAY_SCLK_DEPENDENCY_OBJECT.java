package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_SCLK_DEPENDENCY_OBJECT extends AContainer {

	ByteStructure  ucVddInd = new ByteStructure();/* Base voltage */
	ShortStructure usVddcOffset = new ShortStructure();/* Offset relative to base voltage */
	LongStructure ulSclk = new LongStructure();
	ShortStructure usEdcCurrent = new ShortStructure();
	ByteStructure  ucReliabilityTemperature = new ByteStructure();
	ByteStructure  ucCKSVOffsetandDisable = new ByteStructure();  /* Bits 0~6: Voltage offset for CKS, Bit 7: Disable/enable for the SCLK level. */
	


	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(ucVddInd);
		list.add(usVddcOffset);
		list.add(ulSclk);
		list.add(usEdcCurrent);
		list.add(ucReliabilityTemperature);
		list.add(ucCKSVOffsetandDisable);
		return list;
	}
	@Override
	public void fillSubListDescriptions() {
		ucVddInd.setName("ucVddInd");
		ucVddInd.setDescription("Base voltage");

		usVddcOffset.setName("usVddcOffset");
		usVddcOffset.setDescription("Offset relative to base voltage");

		ulSclk.setName("ulSclk");
		usEdcCurrent.setName("usEdcCurrent");
		ucReliabilityTemperature.setName("ucReliabilityTemperature");
		
		ucCKSVOffsetandDisable.setName("ucCKSVOffsetandDisable");
		ucCKSVOffsetandDisable.setDescription("Bits 0~6: Voltage offset for CKS, Bit 7: Disable/enable for the SCLK level.");

		super.fillSubListDescriptions();
	}

}
