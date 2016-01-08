import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public abstract class AStructure implements IStructure {
	int lenght = 0;
	List<IStructure> subStructureList = new ArrayList<IStructure>();
	BinaryDataBlock binDataBlock =  null;
	@Override
	public int getLength() {
		int tLenght = 0;
		for (IStructure iStructure : subStructureList) {
			tLenght += iStructure.getLength();
		}
		return tLenght;
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
		this.lenght = lenght;

	}
	@Override
	public void process() {
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
				System.out.println("AStructure process() "+structure.toString());
				BinaryDataBlock bdb = new BinaryDataBlock();
				ByteBuffer tBB = binDataBlock.getBody().duplicate();
				int tLength = structure.getLength();
				System.out.println("AStructure process() tLength: "+tLength);
				System.out.println("AStructure process() position: "+position);
				tBB.position(position);
				ByteBuffer bb = tBB.slice();
				bb.limit(tLength);
				bdb.setBody(bb);
				bdb.setLength(tLength);
				bdb.setOffset(position);
				bdb.setName(structure.getClass().getName());
				position += tLength;
				structure.setBinaryDataBlock(bdb);
		
		}
		
	}
	@Override
	public void setBinaryDataBlock(BinaryDataBlock bdb) {
		binDataBlock = bdb;
		
	}

}
