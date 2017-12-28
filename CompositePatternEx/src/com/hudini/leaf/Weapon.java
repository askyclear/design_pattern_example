package com.hudini.leaf;

import com.hudini.component.Item;
/*
 * 무기는 이름과 무게만;
 */
public class Weapon implements Item{
	private String name="None";
	private double weight=0;
	public void setName(String name) {
		this.name = name;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return weight;
	}

}
