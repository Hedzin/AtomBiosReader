package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_MM_DEPENDENCY_OBJECT extends AContainer {
	ByteStructure   ucVddcInd = new ByteStructure(); /* VDDC voltage */
	ShortStructure  usVddgfxOffset = new ShortStructure();/* Offset relative to VDDC voltage */
	LongStructure  ulDClk = new LongStructure();/* UVD D-clock */
	LongStructure  ulVClk = new LongStructure();/* UVD V-clock */
	LongStructure  ulEClk = new LongStructure();/* VCE clock */
	LongStructure  ulAClk = new LongStructure();/* ACP clock */
	LongStructure  ulSAMUClk = new LongStructure();/* SAMU clock */
	
	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(ucVddcInd);
		list.add(usVddgfxOffset);
		list.add(ulDClk);
		list.add(ulVClk);
		list.add(ulEClk);
		list.add(ulAClk);
		list.add(ulSAMUClk);
		return list;
	}
	@Override
	public void fillSubListDescriptions() {
		ucVddcInd.setName("ucVddcInd");
		ucVddcInd.setDescription("VDDC voltage");
		usVddgfxOffset.setName("usVddgfxOffset");
		usVddgfxOffset.setDescription("Offset relative to VDDC voltage");
		ulDClk.setName("ulDClk");
		ulDClk.setDescription("UVD D-clock");
		ulVClk.setName("ulVClk");
		ulVClk.setDescription("UVD V-clock");
		ulEClk.setName("ulEClk");
		ulEClk.setDescription("VCE clock");
		ulAClk.setName("ulAClk");
		ulAClk.setDescription("ACP clock");
		ulSAMUClk.setName("ulSAMUClk");
		ulSAMUClk.setDescription("SAMU clock");

		
		super.fillSubListDescriptions();
	}

}
