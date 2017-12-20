package com.hudini.main;

import com.hudini.composite.Inventory;
import com.hudini.leaf.Food;
import com.hudini.leaf.Weapon;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//각종 음식 생성
		Food food1 = new Food();
		food1.setName("밀");
		food1.setCount(1, 100);
		Food food2 = new Food();
		food2.setName("빵");
		food2.setCount(4, 50);
		//각종 무기 생성
		Weapon weapon1 = new Weapon();
		weapon1.setName("sword");
		weapon1.setWeight(100);
		Weapon weapon2 = new Weapon();
		weapon2.setName("gun");
		weapon2.setWeight(70);
		
		//아이템을 담을 컴포짓 인벤토리 생성
		Inventory inven1 = new Inventory();//음식
		Inventory inven2 = new Inventory();//무기
		Inventory inven3 = new Inventory();//전체
		
		inven1.add(food1);
		inven1.add(food2);
		
		inven2.add(weapon2);
		inven2.add(weapon1);
		
		inven3.add(inven1);
		inven3.add(inven2);
		
		System.out.println(inven1.getWeight());
		System.out.println(inven2.getWeight());
		System.out.println(inven3.getWeight());
		
		
	}

}
