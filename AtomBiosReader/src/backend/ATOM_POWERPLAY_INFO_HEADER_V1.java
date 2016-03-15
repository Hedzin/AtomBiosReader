package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_INFO_HEADER_V1 extends AContainer{
    ByteStructure ucDataRevision = new ByteStructure();
    ByteStructure ucNumStates = new ByteStructure();
    ByteStructure ucStateEntrySize = new ByteStructure();
    ByteStructure ucClockInfoSize = new ByteStructure();
    ByteStructure ucNonClockSize = new ByteStructure();
    ShortStructure usStateArrayOffset = new ShortStructure();  // offset from start of this table to array of ucNumStates ATOM_PPLIB_STATE structures
    ShortStructure usClockInfoArrayOffset = new ShortStructure(); // offset from start of this table to array of ASIC-specific structures,currently ATOM_PPLIB_CLOCK_INFO.
    ShortStructure usNonClockInfoArrayOffset = new ShortStructure(); // offset from start of this table to array of ATOM_PPLIB_NONCLOCK_INFO
    ShortStructure usBackbiasTime = new ShortStructure();  // in microseconds
    ShortStructure usVoltageTime = new ShortStructure();// in microseconds
    ShortStructure usTableSize = new ShortStructure();//the size of this structure, or the extended structure
    LongStructure ulPlatformCaps = new LongStructure(); // See ATOM_PPLIB_CAPS_*
    ATOM_POWERPLAY_THERMAL_CONTROLLER_OBJECT_V1  sThermalController   = new ATOM_POWERPLAY_THERMAL_CONTROLLER_OBJECT_V1();
    ShortStructure usBootClockInfoOffset = new ShortStructure();
    ShortStructure usBootNonClockInfoOffset = new ShortStructure();
	
	
	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();

		list.add(ucDataRevision);
		list.add(ucNumStates);
		list.add(ucStateEntrySize);
		list.add(ucClockInfoSize);
		list.add(ucNonClockSize);
		list.add(usStateArrayOffset);
		list.add(usClockInfoArrayOffset);
		list.add(usNonClockInfoArrayOffset);
		list.add(usBackbiasTime);
		list.add(usVoltageTime);
		list.add(usTableSize);
		list.add(ulPlatformCaps);
		list.add(sThermalController);
		list.add(usBootClockInfoOffset);
		list.add(usBootNonClockInfoOffset);
		
		return list;
	}
	
	@Override
	public void fillSubListDescriptions() {

		ucDataRevision.setName("ucDataRevision");
		ucNumStates.setName("ucNumStates");
		ucStateEntrySize.setName("ucStateEntrySize");
		ucClockInfoSize.setName("ucClockInfoSize");
		ucNonClockSize.setName("ucNonClockSize");
		usStateArrayOffset.setName("usStateArrayOffset");
		usClockInfoArrayOffset.setName("usClockInfoArrayOffset");
		usNonClockInfoArrayOffset.setName("usNonClockInfoArrayOffset");
		usBackbiasTime.setName("usBackbiasTime");
		usVoltageTime.setName("usVoltageTime");
		usTableSize.setName("usTableSize");
		ulPlatformCaps.setName("ulPlatformCaps");
		sThermalController.setName("sThermalController");
		usBootClockInfoOffset.setName("usBootClockInfoOffset");
		usBootNonClockInfoOffset.setName("usBootNonClockInfoOffset");
		
		
	     usStateArrayOffset.setDescription("offset from start of this table to array of ucNumStates ATOM_PPLIB_STATE structures"); // 
	     usClockInfoArrayOffset.setDescription("offset from start of this table to array of ASIC-specific structures,currently ATOM_PPLIB_CLOCK_INFO."); // 
	     usNonClockInfoArrayOffset.setDescription("offset from start of this table to array of ATOM_PPLIB_NONCLOCK_INFO"); // 
	     usBackbiasTime.setDescription("in microseconds");  // 
	     usVoltageTime.setDescription("in microseconds");// 
	     usTableSize.setDescription("the size of this structure, or the extended structure");//
	     ulPlatformCaps.setDescription(" See ATOM_PPLIB_CAPS_*");//
		
		
		
		super.fillSubListDescriptions();
	}
}
