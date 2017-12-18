package com.hudini.concreatedecorator;

import com.hudini.component.GunComponent;
import com.hudini.decorator.GunDecorator;
/*
 * ���ڷ����� ������ ������ �߻� Ŭ������ ��� ���� ���ڷ����� Ŭ������
 * �θ𿡰� GunComponet�� �־�ΰ� �����Ҷ����� super�� ���� ���� �����μ� ���� �θ� ���� ���� �ʰ� ��� ����.
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
		System.out.println("�Ѿ�");
	}

}
