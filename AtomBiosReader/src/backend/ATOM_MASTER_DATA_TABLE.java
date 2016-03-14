package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_MASTER_DATA_TABLE extends AContainer implements IContainer,IAtomTable {
	{
	name = "ATOM_MASTER_DATA_TABLE";
	description = "Data Table list conatiner";
	}
	
	   ATOM_COMMON_TABLE_HEADER sHeader = new ATOM_COMMON_TABLE_HEADER();
	   ATOM_MASTER_LIST_OF_DATA_TABLES ListOfDataTables = new ATOM_MASTER_LIST_OF_DATA_TABLES();
	   
	   
	   
		@Override
		public List<IStructure> getSubStructureList() {
			List<IStructure> list = new  ArrayList<IStructure>();
			list.add(sHeader);
			list.add(ListOfDataTables);
			return list;
		}
		@Override
		public void fillSubListDescriptions() {
			sHeader.setName("CommonTableHeader");
			ListOfDataTables.setName("ListOfDataTables");
			super.fillSubListDescriptions();
		}
}
