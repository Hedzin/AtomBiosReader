package amd.gui.view;

import java.util.List;

import backend.BinaryDataBlock;
import javafx.collections.ObservableList;
import javafx.scene.control.TreeItem;

public class TreeItemFactory {

	public static TreeItem<BinaryDataBlock> getTreeItem(BinaryDataBlock binDataBlock) {
		TreeItem<BinaryDataBlock> trit = new TreeItem<>(binDataBlock);
		poppulate(trit);
		return trit;
	}
	private static void poppulate(TreeItem<BinaryDataBlock> trit) {
		for (BinaryDataBlock binDataBlock : trit.getValue().childList) {
			trit.getChildren().add( new TreeItem<>(binDataBlock));
		}
		for (TreeItem<BinaryDataBlock> treeItem : trit.getChildren()) {
			poppulate(treeItem);
		}

	} 

}
