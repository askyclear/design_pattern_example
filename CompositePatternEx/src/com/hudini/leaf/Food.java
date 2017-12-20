package com.hudini.leaf;

import com.hudini.component.Item;
/*
 * food에 맞게 이름과 중복개수 그리고 무게를 입력 받는다.
 */
public class Food implements Item{
	private String name="None";
	private double weight=0;
	private int count;
	public void setName(String name){
		this.name = name;
	}
	public void setCount(double weight, int count){
		this.weight = weight;
		this.count = count;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		
		return name;
	}

	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return weight*count;
	}

}
