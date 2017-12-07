package com.hudini.main;

import com.hudini.builder.WeaponBuilder;
import com.hudini.weapon.GameWeapon;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameWeapon weapon = WeaponBuilder
					.start()
					.setString("BeginnerAxe","this is Axe for beginner", "warrior")
					.setConstraint(1, 5, 5, 3)
					.setDamage(100)
					.build();
		System.out.println(weapon.toString());
	}

}
