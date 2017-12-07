package com.hudini.director;

import com.hudini.builder.WeaponBuilder;
import com.hudini.product.GameWeapon;
/*
 * Diretor 부분
 */
public class WeaponMaker {
	private WeaponBuilder weaponBuilder;
	//Concreate Builder를 Builder에 적용 
	public void setWeaponBuilder(WeaponBuilder builder){
		this.weaponBuilder = builder;
	}
	//ConcreateBuilder에서 생선된 객체를 가져오는 부분
	public GameWeapon getWeapon(){
		return weaponBuilder.getGameWeapon();
	}
	//생성 단계  
	public void constructWeapon(){
		weaponBuilder.createNewWeaponProduct();
		weaponBuilder.buildString();
		weaponBuilder.buildConstraint();
		weaponBuilder.buildDamage();
	}
}
