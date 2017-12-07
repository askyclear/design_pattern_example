package com.hudini.main;

import com.hudini.builder.WeaponBuilder;
import com.hudini.concreatebuilder.*;
import com.hudini.director.WeaponMaker;
import com.hudini.product.GameWeapon;

public class Main {

	public static void main(String[] args) {
		//Director 
		WeaponMaker mk = new WeaponMaker();
		//ConcreateBuilder 일종의 설계도
		WeaponBuilder beginnerWand = new BeginnerWandBuilder();
		WeaponBuilder beginnerAxe = new BeginnerAxeBuilder();
		WeaponBuilder beginnerSword = new BeginnerSwordBuilder();
		WeaponBuilder beginnerCane = new BeginnerCaneBuilder();
		//
		mk.setWeaponBuilder(beginnerWand);
		//Director의 Construct 과정 
		mk.constructWeapon();
		//Proudct 결과물이 나옴
		GameWeapon weapon1 = mk.getWeapon();
		mk.setWeaponBuilder(beginnerAxe);
		mk.constructWeapon();
		GameWeapon weapon2 = mk.getWeapon();
		//weapon1 과 weapon2는 서로다른 결과물 
		System.out.println(weapon1.toString());
		System.out.println(weapon2.toString());
		
	}

}
