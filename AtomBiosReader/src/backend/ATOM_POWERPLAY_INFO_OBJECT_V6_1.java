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
	ATOM_POWERPLAY_FAN_TABLE_V5  ppFan  = new ATOM_POWERPLAY_FAN_TABLE_V5();
	ATOM_POWERPLAY_EXTENDEDHEADER ppExtHeader = new ATOM_POWERPLAY_EXTENDEDHEADER();
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
			
			
			int usStateArrayOffset = ppInfoHeader.basicTable4.basicTable3.basicTable2.basicTable.usStateArrayOffset.getBinaryDataBlock().getIntegerLE();
			int usClockInfoArrayOffset = ppInfoHeader.basicTable4.basicTable3.basicTable2.basicTable.usClockInfoArrayOffset.getBinaryDataBlock().getIntegerLE();
			int usNonClockInfoArrayOffset = ppInfoHeader.basicTable4.basicTable3.basicTable2.basicTable.usNonClockInfoArrayOffset.getBinaryDataBlock().getIntegerLE();
			int usFanTableOffset = ppInfoHeader.basicTable4.basicTable3.usFanTableOffset.getBinaryDataBlock().getIntegerLE();

			int usExtendendedHeaderOffset = ppInfoHeader.basicTable4.basicTable3.usExtendendedHeaderOffset.getBinaryDataBlock().getIntegerLE();
			int usVddcDependencyOnSCLKOffset = ppInfoHeader.basicTable4.usVddcDependencyOnSCLKOffset.getBinaryDataBlock().getIntegerLE();
			int usVddciDependencyOnMCLKOffset = ppInfoHeader.basicTable4.usVddciDependencyOnMCLKOffset.getBinaryDataBlock().getIntegerLE();
			int usVddcDependencyOnMCLKOffset = ppInfoHeader.basicTable4.usVddcDependencyOnMCLKOffset.getBinaryDataBlock().getIntegerLE();
			int usMaxClockVoltageOnDCOffset = ppInfoHeader.basicTable4.usMaxClockVoltageOnDCOffset.getBinaryDataBlock().getIntegerLE();
			int usVddcPhaseShedLimitsTableOffset = ppInfoHeader.basicTable4.usVddcPhaseShedLimitsTableOffset.getBinaryDataBlock().getIntegerLE();
			int usMvddDependencyOnMCLKOffset = ppInfoHeader.basicTable4.usMvddDependencyOnMCLKOffset.getBinaryDataBlock().getIntegerLE();
			int usCACLeakageTableOffset = ppInfoHeader.usCACLeakageTableOffset.getBinaryDataBlock().getIntegerLE();

			
			ppState.offsetPosition = usStateArrayOffset-4;
			ppClockInfo.offsetPosition = usClockInfoArrayOffset-4;
			ppNonClockInfo.offsetPosition = usNonClockInfoArrayOffset-4;
			ppFan.offsetPosition = usFanTableOffset-4;
			ppExtHeader.offsetPosition = usExtendendedHeaderOffset-4;
			list.add(ppState);
			list.add(ppClockInfo);
			list.add(ppNonClockInfo);
			list.add(ppFan);
			list.add(ppExtHeader);
		}
		return list;
	}
	@Override
	public void fillSubListDescriptions() {
		ppInfoHeader.setName("ATOM_POWERPLAY_HEADER_V5");
		ppState.setName("ATOM_POWERPLAY_STATE_TABLE");
		ppClockInfo.setName("ATOM_POWERPLAY_CLOCK_INFO_TABLE");
		ppNonClockInfo.setName("ATOM_POWERPLAY_NONCLOCK_INFO_TABLE");
		ppFan.setName("ATOM_POWERPLAY_FAN_TABLE_V5");
		ppExtHeader.setName("ATOM_POWERPLAY_EXTENDEDHEADER");
		/*ppVoltageLookup.setName("ATOM_POWERPLAY_VOLTAGE_LOOKUP_TABLE");
		ppVddgfxLookup.setName("ATOM_POWERPLAY_VDDGFX_LOOKUP_TABLE");
		ppSclkDependency.setName("ATOM_POWERPLAY_SCLK_DEPENDENCY_TABLE");
		ppMclkDependency.setName("ATOM_POWERPLAY_MCLK_DEPENDENCY_TABLE");
		ppMmDependency.setName("ATOM_POWERPLAY_MM_DEPENDENCY_TABLE");
		ppTermalController.setName("ATOM_POWERPLAY_THERMAL_CONTROLLER_TABLE_V1");
		
		ppPowerTune.setName("ATOM_POWERPLAY_POWERTUNE_TABLE_V2");
		ppVceState.setName("ATOM_POWERPLAY_VCE_STATE_TABLE");
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


