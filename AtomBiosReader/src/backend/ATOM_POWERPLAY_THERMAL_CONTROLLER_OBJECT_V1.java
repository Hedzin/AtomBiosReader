package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_THERMAL_CONTROLLER_OBJECT_V1 extends AContainer {
	
	ByteStructure ucType = new ByteStructure(); /* one of ATOM_TONGA_PP_THERMALCONTROLLER_* */
	ByteStructure ucI2cLine = new ByteStructure(); /* as interpreted by DAL I2C */
	ByteStructure ucI2cAddress = new ByteStructure(); 
	ByteStructure ucFanParameters = new ByteStructure(); /* Fan Control Parameters. */
	ByteStructure ucFanMinRPM = new ByteStructure(); /* Fan Minimum RPM (hundreds) -- for display purposes only. */
	ByteStructure ucFanMaxRPM = new ByteStructure(); /* Fan Maximum RPM (hundreds) -- for display purposes only. */
	ByteStructure ucReserved = new ByteStructure();
	ByteStructure ucFlags = new ByteStructure();/* to be defined */

	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(ucType);
		list.add(ucI2cLine);
		list.add(ucI2cAddress);
		list.add(ucFanParameters);
		list.add(ucFanMinRPM);
		list.add(ucFanMaxRPM);
		list.add(ucReserved);
		list.add(ucFlags);
		return list;
	}
	@Override
	public void fillSubListDescriptions() {
		ucType.setName("ucType");
		ucI2cLine.setName("ucI2cLine");
		ucI2cAddress.setName("ucI2cAddress");
		ucFanParameters.setName("ucFanParameters");
		ucFanMinRPM.setName("ucFanMinRPM");
		ucFanMaxRPM.setName("ucFanMaxRPM");
		ucReserved.setName("ucReserved");
		ucFlags.setName("ucFlags");
		


		ucI2cLine.setDescription("as interpreted by DAL I2C");
		ucFanParameters.setDescription("Fan Control Parameters.");
		ucFanMinRPM.setDescription("Fan Minimum RPM (hundreds) -- for display purposes only.");
		ucFanMaxRPM.setDescription("Fan Maximum RPM (hundreds) -- for display purposes only.");

		
		super.fillSubListDescriptions();
	}

}
