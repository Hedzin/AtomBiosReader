package backend;

import java.util.ArrayList;
import java.util.List;

public class ATOM_MASTER_COMMAND_TABLE extends AContainer implements IContainer {
	{
	name = "ATOM_MASTER_COMMAND_TABLE";
	description = "Command Table list conatiner";
	}
	
	   ATOM_COMMON_TABLE_HEADER sHeader = new ATOM_COMMON_TABLE_HEADER();
	   ATOM_MASTER_LIST_OF_COMMAND_TABLES ListOfCommandTables = new ATOM_MASTER_LIST_OF_COMMAND_TABLES();
	   
	   
	   
		@Override
		public List<IStructure> getSubStructureList() {
			List<IStructure> list = new  ArrayList<IStructure>();
			list.add(sHeader);
			list.add(ListOfCommandTables);
			return list;
		}
		@Override
		public void fillSubListDescriptions() {
			sHeader.setName("CommonTableHeader");
			ListOfCommandTables.setName("ListOfCommandTables");
			super.fillSubListDescriptions();
		}
}
