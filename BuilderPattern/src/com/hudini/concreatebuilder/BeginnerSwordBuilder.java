package com.hudini.concreatebuilder;

import com.hudini.builder.WeaponBuilder;

public class BeginnerSwordBuilder extends WeaponBuilder{

	
	public void buildString() {
		// TODO Auto-generated method stub
		weapon.setJob("knight");
		weapon.setName("Beginner Sword");
		weapon.setContent("this is Sword for beginner");
	}	
	public void buildConstraint() {
		// TODO Auto-generated method stub
		weapon.setLevel(1);
		weapon.setStr(10);
		weapon.setDex(8);
		weapon.setIntellect(1);
		
	}


	public void buildDamage() {
		// TODO Auto-generated method stub
		weapon.setDamage(200);
	}
}
