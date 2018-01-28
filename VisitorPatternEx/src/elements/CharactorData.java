package elements;

import visitor.DataBaseVisitor;

public class CharactorData implements DataBaseElement{
	@Override
	public void accept(DataBaseVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}

}
