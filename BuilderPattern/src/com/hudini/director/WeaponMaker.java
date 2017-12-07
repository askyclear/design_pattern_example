package com.hudini.director;

import com.hudini.builder.WeaponBuilder;
import com.hudini.product.GameWeapon;
/*
 * Diretor �κ�
 */
public class WeaponMaker {
	private WeaponBuilder weaponBuilder;
	//Concreate Builder�� Builder�� ���� 
	public void setWeaponBuilder(WeaponBuilder builder){
		this.weaponBuilder = builder;
	}
	//ConcreateBuilder���� ������ ��ü�� �������� �κ�
	public GameWeapon getWeapon(){
		return weaponBuilder.getGameWeapon();
	}
	//���� �ܰ�  
	public void constructWeapon(){
		weaponBuilder.createNewWeaponProduct();
		weaponBuilder.buildString();
		weaponBuilder.buildConstraint();
		weaponBuilder.buildDamage();
	}
}
