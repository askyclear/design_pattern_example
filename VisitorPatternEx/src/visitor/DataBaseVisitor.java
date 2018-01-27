package visitor;

import elements.CharactorData;
import elements.ItemData;
import elements.ServerData;
import elements.TotalData;

public interface DataBaseVisitor {
	public void visit(ItemData itemData);
	public void visit(CharactorData charactorData);
	public void visit(ServerData serverData);
	public void visit(TotalData totalData);
}
