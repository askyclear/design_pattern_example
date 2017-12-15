package com.hudini.decorator;

import com.hudini.component.GunComponent;
/*
 * 데코레이터 패턴은 주어진 상황 및 용도에 따라 어떤 객체에 책임을 덧붙이는 패턴으로, 기능 확장이 필요할 때
 * 서브 클래싱 대신 쓸 수 잇는 유연한 대안이 될 수 있다.
 * 객체 지향 프로그래밍 OCP 원칙에 맞추는 것으로 보인다.  
 */
public abstract class GunDecorator implements GunComponent {
	protected GunComponent gunComponent;
	public GunDecorator(GunComponent gunComponent){
		this.gunComponent = gunComponent;
	}
}
