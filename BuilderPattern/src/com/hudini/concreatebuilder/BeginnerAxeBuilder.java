package com.hudini.concreatebuilder;

import com.hudini.builder.WeaponBuilder;
import com.hudini.product.GameWeapon;
/*
 * ConcreteBuilder �κ�
 */
public class BeginnerAxeBuilder extends WeaponBuilder{
	/*
	 * �̺κ��� Builder �κп� ������ �صδ��� ������ ConcreateBuilder����  ������ �صѼ� �ִ�.
	 * ������ ��������κ�.
	 private GameWeapon weapon;
	 public BeginnerAxeBuilder(){
	 weapon = new GameWeapon();
	}
	public GameWeapon getWeapon(){
		return weapon;
	}*/
	public void buildString() {
		// TODO Auto-generated method stub
		weapon.setJob("warrior");
		weapon.setName("Beginner Axe");
		weapon.setContent("this is axe for beginner");
	}
	public void buildConstraint() {
		// TODO Auto-generated method stub
		weapon.setLevel(1);
		weapon.setStr(20);
		weapon.setDex(3);
		weapon.setIntellect(1);
	}
	
	public void buildDamage() {
		// TODO Auto-generated method stub
		weapon.setDamage(300);
	}
}
