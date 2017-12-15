package com.hudini.decorator;

import com.hudini.component.GunComponent;
/*
 * ���ڷ����� ������ �־��� ��Ȳ �� �뵵�� ���� � ��ü�� å���� �����̴� ��������, ��� Ȯ���� �ʿ��� ��
 * ���� Ŭ���� ��� �� �� �մ� ������ ����� �� �� �ִ�.
 * ��ü ���� ���α׷��� OCP ��Ģ�� ���ߴ� ������ ���δ�.  
 */
public abstract class GunDecorator implements GunComponent {
	protected GunComponent gunComponent;
	public GunDecorator(GunComponent gunComponent){
		this.gunComponent = gunComponent;
	}
}
