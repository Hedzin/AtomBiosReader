import java.nio.ByteBuffer;

public abstract class AFantomContainer extends AStructure implements IFantomContainer{

	@Override
	public void process() {
		System.out.println("!!in AFantomContainer");
		System.out.println(this.toString());
		BinaryDataBlock bdb = new BinaryDataBlock();
		ByteBuffer tBB = binDataBlock.getBody().duplicate();
		getKeyStructure().process();
		super.process();
	}

}
