package com.hudini.concreatebuilder;

import com.hudini.builder.WeaponBuilder;

public class BeginnerWandBuilder extends WeaponBuilder{

	
	public void buildString() {
		// TODO Auto-generated method stub
		weapon.setJob("magician");
		weapon.setName("Beginner wand");
		weapon.setContent("this is wand for beginner");
	}	
	public void buildConstraint() {
		// TODO Auto-generated method stub
		weapon.setLevel(1);
		weapon.setStr(5);
		weapon.setDex(5);
		weapon.setIntellect(10);
	}
	public void buildDamage() {
		// TODO Auto-generated method stub
		weapon.setDamage(100);
	}
}
