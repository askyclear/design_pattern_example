package com.hudini.concreatebuilder;

import com.hudini.builder.WeaponBuilder;

public class BeginnerCaneBuilder extends WeaponBuilder{

	
	public void buildString() {
		// TODO Auto-generated method stub
		weapon.setJob("Prists");
		weapon.setName("Beginner cane");
		weapon.setContent("this is cane for beginner");
	}
	
	public void buildConstraint() {
		// TODO Auto-generated method stub
		weapon.setLevel(1);
		weapon.setStr(3);
		weapon.setDex(3);
		weapon.setIntellect(10);
	}
	
	public void buildDamage() {
		// TODO Auto-generated method stub
		weapon.setDamage(50);
	}
}
