import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public abstract class AStructure implements IStructure {
	int lenght = 0;
	List<IStructure> subStructureList = new ArrayList<IStructure>();
	BinaryDataBlock binDataBlock =  null;
	@Override
	public int getLength() {
		System.out.println("AStructure getLength lenght: " +lenght);
		int tLenght = 0;
		if (lenght!=0) return lenght;
		if(subStructureList.size() == 0)subStructureList=  getSubStructureList();
		for (IStructure iStructure : subStructureList) {
			tLenght += iStructure.getLength();
			System.out.println("AStructure getLength  iStructure.getLength(): " +iStructure.getLength());
		}
		return tLenght;
	}
	@Override
	public void init() {
		System.out.println("in AStructure init()");
		subStructureList = getSubStructureList();
		process();
	}
	@Override
	public List<IStructure> getSubStructureList() {
		return subStructureList;
	}

	@Override
	public BinaryDataBlock getBinaryDataBlock() {
		return binDataBlock;
	}

	@Override
	public void setLength(int lenght) {
		System.out.println("AStructure setLength :"+lenght);
		this.lenght = lenght;
		System.out.println("AStructure this.lenght :"+this.lenght);

	}
	@Override
	public void process() {
		System.out.println("binDataBlock.getBody().position(): "+binDataBlock.getBody().position());
		System.out.println("binDataBlock.getBody().limit(): "+binDataBlock.getBody().limit());
		System.out.println("binDataBlock.getBody().capacity(): "+binDataBlock.getBody().capacity());
		
		int position = 0;
		for (IStructure structure : subStructureList) {
			if(structure instanceof IFantomContainer){
				
				System.out.println("(structure instanceof IFantomContainer");
				IStructure keyStr = ((IFantomContainer) structure).getKeyStructure();
				int keyStrLen = keyStr.getLength();
				System.out.println("keyStrLen: "+keyStrLen);
				BinaryDataBlock bdb = new BinaryDataBlock();
				ByteBuffer tBB = binDataBlock.getBody().duplicate();
				tBB.position(position);
				ByteBuffer bb = tBB.slice();
				bb.limit(keyStrLen);
				bdb.setBody(bb);
				bdb.setLength(keyStrLen);
				bdb.setOffset(position);
				bdb.setName(structure.getClass().getName());
				//position += keyStrLen;
				keyStr.setBinaryDataBlock(bdb);
				((IFantomContainer) structure).parseKeyStructure(keyStr);
			}
				//System.out.println("AStructure process() "+structure.toString());
				BinaryDataBlock bdb = new BinaryDataBlock();
				//System.out.println("INbinDataBlock.getBody().position(): "+binDataBlock.getBody().position());
				//System.out.println("INbinDataBlock.getBody().limit(): "+binDataBlock.getBody().limit());
				//System.out.println("INbinDataBlock.getBody().capacity(): "+binDataBlock.getBody().capacity());
				
				
				ByteBuffer tBB = binDataBlock.getBody().duplicate();
				int tLength = structure.getLength();
				//System.out.println("AStructure process() tLength: "+tLength);
				//System.out.println("AStructure process() position: "+position);
				tBB.position(position);
				ByteBuffer bb = tBB.slice();
				//System.out.println("bb.position(): "+bb.position());
				//System.out.println("bb.limit(): "+bb.limit());
				//System.out.println("bb.capacity(): "+bb.capacity());
				bb.limit(tLength);
				bdb.setBody(bb);
				bdb.setLength(tLength);
				bdb.setOffset(position);
				bdb.setName(structure.getClass().getName());
				position += tLength;
				structure.setBinaryDataBlock(bdb);
				binDataBlock.getChildList().add(bdb);
				bdb.printHexString();
				structure.init();
		
		}
		
	}
	@Override
	public void setBinaryDataBlock(BinaryDataBlock bdb) {
		binDataBlock = bdb;
		
	}

}
