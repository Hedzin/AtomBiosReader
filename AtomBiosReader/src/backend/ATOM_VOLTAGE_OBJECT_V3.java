package backend;
import java.util.ArrayList;
import java.util.List;

public class ATOM_VOLTAGE_OBJECT_V3 extends AFantomContainer {
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
	
	
	
	
	  ATOM_GPIO_VOLTAGE_OBJECT_V3 asGpioVoltageObj = new ATOM_GPIO_VOLTAGE_OBJECT_V3();
	  ATOM_I2C_VOLTAGE_OBJECT_V3 asI2cVoltageObj = new ATOM_I2C_VOLTAGE_OBJECT_V3();
	  ATOM_LEAKAGE_VOLTAGE_OBJECT_V3 asLeakageObj = new ATOM_LEAKAGE_VOLTAGE_OBJECT_V3();
	  ATOM_SVID2_VOLTAGE_OBJECT_V3 asSVID2Obj = new ATOM_SVID2_VOLTAGE_OBJECT_V3();
	  //StructureDataType dataType = StructureDataType.fantomContainer;
	  ATOM_VOLTAGE_OBJECT_HEADER_V3 keyHeader = new ATOM_VOLTAGE_OBJECT_HEADER_V3();
	  List<IStructure> subStructureList =  new ArrayList<IStructure>();
	@Override
	public List<IStructure> getSubStructureList() {
		return subStructureList;
	}

	@Override
	public IStructure getKeyStructure() {
		return keyHeader;
	}
	@Override
	public void parseKeyStructure(IStructure struct) {
		keyHeader = new ATOM_VOLTAGE_OBJECT_HEADER_V3(struct.getBinaryDataBlock());
		setLength(keyHeader.usSize.getBinaryDataBlock().getIntegerLE());
		int ucVoltageMode = keyHeader.ucVoltageMode.getBinaryDataBlock().getIntegerLE();
		switch (ucVoltageMode) {
		case 0:
			subStructureList.add(asGpioVoltageObj);
			break;
		case 3:
			subStructureList.add(asI2cVoltageObj);
			break;
		case 4:
			subStructureList.add(asGpioVoltageObj);
			break;
		case 7:
			subStructureList.add(asSVID2Obj);
			break;
		case 16:
			subStructureList.add(asLeakageObj);
			break;
		case 17:
			subStructureList.add(asLeakageObj);
			break;
		case 18:
			subStructureList.add(asGpioVoltageObj);
			break;
		default:
			break;
		}
	}
	@Override
	public void fillSubListDescriptions() {
		keyHeader.setName("VoltageObjectHeaderV3");
		asGpioVoltageObj.setName("GpioVoltageObj");
		asGpioVoltageObj.setDescription("VOLTAGE and GPIO Lookup table ->ATOM_GPIO_VOLTAGE_OBJECT_V3");
		asI2cVoltageObj.setName("I2cVoltageObj");
		asI2cVoltageObj.setDescription("VOLTAGE REGULATOR INIT sequece through I2C -> ATOM_I2C_VOLTAGE_OBJECT_V3");
		asLeakageObj.setName("LeakageObj");
		asLeakageObj.setDescription("voltage mode = 0x10/0x11/0x12");
		asSVID2Obj.setName("SVID2Obj");
		asSVID2Obj.setDescription("voltage mode = VOLTAGE_OBJ_SVID2");

		super.fillSubListDescriptions();
	}
}
