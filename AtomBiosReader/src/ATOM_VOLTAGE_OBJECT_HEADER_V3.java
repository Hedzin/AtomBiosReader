
public class ATOM_VOLTAGE_OBJECT_HEADER_V3 implements IContainer {
	
	
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
	 Byte		ucVoltageType;									//Indicate Voltage Source: VDDC, MVDDC, MVDDQ or MVDDCI	 
	 Byte		ucVoltageMode;							    //Indicate voltage control mode: Init/Set/Leakage/Set phase 
	 Short		usSize;													//Size of Object
	 StructureDataType dataType = StructureDataType.container; 
	 StructureType type = StructureType.finale; 
	 
		@Override
		public int getLength() {
			int length = 4;

			return length;
		}
}
