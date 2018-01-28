package elements;

import visitor.DataBaseVisitor;

public class ItemData implements DataBaseElement {
	private String[] nomal_items;
	public ItemData(){
		nomal_items = new String[]{"빵","기본검","기본방어구"};
	}
	public ItemData(String ... nomal_items){
		this.nomal_items = nomal_items;
	}
	@Override
	public void accept(DataBaseVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}
	public String[] getItems(){
		return nomal_items;
	}

}
