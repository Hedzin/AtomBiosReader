package backend;

import java.nio.ByteBuffer;
import java.util.List;

public abstract class ADynamicContainer extends AStructure implements IDynamicContainer {
	boolean thirdpass = false;

	@Override
	public void process() {
		int oldpos = binDataBlock.getBody().position();
		// System.out.println("(this instanceof IDynamicContainer");
		subStructureList = getSubStructureList();
		// System.out.println("!!!!!!!!!!!!!!!!!BEFORE DYN PRE RUN");
		super.process();
		// System.out.println("!!!!!!!!!!!!!!!!!AFTER DYN PRE RUN");
		subStructureList = getSubStructureList();
		lenght = 0;
		binDataBlock.getBody().position(0);
		binDataBlock.getBody().limit(binDataBlock.getBody().capacity());
		binDataBlock.getChildList().clear();
		// System.out.println("!!!!!!!!!!!!!!!!!BEFORE DYN MAIN RUN");

		super.process();

		if (thirdpass) {
			subStructureList = getSubStructureList();
			lenght = 0;
			binDataBlock.getBody().position(0);
			binDataBlock.getBody().limit(binDataBlock.getBody().capacity());
			binDataBlock.getChildList().clear();
			// System.out.println("!!!!!!!!!!!!!!!!!BEFORE DYN MAIN RUN");

			super.process();
		}
		lenght = getLength();

		// System.err.println(getName()+" lenght:"+lenght);
		// System.err.println(getName()+" getLenght:"+getLength());
		// System.out.println("!!!!!!!!!!!!!!!!!AFTERRF DYN MAIN RUN");
	}

	boolean isThirdPass() {
		return thirdpass;
	}
	void enableThirdPass(){
		thirdpass = true;
	}

}
