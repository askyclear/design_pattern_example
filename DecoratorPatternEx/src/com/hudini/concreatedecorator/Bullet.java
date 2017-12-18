package com.hudini.concreatedecorator;

import com.hudini.component.GunComponent;
import com.hudini.decorator.GunDecorator;
/*
 * 데코레이터 패턴을 적용한 추상 클래스를 상속 받은 데코레이터 클래스다
 * 부모에게 GunComponet를 넣어두고 접근할때에도 super를 통해 접급 함으로서 기존 부모를 수정 하지 않고 사용 가능.
 */
public class Bullet extends GunDecorator{
	
	public Bullet(GunComponent gunComponet){
		super(gunComponet);
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.gunComponent.getDescription() + " bullet";
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return super.gunComponent.cost() + 300;
	}

	@Override
	public void Attack() {
		// TODO Auto-generated method stub
		super.gunComponent.Attack();
		System.out.println("총알");
	}

}
