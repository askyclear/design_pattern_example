package com.hudini.prototype;

import com.hudini.data.Constraint;

public abstract class SwordPrototype implements Cloneable{

	public abstract void setName(String name);
	
	public abstract void setContent(String content);
	
	public abstract void setDamage(double damage);
	public abstract void setConstraint(Constraint cons);
	public abstract void setValue(int value);
	public abstract String getName();
	public abstract String getContent();
	public abstract int getValue();
	public abstract double getDamage();
	public abstract Constraint getConstraint();
}
