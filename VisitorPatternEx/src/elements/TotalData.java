package elements;

import java.util.ArrayList;
import java.util.List;

import visitor.DataBaseVisitor;

public class TotalData implements DataBaseElement {
	List<DataBaseElement> elements = new ArrayList<>();
	public TotalData(){
		elements.add(new ItemData());
		elements.add(new ServerData());
		elements.add(new CharactorData());
	}
	public TotalData(ItemData itemData, ServerData serverData, CharactorData charactorData){
		elements.add(itemData);
		elements.add(serverData);
		elements.add(charactorData);
	}
	@Override
	public void accept(DataBaseVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
		for(DataBaseElement element : elements){
			element.accept(visitor);
		}
	}

}
