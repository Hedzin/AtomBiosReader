package backend;

import java.util.List;

abstract class AtomTable  extends AContainer implements IContainer ,IAtomTable{
	
	void checkTable(){
		
		List<BinaryDataBlock> childList = binDataBlock.getChildList();
	}
	
}
