package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_FAN_OBJECT_V3 extends AContainer {
	
	ATOM_POWERPLAY_FAN_OBJECT_V2 ppFan2 = new ATOM_POWERPLAY_FAN_OBJECT_V2(); 
	ByteStructure ucFanControlMode = new ByteStructure();  /* Legacy or Fuzzy Fan mode */
	ShortStructure  usFanPWMMax = new ShortStructure();	  /* Maximum allowed fan power in percent */
	ShortStructure  usFanOutputSensitivity = new ShortStructure();		  /* Sensitivity of fan reaction to temepature changes */


	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(ppFan2);
		list.add(ucFanControlMode);
		list.add(usFanPWMMax);
		list.add(usFanOutputSensitivity);
;
		return list;
	}
	@Override
	public void fillSubListDescriptions() {

		ppFan2.setName("FAN_TABLE_V2");
		ucFanControlMode.setName("ucFanControlMode");
		usFanPWMMax.setName("usFanPWMMax");
		usFanOutputSensitivity.setName("usFanOutputSensitivity");
;
		

		ucFanControlMode.setDescription("Legacy or Fuzzy Fan mode");
		usFanPWMMax.setDescription("Maximum allowed fan power in percent");
		usFanOutputSensitivity.setDescription("Sensitivity of fan reaction to temepature changes");


		
		super.fillSubListDescriptions();
	}

}
