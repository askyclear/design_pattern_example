package com.hudini.builder;

import com.hudini.product.GameWeapon;
/*
 * builder  
 */
public abstract class WeaponBuilder {
	protected GameWeapon weapon;
	public GameWeapon getGameWeapon(){
		return weapon;
	}
	public void createNewWeaponProduct(){
		weapon = new GameWeapon();
	}
	//public abstract GameWeapon getWeapon();
	public abstract void buildString();
	public abstract void buildConstraint();
	public abstract void buildDamage();
	
}
