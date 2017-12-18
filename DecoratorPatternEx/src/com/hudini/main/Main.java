package com.hudini.main;

import com.hudini.component.GunComponent;
import com.hudini.concreatecomponent.Ak47;
import com.hudini.concreatecomponent.M16;
import com.hudini.concreatedecorator.Bullet;
import com.hudini.concreatedecorator.Laser;
/*
 * ���ڷ����� ������ ������ ������ �����ϴ� ���� Ŭ���� �̴�.
 * 
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//gun1�� Ak47 �θ𿡰� �������� �Ѿ��� ������ ���̴�.
		GunComponent gun1 = new Bullet(new Laser(new Ak47()));
		
		//gun2�� M16���� �������� ���� ���̴�.
		GunComponent gun2 = new Laser(new M16());
		
		gun1.Attack();
		System.out.println(gun1.getDescription() + "cost = " + gun1.cost());
		gun2.Attack();
		System.out.println(gun2.getDescription() + "cost = " + gun2.cost());
	}

}
