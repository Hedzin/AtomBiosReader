package backend;
import java.util.ArrayList;
import java.util.List;

public class ATOM_GPIO_VOLTAGE_OBJECT_V3 extends ADynamicContainer {
	   ATOM_VOLTAGE_OBJECT_HEADER_V3 sHeader =  new ATOM_VOLTAGE_OBJECT_HEADER_V3();   // voltage mode = VOLTAGE_OBJ_GPIO_LUT or VOLTAGE_OBJ_PHASE_LUT
	   ByteStructure    ucVoltageGpioCntlId =  new ByteStructure();         // default is 0 which indicate control through CG VID mode 
	   ByteStructure    ucGpioEntryNum =  new ByteStructure();              // indiate the entry numbers of Votlage/Gpio value Look up table
	   ByteStructure    ucPhaseDelay =  new ByteStructure();                // phase delay in unit of micro second
	   ByteStructure    ucReserved =  new ByteStructure();   
	   LongStructure    ulGpioMaskVal =  new LongStructure();               // GPIO Mask value
	   VOLTAGE_LUT_ENTRY_V2 asVolGpioLut1 =  new VOLTAGE_LUT_ENTRY_V2();
	   VOLTAGE_LUT_ENTRY_V2 asVolGpioLut2 =  new VOLTAGE_LUT_ENTRY_V2();
	   VOLTAGE_LUT_ENTRY_V2 asVolGpioLut3 =  new VOLTAGE_LUT_ENTRY_V2();
	   VOLTAGE_LUT_ENTRY_V2 asVolGpioLut4 =  new VOLTAGE_LUT_ENTRY_V2();
	   VOLTAGE_LUT_ENTRY_V2 asVolGpioLut5 =  new VOLTAGE_LUT_ENTRY_V2();
	   VOLTAGE_LUT_ENTRY_V2 asVolGpioLut6=  new VOLTAGE_LUT_ENTRY_V2();
	   VOLTAGE_LUT_ENTRY_V2 asVolGpioLut7 =  new VOLTAGE_LUT_ENTRY_V2();
	   VOLTAGE_LUT_ENTRY_V2 asVolGpioLut8 =  new VOLTAGE_LUT_ENTRY_V2();
		@Override
		public List<IStructure> getSubStructureList() {
			System.out.println("ATOM_GPIO_VOLTAGE_OBJECT_V3 getSubStructureList()");
			List<IStructure> list = new  ArrayList<IStructure>();
			list.add(sHeader);
			list.add(ucVoltageGpioCntlId);
			list.add(ucGpioEntryNum);
			list.add(ucPhaseDelay);
			list.add(ucReserved);
			list.add(ulGpioMaskVal);
			if(ucGpioEntryNum.getBinaryDataBlock()!=null){
				int ucGpioEntrycount = ucGpioEntryNum.getBinaryDataBlock().getIntegerLE();
				System.out.println("ATOM_GPIO_VOLTAGE_OBJECT_V3 ucGpioEntrycount: "+ucGpioEntrycount);
				switch (ucGpioEntrycount) {
				case 8:	list.add(asVolGpioLut8);
				case 7:	list.add(asVolGpioLut7);	
				case 6:	list.add(asVolGpioLut6);
				case 5:	list.add(asVolGpioLut5);
				case 4:	list.add(asVolGpioLut4);
				case 3:	list.add(asVolGpioLut3);
				case 2:	list.add(asVolGpioLut2);
				case 1:	list.add(asVolGpioLut1);
				default:
					break;
				}
			}
			return list;
		}
		@Override
		public void fillSubListDescriptions() {
			    sHeader.setName("ATOM_VOLTAGE_OBJECT_HEADER_V3");
			    sHeader.setDescription("voltage mode = VOLTAGE_OBJ_GPIO_LUT or VOLTAGE_OBJ_PHASE_LUT");
			       ucVoltageGpioCntlId.setName("VoltageGpioCntlId");  
			       ucVoltageGpioCntlId.setDescription("default is 0 which indicate control through CG VID mode");
			       ucGpioEntryNum .setName("GpioEntryNum");        
			       ucGpioEntryNum.setDescription("indicate the entry numbers of Votlage/Gpio value Look up table");
			       ucPhaseDelay.setName("PhaseDelay");          
			       ucPhaseDelay.setDescription("phase delay in unit of micro second");
			       ucReserved.setName("Reserved");  
			       ulGpioMaskVal.setName("GpioMaskVal"); 
			       ulGpioMaskVal.setDescription("GPIO Mask value");
			    asVolGpioLut1.setName("VOLTAGE_LUT_ENTRY1_V2");
			    asVolGpioLut2.setName("VOLTAGE_LUT_ENTRY2_V2");
			    asVolGpioLut3.setName("VOLTAGE_LUT_ENTRY3_V2");
			    asVolGpioLut4.setName("VOLTAGE_LUT_ENTRY4_V2");
			    asVolGpioLut5.setName("VOLTAGE_LUT_ENTRY5_V2");
			    asVolGpioLut6.setName("VOLTAGE_LUT_ENTRY6_V2");
			    asVolGpioLut7.setName("VOLTAGE_LUT_ENTRY7_V2");
			    asVolGpioLut8.setName("VOLTAGE_LUT_ENTRY8_V2");

			super.fillSubListDescriptions();
		}
}
