package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_FAN_OBJECT_V5 extends AContainer {
	
	ATOM_POWERPLAY_FAN_OBJECT_V3 ppFun3 = new ATOM_POWERPLAY_FAN_OBJECT_V3();
	ShortStructure  usFanRPMMax = new ShortStructure();	  /* The default value in RPM */
	LongStructure  ulMinFanSCLKAcousticLimit = new LongStructure();	 /* Minimum Fan Controller SCLK Frequency Acoustic Limit. */
	ByteStructure ucTargetTemperature = new ByteStructure(); /* Advanced fan controller target temperature. */
	ByteStructure ucMinimumPWMLimit = new ByteStructure();   /* The minimum PWM that the advanced fan controller can set.	This should be set to the highest PWM that will run the fan at its lowest RPM. */
	ShortStructure  usReserved = new ShortStructure();

	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(ppFun3);
		list.add(usFanRPMMax);
		list.add(ulMinFanSCLKAcousticLimit);
		list.add(ucTargetTemperature);
		list.add(ucMinimumPWMLimit);
		list.add(usReserved);
		return list;
	}
	@Override
	public void fillSubListDescriptions() {
		ppFun3.setName("FAN_TABLE_V3");
		usFanRPMMax.setName("usFanRPMMax");
		ulMinFanSCLKAcousticLimit.setName("ulMinFanSCLKAcousticLimit");
		ucTargetTemperature.setName("ucTargetTemperature");
		ucMinimumPWMLimit.setName("ucMinimumPWMLimit");
		usReserved.setName("usReserved");
		

		usFanRPMMax.setDescription("The default value in RPM");
		ulMinFanSCLKAcousticLimit.setDescription("Minimum Fan Controller SCLK Frequency Acoustic Limit.");
		ucTargetTemperature.setDescription("Advanced fan controller target temperature.");
		ucMinimumPWMLimit.setDescription("The minimum PWM that the advanced fan controller can set.	This should be set to the highest PWM that will run the fan at its lowest RPM.");
		usReserved.setDescription("usReserved");

		
		super.fillSubListDescriptions();
	}

}
