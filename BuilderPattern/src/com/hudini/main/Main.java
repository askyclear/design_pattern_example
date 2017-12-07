package com.hudini.main;

import com.hudini.builder.WeaponBuilder;
import com.hudini.concreatebuilder.*;
import com.hudini.director.WeaponMaker;
import com.hudini.product.GameWeapon;

public class Main {

	public static void main(String[] args) {
		//Director 
		WeaponMaker mk = new WeaponMaker();
		//ConcreateBuilder ������ ���赵
		WeaponBuilder beginnerWand = new BeginnerWandBuilder();
		WeaponBuilder beginnerAxe = new BeginnerAxeBuilder();
		WeaponBuilder beginnerSword = new BeginnerSwordBuilder();
		WeaponBuilder beginnerCane = new BeginnerCaneBuilder();
		//
		mk.setWeaponBuilder(beginnerWand);
		//Director�� Construct ���� 
		mk.constructWeapon();
		//Proudct ������� ����
		GameWeapon weapon1 = mk.getWeapon();
		mk.setWeaponBuilder(beginnerAxe);
		mk.constructWeapon();
		GameWeapon weapon2 = mk.getWeapon();
		//weapon1 �� weapon2�� ���δٸ� ����� 
		System.out.println(weapon1.toString());
		System.out.println(weapon2.toString());
		
	}

}
