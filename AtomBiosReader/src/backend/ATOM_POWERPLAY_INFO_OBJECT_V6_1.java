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
	
	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(ppInfoHeader);
		if(ppInfoHeader.getBinaryDataBlock()!=null){
			HashMap<IStructure, Integer> map = new HashMap<IStructure, Integer>();
			
			/*
		    usClockInfoArrayOffset  // offset from start of this table to array of ASIC-specific structures,currently ATOM_PPLIB_CLOCK_INFO.
		    usNonClockInfoArrayOffset // offset from start of this table to array of ATOM_PPLIB_NONCLOCK_INFO
		    usBootClockInfoOffset 
		    usBootNonClockInfoOffset 
			*/
			
			int usStateArrayOffset = ppInfoHeader.basicTable4.basicTable3.basicTable2.basicTable.usStateArrayOffset.getBinaryDataBlock().getIntegerLE();  //"points to ATOM_Tonga_State_Array");
			map.put(ppState, usStateArrayOffset);
			/*int usFanTableOffset = ppInfoHeader.usFanTableOffset.getBinaryDataBlock().getIntegerLE();   //"points to ATOM_Tonga_Fan_Table");
			map.put(ppFan, usFanTableOffset);
			int usThermalControllerOffset = ppInfoHeader.usThermalControllerOffset.getBinaryDataBlock().getIntegerLE();   //"points to ATOM_Tonga_Thermal_Controller");
			map.put(ppTermalController, usThermalControllerOffset);
			int usMclkDependencyTableOffset = ppInfoHeader.usMclkDependencyTableOffset.getBinaryDataBlock().getIntegerLE();   //"points to ATOM_Tonga_MCLK_Dependency_Table");
			map.put(ppMclkDependency, usMclkDependencyTableOffset);
			int usSclkDependencyTableOffset = ppInfoHeader.usSclkDependencyTableOffset.getBinaryDataBlock().getIntegerLE();   //"points to ATOM_Tonga_SCLK_Dependency_Table");
			map.put(ppSclkDependency, usSclkDependencyTableOffset);
			int usVddcLookupTableOffset = ppInfoHeader.usVddcLookupTableOffset.getBinaryDataBlock().getIntegerLE();   //"points to ATOM_Tonga_Voltage_Lookup_Table");
			map.put(ppVoltageLookup, usVddcLookupTableOffset);
			int usVddgfxLookupTableOffset = ppInfoHeader.usVddgfxLookupTableOffset.getBinaryDataBlock().getIntegerLE();   //"points to ATOM_Tonga_Voltage_Lookup_Table");
			map.put(ppVddgfxLookup, usVddgfxLookupTableOffset);
			int usMMDependencyTableOffset = ppInfoHeader.usMMDependencyTableOffset.getBinaryDataBlock().getIntegerLE();   //"points to ATOM_Tonga_MM_Dependency_Table");
			map.put(ppMmDependency, usMMDependencyTableOffset);
			int usVCEStateTableOffset = ppInfoHeader.usVCEStateTableOffset.getBinaryDataBlock().getIntegerLE();   //"points to ATOM_Tonga_VCE_State_Table");
			map.put(ppVceState, usVCEStateTableOffset);
//			int usPPMTableOffset = ppInfoHeader.usPPMTableOffset.getBinaryDataBlock().getIntegerLE();   //"points to ATOM_Tonga_PPM_Table");
//			map.put(ppFan, usPPMTableOffset);
			int usPowerTuneTableOffset = ppInfoHeader.usPowerTuneTableOffset.getBinaryDataBlock().getIntegerLE();   //"points to ATOM_PowerTune_Table");
			map.put(ppPowerTune, usPowerTuneTableOffset);
//			int usHardLimitTableOffset = ppInfoHeader.usHardLimitTableOffset.getBinaryDataBlock().getIntegerLE();   //"points to ATOM_Tonga_Hard_Limit_Table");
//			map.put(ppFan, usHardLimitTableOffset);
			int usPCIETableOffset = ppInfoHeader.usPCIETableOffset.getBinaryDataBlock().getIntegerLE();   //"points to ATOM_Tonga_PCIE_Table");
			map.put(ppPCIE, usPCIETableOffset);
//			int usGPIOTableOffset = ppInfoHeader.usGPIOTableOffset.getBinaryDataBlock().getIntegerLE();  //"points to ATOM_Tonga_GPIO_Table");
//			map.put(ppFan, usGPIOTableOffset);
			*/
			Map<IStructure, Integer> newMap = sortByValue(map);
			Set<Entry<IStructure, Integer>> set = newMap.entrySet();
			for (Entry<IStructure, Integer> entry : set) {
				list.add(entry.getKey());
			}
		}
		return list;
	}
	@Override
	public void fillSubListDescriptions() {
		ppInfoHeader.setName("ATOM_POWERPLAY_HEADER_V5");
		ppState.setName("ATOM_POWERPLAY_STATE_TABLE");
		/*ppVoltageLookup.setName("ATOM_POWERPLAY_VOLTAGE_LOOKUP_TABLE");
		ppVddgfxLookup.setName("ATOM_POWERPLAY_VDDGFX_LOOKUP_TABLE");
		ppSclkDependency.setName("ATOM_POWERPLAY_SCLK_DEPENDENCY_TABLE");
		ppMclkDependency.setName("ATOM_POWERPLAY_MCLK_DEPENDENCY_TABLE");
		ppMmDependency.setName("ATOM_POWERPLAY_MM_DEPENDENCY_TABLE");
		ppTermalController.setName("ATOM_POWERPLAY_THERMAL_CONTROLLER_TABLE_V1");
		ppFan.setName("ATOM_POWERPLAY_FAN_TABLE_V5");
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


