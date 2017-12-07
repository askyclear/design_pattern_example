package com.hudini.concreatebuilder;

import com.hudini.builder.WeaponBuilder;
import com.hudini.product.GameWeapon;
/*
 * ConcreteBuilder 부분
 */
public class BeginnerAxeBuilder extends WeaponBuilder{
	/*
	 * 이부분은 Builder 부분에 선언을 해두던가 각자의 ConcreateBuilder에서  선언을 해둘수 있다.
	 * 각자의 개인취향부분.
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
