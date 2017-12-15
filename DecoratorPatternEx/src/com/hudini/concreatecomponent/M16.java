package com.hudini.concreatecomponent;

import com.hudini.component.GunComponent;
/*
 * 컴포넌트 인터페이스를 implement 하여 아래와 같이 구현한다. 이후 데코레이터 패턴을 적용한 곳에서
 * 아래 구현한 인터페이스 들을 사용할 수 잇다.
 */
public class M16 implements GunComponent{

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "this is M16";
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return 3000;
	}

	@Override
	public void Attack() {
		// TODO Auto-generated method stub
		System.out.println("M16 Attacked");
	}

}
