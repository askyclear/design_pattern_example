package com.hudini.concreatecomponent;

import com.hudini.component.GunComponent;
/*
 * ������Ʈ �������̽��� implement �Ͽ� �Ʒ��� ���� �����Ѵ�. ���� ���ڷ����� ������ ������ ������
 * �Ʒ� ������ �������̽� ���� ����� �� �մ�.
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
