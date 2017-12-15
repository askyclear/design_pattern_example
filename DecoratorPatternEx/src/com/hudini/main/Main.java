package com.hudini.main;

import com.hudini.component.GunComponent;
import com.hudini.concreatecomponent.Ak47;
import com.hudini.concreatecomponent.M16;
import com.hudini.concreatedecorator.Bullet;
import com.hudini.concreatedecorator.Laser;
/*
 * 데코레이터 패턴을 적용한 예제를 실행하는 메인 클레스 이다.
 * 
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//gun1은 Ak47 부모에게 레이저와 총알을 덧붙인 것이다.
		GunComponent gun1 = new Bullet(new Laser(new Ak47()));
		
		//gun2는 M16에게 레이저를 붙인 것이다.
		GunComponent gun2 = new Laser(new M16());
		
		gun1.Attack();
		System.out.println(gun1.getDescription() + "cost = " + gun1.cost());
		gun2.Attack();
		System.out.println(gun2.getDescription() + "cost = " + gun2.cost());
	}

}
