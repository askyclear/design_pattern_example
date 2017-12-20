package com.hudini.composite;

import java.util.ArrayList;
import java.util.List;

import com.hudini.component.Item;

/*
 * Item Component를 상속받은 클래스들의 모임을 관리하는 것이 composite 이다.
 * 
 */
public class Inventory implements Item{
	private String name="none";
	private double weight=0;
	private List<Item> items = new ArrayList<>();
	public List<Item> getItems(){
		return items;
	}
	public Item getItem(int index){
		return items.get(index);
	}
	public void setInventoryName(String name){
		this.name = name;
	}
	public void add(Item item){
		items.add(item);
	}
	public void remove(Item item){
		items.remove(item);
	}
	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		if(items.size()!=0 && weight!=0){
			return weight;
		}else{
			for(Item item:items){
				weight+=item.getWeight();
			}
			return weight;
		}
	}

}
