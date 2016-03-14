package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_POWERPLAY_FAN_TABLE_V5 extends AContainer {
	
	ByteStructure ucRevId = new ByteStructure();/* Change this if the table format changes or version changes so that the other fields are not the same. */
	ByteStructure ucTHyst = new ByteStructure();/* Temperature hysteresis. Integer. */
	ShortStructure  usTMin = new ShortStructure(); /* The temperature, in 0.01 centigrades, below which we just run at a minimal PWM. */
	ShortStructure  usTMed = new ShortStructure(); /* The middle temperature where we change slopes. */
	ShortStructure  usTHigh = new ShortStructure();/* The high point above TMed for adjusting the second slope. */
	ShortStructure  usPWMMin = new ShortStructure();/* The minimum PWM value in percent (0.01% increments). */
	ShortStructure  usPWMMed = new ShortStructure();/* The PWM value (in percent) at TMed. */
	ShortStructure  usPWMHigh = new ShortStructure();/* The PWM value at THigh. */
	ShortStructure  usTMax = new ShortStructure(); /* The max temperature */
	ByteStructure ucFanControlMode = new ByteStructure();  /* Legacy or Fuzzy Fan mode */
	ShortStructure  usFanPWMMax = new ShortStructure();	  /* Maximum allowed fan power in percent */
	ShortStructure  usFanOutputSensitivity = new ShortStructure();		  /* Sensitivity of fan reaction to temepature changes */
	ShortStructure  usFanRPMMax = new ShortStructure();	  /* The default value in RPM */
	LongStructure  ulMinFanSCLKAcousticLimit = new LongStructure();	 /* Minimum Fan Controller SCLK Frequency Acoustic Limit. */
	ByteStructure ucTargetTemperature = new ByteStructure(); /* Advanced fan controller target temperature. */
	ByteStructure ucMinimumPWMLimit = new ByteStructure();   /* The minimum PWM that the advanced fan controller can set.	This should be set to the highest PWM that will run the fan at its lowest RPM. */
	ShortStructure  usReserved = new ShortStructure();

	@Override
	public List<IStructure> getSubStructureList() {
		List<IStructure> list = new  ArrayList<IStructure>();
		list.add(ucRevId);
		list.add(ucTHyst);
		list.add(usTMin);
		list.add(usTMed);
		list.add(usTHigh);
		list.add(usPWMMin);
		list.add(usPWMMed);
		list.add(usPWMHigh);
		list.add(usTMax);
		list.add(ucFanControlMode);
		list.add(usFanPWMMax);
		list.add(usFanOutputSensitivity);
		list.add(usFanRPMMax);
		list.add(ulMinFanSCLKAcousticLimit);
		list.add(ucTargetTemperature);
		list.add(ucMinimumPWMLimit);
		list.add(usReserved);
		return list;
	}
	@Override
	public void fillSubListDescriptions() {
		ucRevId.setName("ucRevId");
		ucTHyst.setName("ucTHyst");
		usTMin.setName("usTMin");
		usTMed.setName("usTMed");
		usTHigh.setName("usTHigh");
		usPWMMin.setName("usPWMMin");
		usPWMMed.setName("usPWMMed");
		usPWMHigh.setName("usPWMHigh");
		usTMax.setName("usTMax");
		ucFanControlMode.setName("ucFanControlMode");
		usFanPWMMax.setName("usFanPWMMax");
		usFanOutputSensitivity.setName("usFanOutputSensitivity");
		usFanRPMMax.setName("usFanRPMMax");
		ulMinFanSCLKAcousticLimit.setName("ulMinFanSCLKAcousticLimit");
		ucTargetTemperature.setName("ucTargetTemperature");
		ucMinimumPWMLimit.setName("ucMinimumPWMLimit");
		usReserved.setName("usReserved");
		
		ucRevId.setDescription("");
		ucTHyst.setDescription("Temperature hysteresis. Integer.");
		usTMin.setDescription("The temperature, in 0.01 centigrades, below which we just run at a minimal PWM.");
		usTMed.setDescription("The middle temperature where we change slopes.");
		usTHigh.setDescription("The high point above TMed for adjusting the second slope.");
		usPWMMin.setDescription("The minimum PWM value in percent (0.01% increments).");
		usPWMMed.setDescription("The PWM value (in percent) at TMed.");
		usPWMHigh.setDescription("The PWM value at THigh.");
		usTMax.setDescription("The max temperature");
		ucFanControlMode.setDescription("Legacy or Fuzzy Fan mode");
		usFanPWMMax.setDescription("Maximum allowed fan power in percent");
		usFanOutputSensitivity.setDescription("Sensitivity of fan reaction to temepature changes");
		usFanRPMMax.setDescription("The default value in RPM");
		ulMinFanSCLKAcousticLimit.setDescription("Minimum Fan Controller SCLK Frequency Acoustic Limit.");
		ucTargetTemperature.setDescription("Advanced fan controller target temperature.");
		ucMinimumPWMLimit.setDescription("The minimum PWM that the advanced fan controller can set.	This should be set to the highest PWM that will run the fan at its lowest RPM.");
		usReserved.setDescription("usReserved");

		
		super.fillSubListDescriptions();
	}

}
