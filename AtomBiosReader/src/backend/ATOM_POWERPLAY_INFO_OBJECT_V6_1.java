package backend;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Stream;

public class ATOM_POWERPLAY_INFO_OBJECT_V6_1 extends ADynamicContainer  {
	ATOM_POWERPLAY_INFO_HEADER_V5 ppInfoHeader = new ATOM_POWERPLAY_INFO_HEADER_V5();
	ATOM_POWERPLAY_STATE_TABLE_V6 ppState = new ATOM_POWERPLAY_STATE_TABLE_V6();
	ATOM_POWERPLAY_CLOCK_INFO_TABLE ppClockInfo = new ATOM_POWERPLAY_CLOCK_INFO_TABLE();
	ATOM_POWERPLAY_NONCLOCK_INFO_TABLE ppNonClockInfo = new ATOM_POWERPLAY_NONCLOCK_INFO_TABLE();
	ATOM_POWERPLAY_FAN_TABLE  ppFan  = new ATOM_POWERPLAY_FAN_TABLE();
	ATOM_POWERPLAY_EXTENDEDHEADER ppExtHeader = new ATOM_POWERPLAY_EXTENDEDHEADER();
	ATOM_POWERPLAY_CLOCK_VOLTAGE_DEPENDENCY_TABLE ppSclkDependency = new ATOM_POWERPLAY_CLOCK_VOLTAGE_DEPENDENCY_TABLE();
	ATOM_POWERPLAY_CLOCK_VOLTAGE_DEPENDENCY_TABLE ppVddciDependencyOnMCLK = new ATOM_POWERPLAY_CLOCK_VOLTAGE_DEPENDENCY_TABLE();
	ATOM_POWERPLAY_CLOCK_VOLTAGE_DEPENDENCY_TABLE ppMclkDependency = new ATOM_POWERPLAY_CLOCK_VOLTAGE_DEPENDENCY_TABLE();
	ATOM_POWERPLAY_CAC_LEAKAGE_TABLE ppCacLeakage = new ATOM_POWERPLAY_CAC_LEAKAGE_TABLE();
	ATOM_POWERPLAY_PHASESHEDDING_LIMITS_TABLE ppPhaseSheddingLimits = new ATOM_POWERPLAY_PHASESHEDDING_LIMITS_TABLE();
	ATOM_POWERPLAY_VCE_TABLE_V6_1 ppVceState =  new ATOM_POWERPLAY_VCE_TABLE_V6_1();
	ATOM_POWERPLAY_UVD_TABLE_V6_1 ppUvdTable =  new ATOM_POWERPLAY_UVD_TABLE_V6_1();
	ATOM_POWERPLAY_ACP_TABLE_V6_1 ppAcpTable  =  new ATOM_POWERPLAY_ACP_TABLE_V6_1();
	ATOM_POWERPLAY_SAM_TABLE_V6_1 ppSamTable  =  new ATOM_POWERPLAY_SAM_TABLE_V6_1();
	ATOM_POWERPLAY_POWERTUNE_TABLE_V2 ppPowerTune  =  new ATOM_POWERPLAY_POWERTUNE_TABLE_V2();
	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(ppInfoHeader);
		if(ppInfoHeader.getBinaryDataBlock()!=null){
			ppState.offsetBased =  true;
			ppClockInfo.offsetBased =  true;
			ppNonClockInfo.offsetBased =  true;
			ppFan.offsetBased =  true;
			ppExtHeader.offsetBased =  true;
			ppSclkDependency.offsetBased =  true;
			ppVddciDependencyOnMCLK.offsetBased =  true;
			ppMclkDependency.offsetBased =  true;
			ppCacLeakage.offsetBased =  true;
			ppPhaseSheddingLimits.offsetBased =  true;
			ppVceState.offsetBased =  true;
			ppUvdTable.offsetBased =  true;
			ppAcpTable.offsetBased =  true;
			ppSamTable.offsetBased =  true;
			ppPowerTune.offsetBased =  true;
			
			int usStateArrayOffset = ppInfoHeader.basicTable4.basicTable3.basicTable2.basicTable.usStateArrayOffset.getBinaryDataBlock().getIntegerLE();
			int usClockInfoArrayOffset = ppInfoHeader.basicTable4.basicTable3.basicTable2.basicTable.usClockInfoArrayOffset.getBinaryDataBlock().getIntegerLE();
			int usNonClockInfoArrayOffset = ppInfoHeader.basicTable4.basicTable3.basicTable2.basicTable.usNonClockInfoArrayOffset.getBinaryDataBlock().getIntegerLE();
			int usFanTableOffset = ppInfoHeader.basicTable4.basicTable3.usFanTableOffset.getBinaryDataBlock().getIntegerLE();
			int usExtendendedHeaderOffset = ppInfoHeader.basicTable4.basicTable3.usExtendendedHeaderOffset.getBinaryDataBlock().getIntegerLE();
			int usVddcDependencyOnSCLKOffset = ppInfoHeader.basicTable4.usVddcDependencyOnSCLKOffset.getBinaryDataBlock().getIntegerLE();
			int usVddciDependencyOnMCLKOffset = ppInfoHeader.basicTable4.usVddciDependencyOnMCLKOffset.getBinaryDataBlock().getIntegerLE();
			int usVddcDependencyOnMCLKOffset = ppInfoHeader.basicTable4.usVddcDependencyOnMCLKOffset.getBinaryDataBlock().getIntegerLE();
			int usCACLeakageTableOffset = ppInfoHeader.usCACLeakageTableOffset.getBinaryDataBlock().getIntegerLE();
			int usVddcPhaseShedLimitsTableOffset = ppInfoHeader.basicTable4.usVddcPhaseShedLimitsTableOffset.getBinaryDataBlock().getIntegerLE();

			
			
			int usMaxClockVoltageOnDCOffset = ppInfoHeader.basicTable4.usMaxClockVoltageOnDCOffset.getBinaryDataBlock().getIntegerLE();
			int usMvddDependencyOnMCLKOffset = ppInfoHeader.basicTable4.usMvddDependencyOnMCLKOffset.getBinaryDataBlock().getIntegerLE();

			
			checkIsValuePositive(usStateArrayOffset,"usStateArrayOffset",true);
			checkIsValuePositive(usClockInfoArrayOffset,"usClockInfoArrayOffset",true);
			checkIsValuePositive(usNonClockInfoArrayOffset,"usNonClockInfoArrayOffset",true);
			checkIsValuePositive(usFanTableOffset,"usFanTableOffset",true);
			checkIsValuePositive(usExtendendedHeaderOffset,"usExtendendedHeaderOffset",true);
			checkIsValuePositive(usVddcDependencyOnSCLKOffset,"usVddcDependencyOnSCLKOffset",true);
			checkIsValuePositive(usVddciDependencyOnMCLKOffset,"usVddciDependencyOnMCLKOffset",true);
			checkIsValuePositive(usVddcDependencyOnMCLKOffset,"usVddcDependencyOnMCLKOffset",true);
			checkIsValuePositive(usCACLeakageTableOffset,"usCACLeakageTableOffset",true);
			checkIsValuePositive(usVddcPhaseShedLimitsTableOffset,"usVddcPhaseShedLimitsTableOffset",true);
			
			checkIsValuePositive(usMaxClockVoltageOnDCOffset,"usMaxClockVoltageOnDCOffset",false);
			checkIsValuePositive(usMvddDependencyOnMCLKOffset,"usMvddDependencyOnMCLKOffset",false);

			

			
			ppState.offsetPosition = usStateArrayOffset-4;
			ppClockInfo.offsetPosition = usClockInfoArrayOffset-4;
			ppNonClockInfo.offsetPosition = usNonClockInfoArrayOffset-4;
			ppFan.offsetPosition = usFanTableOffset-4;
			ppExtHeader.offsetPosition = usExtendendedHeaderOffset-4;
			ppSclkDependency.offsetPosition = usVddcDependencyOnSCLKOffset-4;
			ppVddciDependencyOnMCLK.offsetPosition = usVddciDependencyOnMCLKOffset-4;
			ppMclkDependency.offsetPosition = usVddcDependencyOnMCLKOffset-4;
			ppCacLeakage.offsetPosition = usCACLeakageTableOffset-4;
			ppPhaseSheddingLimits.offsetPosition = usVddcPhaseShedLimitsTableOffset-4;
			
			
			
			list.add(ppState);
			list.add(ppClockInfo);
			list.add(ppNonClockInfo);
			list.add(ppFan);
			list.add(ppExtHeader);
			list.add(ppSclkDependency);
			list.add(ppVddciDependencyOnMCLK);
			list.add(ppMclkDependency);
			list.add(ppCacLeakage);
			list.add(ppPhaseSheddingLimits);
/*
				

					
			list.add(ppCacLeakage);
			list.add(ppCacLeakage);
			list.add(ppCacLeakage);
			list.add(ppCacLeakage);
			list.add(ppCacLeakage);
			list.add(ppCacLeakage);
*/
			if(usExtendendedHeaderOffset!= 0) enableThirdPass();
			if(ppExtHeader.getBinaryDataBlock()!=null){

				int  usVCETableOffset = ppExtHeader.usVCETableOffset.getBinaryDataBlock().getIntegerLE();
			    int  usUVDTableOffset = ppExtHeader.usUVDTableOffset.getBinaryDataBlock().getIntegerLE();
			    int  usACPTableOffset = ppExtHeader.usACPTableOffset.getBinaryDataBlock().getIntegerLE();
			    int  usSAMUTableOffset = ppExtHeader.usSAMUTableOffset.getBinaryDataBlock().getIntegerLE();
			    int  usPowerTuneTableOffset = ppExtHeader.usPowerTuneTableOffset.getBinaryDataBlock().getIntegerLE();

			    
			    int  usPPMTableOffset = ppExtHeader.usPPMTableOffset.getBinaryDataBlock().getIntegerLE();
			    int  usSclkVddgfxTableOffset = ppExtHeader.usSclkVddgfxTableOffset.getBinaryDataBlock().getIntegerLE();

			    
			    
				checkIsValuePositive(usVCETableOffset,"usVCETableOffset",true);
				checkIsValuePositive(usUVDTableOffset,"usUVDTableOffset",true);
				checkIsValuePositive(usACPTableOffset,"usACPTableOffset",true);
				checkIsValuePositive(usSAMUTableOffset,"usSAMUTableOffset",true);
				checkIsValuePositive(usPowerTuneTableOffset,"usPowerTuneTableOffset",true);

				checkIsValuePositive(usPPMTableOffset,"usPPMTableOffset",false);
				checkIsValuePositive(usSclkVddgfxTableOffset,"usSclkVddgfxTableOffset",false);

			    
			    
			    
			    ppVceState.offsetPosition = usVCETableOffset-4;
			    ppUvdTable.offsetPosition = usUVDTableOffset-4;
			    ppAcpTable.offsetPosition = usACPTableOffset-4;
			    ppSamTable.offsetPosition = usSAMUTableOffset-4;
			    ppPowerTune.offsetPosition = usPowerTuneTableOffset-4;
			    
			    list.add(ppVceState);
			    list.add(ppUvdTable);
			    list.add(ppSamTable);
			    list.add(ppAcpTable);
			    list.add(ppPowerTune);
			    
			    

			    
			}
			
			
		}
		return list;
	}
	@Override
	public void fillSubListDescriptions() {
		ppInfoHeader.setName("ATOM_POWERPLAY_HEADER");
		ppState.setName("ATOM_POWERPLAY_STATE_TABLE");
		ppClockInfo.setName("ATOM_POWERPLAY_CLOCK_INFO_TABLE");
		ppNonClockInfo.setName("ATOM_POWERPLAY_NONCLOCK_INFO_TABLE");
		ppFan.setName("ATOM_POWERPLAY_FAN_TABLE");
		ppExtHeader.setName("ATOM_POWERPLAY_EXTENDEDHEADER");
		ppSclkDependency.setName("ATOM_POWERPLAY_SCLK_DEPENDENCY_TABLE");
		ppVddciDependencyOnMCLK.setName("ATOM_POWERPLAY_VDDCI_MCLK_DEPENDENCY_TABLE");
		ppMclkDependency.setName("ATOM_POWERPLAY_MCLK_DEPENDENCY_TABLE");
		ppCacLeakage.setName("ATOM_POWERPLAY_CAC_LEAKAGE_TABLE");
		ppPhaseSheddingLimits.setName("ATOM_POWERPLAY_PHASESHEDDING_LIMITS_TABLE");
		ppVceState.setName("ATOM_POWERPLAY_VCE_TABLE");
		ppUvdTable.setName("ATOM_POWERPLAY_UVD_TABLE");
		ppAcpTable.setName("ATOM_POWERPLAY_ACP_TABLE");
		ppSamTable.setName("ATOM_POWERPLAY_SAM_TABLE");
		ppPowerTune.setName("ATOM_POWERPLAY_POWERTUNE_TABLE");
		/*ppVoltageLookup.setName("ATOM_POWERPLAY_VOLTAGE_LOOKUP_TABLE");
		ppVddgfxLookup.setName("ATOM_POWERPLAY_VDDGFX_LOOKUP_TABLE");
		ppSclkDependency.setName("ATOM_POWERPLAY_SCLK_DEPENDENCY_TABLE");
		
		ppMmDependency.setName("ATOM_POWERPLAY_MM_DEPENDENCY_TABLE");
		ppTermalController.setName("ATOM_POWERPLAY_THERMAL_CONTROLLER_TABLE_V1");
		
		
		
		ppPCIE.setName("ATOM_POWERPLAY_PCIE_TABLE");
		*/super.fillSubListDescriptions();
	}
	
	public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
		Map<K, V> result = new LinkedHashMap<>();
		Stream<Entry<K, V>> st = map.entrySet().stream();
		st.sorted(Comparator.comparing(e -> e.getValue())).forEachOrdered(e -> result.put(e.getKey(), e.getValue()));
		return result;
	}
}


