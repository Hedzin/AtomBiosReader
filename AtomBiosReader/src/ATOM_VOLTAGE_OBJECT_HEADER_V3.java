import java.util.ArrayList;
import java.util.List;

public class ATOM_VOLTAGE_OBJECT_HEADER_V3 extends AContainer {
	
	
	/*
	  	// ATOM_VOLTAGE_OBJECT_HEADER_V3.ucVoltageMode
		#define VOLTAGE_OBJ_GPIO_LUT                 0        //VOLTAGE and GPIO Lookup table ->ATOM_GPIO_VOLTAGE_OBJECT_V3
		#define VOLTAGE_OBJ_VR_I2C_INIT_SEQ          3        //VOLTAGE REGULATOR INIT sequece through I2C -> ATOM_I2C_VOLTAGE_OBJECT_V3
		#define VOLTAGE_OBJ_PHASE_LUT                4        //Set Vregulator Phase lookup table ->ATOM_GPIO_VOLTAGE_OBJECT_V3
		#define VOLTAGE_OBJ_SVID2                    7        //Indicate voltage control by SVID2 ->ATOM_SVID2_VOLTAGE_OBJECT_V3
		#define VOLTAGE_OBJ_EVV                      8
		#define VOLTAGE_OBJ_PWRBOOST_LEAKAGE_LUT     0x10     //Powerboost Voltage and LeakageId lookup table->ATOM_LEAKAGE_VOLTAGE_OBJECT_V3
		#define VOLTAGE_OBJ_HIGH_STATE_LEAKAGE_LUT   0x11     //High voltage state Voltage and LeakageId lookup table->ATOM_LEAKAGE_VOLTAGE_OBJECT_V3
		#define VOLTAGE_OBJ_HIGH1_STATE_LEAKAGE_LUT  0x12     //High1 voltage state Voltage and LeakageId lookup table->ATOM_LEAKAGE_VOLTAGE_OBJECT_V3
	 *
		//ucVoltageType
		#define VOLTAGE_TYPE_VDDC                    1
		#define VOLTAGE_TYPE_MVDDC                   2
		#define VOLTAGE_TYPE_MVDDQ                   3
		#define VOLTAGE_TYPE_VDDCI                   4
		#define VOLTAGE_TYPE_VDDGFX                  5
		#define VOLTAGE_TYPE_PCC                     6
	 */
	ByteStructure		ucVoltageType = new ByteStructure();;									//Indicate Voltage Source: VDDC, MVDDC, MVDDQ or MVDDCI	 
	ByteStructure		ucVoltageMode = new ByteStructure();;							    //Indicate voltage control mode: Init/Set/Leakage/Set phase 
	 ShortStructure		usSize = new ShortStructure();;													//Size of Object
	 StructureDataType dataType = StructureDataType.container; 
	 StructureType type = StructureType.finale; 
	 
		@Override
		public int getLength() {
			int length = 4;

			return length;
		}
		@Override
		public List<IStructure> getSubStructureList() {
			List<IStructure> list = new  ArrayList<IStructure>();
			list.add(ucVoltageType);
			list.add(ucVoltageMode);
			list.add(usSize);
			return list;
		}
		public ATOM_VOLTAGE_OBJECT_HEADER_V3( BinaryDataBlock binDataBlock) {
			super.subStructureList = getSubStructureList();
			super.binDataBlock = binDataBlock;
			super.process();
			this.binDataBlock.printHexString();
			System.out.println("ucVoltageType: "+ucVoltageType.binDataBlock.getIntegerLE() + " & HEX: "+ucVoltageType.binDataBlock.getHexString());
			System.out.println("ucVoltageMode: "+ucVoltageMode.binDataBlock.getIntegerLE() + " & HEX: "+ucVoltageMode.binDataBlock.getHexString());
			System.out.println("usSize: "+usSize.binDataBlock.getIntegerLE() + " & HEX: "+usSize.binDataBlock.getHexString());

		}
		public ATOM_VOLTAGE_OBJECT_HEADER_V3() {
			// TODO Auto-generated constructor stub
		}
}
