package elements;

import visitor.DataBaseVisitor;

public interface DataBaseElement {
	public void accept(DataBaseVisitor visitor);
}
