package com.hudini.concreate;

import com.hudini.data.Constraint;
import com.hudini.prototype.SwordPrototype;

public class DragonSword extends SwordPrototype{
	private Constraint constraint;
	private String name;
	private String content;
	private int value;
	private double damage;
	
	public DragonSword() {
		// TODO Auto-generated constructor stub
		constraint = new Constraint(100,100,100);
		name = new String("Dragon Sword");
		content = new String("This is Dragon Sword, and Last Weapon");
		damage = 999.99;
		value = 0;
	}
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
		
	}

	@Override
	public void setContent(String content) {
		// TODO Auto-generated method stub
		this.content = content;
	}

	@Override
	public void setDamage(double damage) {
		// TODO Auto-generated method stub
		this.damage = damage;
	}

	@Override
	public void setConstraint(Constraint cons) {
		// TODO Auto-generated method stub
		this.constraint = cons;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name.toString() + "("+value +")";
	}

	@Override
	public String getContent() {
		// TODO Auto-generated method stub
		return content;
	}

	@Override
	public double getDamage() {
		// TODO Auto-generated method stub
		return damage;
	}

	@Override
	public Constraint getConstraint() {
		// TODO Auto-generated method stub
		return constraint;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		DragonSword sword = (DragonSword)super.clone();
		sword.setConstraint(new Constraint(sword.getConstraint().getStr(), 
				sword.getConstraint().getDex(), sword.getConstraint().getInteligent()));
		return sword;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name : " + this.getName() + "\n" +
		"content : " + content + "\n" +
		"damage : " + damage + "\n" +
		"constraint \n str - " + constraint.getStr() + "\n dex - " + constraint.getDex()+ "\n" +
		"int - " +constraint.getInteligent();
	}
	@Override
	public void setValue(int value) {
		// TODO Auto-generated method stub
		this.value = value;
		
	}
	@Override
	public int getValue() {
		// TODO Auto-generated method stub
		return value;
	}
	
}
