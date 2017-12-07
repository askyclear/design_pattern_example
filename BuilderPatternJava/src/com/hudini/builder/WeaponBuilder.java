package com.hudini.builder;

import com.hudini.weapon.GameWeapon;

public class WeaponBuilder {
	private GameWeapon weapon;
	private WeaponBuilder(){
		weapon = new GameWeapon();
	}
	public static WeaponBuilder start(){
		return new WeaponBuilder();
	}
	public WeaponBuilder setString(String name, String content, String job){
		weapon.setName(name);
		weapon.setContent(content);
		weapon.setJob(job);
		return this;
	}
	public WeaponBuilder setConstraint(int level, int str, int dex, int intelgent){
		return this;
	}
	public WeaponBuilder setDamage(int damage){
		weapon.setDamage(damage);
		return this;
	}
	public GameWeapon build(){
		return weapon;
	}
}
