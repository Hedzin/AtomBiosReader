package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_VCE_STATE_OBJECT extends AContainer {
	
	ByteStructure  ucVCEClockIndex = new ByteStructure();	/*index into usVCEDependencyTableOffset of 'ATOM_Tonga_MM_Dependency_Table' type */
	ByteStructure  ucFlag = new ByteStructure();/* 2 bits indicates memory p-states */
	ByteStructure  ucSCLKIndex = new ByteStructure();/*index into ATOM_Tonga_SCLK_Dependency_Table */
	ByteStructure  ucMCLKIndex = new ByteStructure();/*index into ATOM_Tonga_MCLK_Dependency_Table */
	
	
	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(ucVCEClockIndex);
		list.add(ucFlag);
		list.add(ucSCLKIndex);
		list.add(ucMCLKIndex);

		return list;
	}
	@Override
	public void fillSubListDescriptions() {
		ucVCEClockIndex.setName("ucVCEClockIndex");
		ucVCEClockIndex.setDescription("index into VCEDependencyTableOffset of 'MM_Dependency_Table' type");
		ucFlag.setName("ucFlag");
		ucFlag.setDescription("2 bits indicates memory p-states");
		ucSCLKIndex.setName("ucSCLKIndex");
		ucSCLKIndex.setDescription("index into SCLK_Dependency_Table");
		ucMCLKIndex.setName("ucMCLKIndex");
		ucMCLKIndex.setDescription("index into ATOM_Tonga_MCLK_Dependency_Table");


		
		super.fillSubListDescriptions();
	}

}
