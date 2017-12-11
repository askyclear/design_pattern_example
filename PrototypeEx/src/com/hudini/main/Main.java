package com.hudini.main;

import java.util.ArrayList;

import com.hudini.concreate.DragonSword;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		//������ Ÿ�� ù��° �� ����.
		ArrayList<DragonSword> list = new ArrayList<>();
		DragonSword sword1 = new DragonSword();
		//���� ����
		list.add(sword1);
		for(int i=1;i<11;i++){
			DragonSword sword2 = (DragonSword)sword1.clone();
			sword2.setValue(i);
			sword2.setDamage(sword2.getDamage()*(1+0.1*i));
			list.add(sword2);
		}
		for(DragonSword item:list){
			System.out.println(item.toString());
		}
	}

}
