package com.hudini.concreatecomponent;


import com.hudini.component.GunComponent;
/*
 * ������Ʈ �������̽��� implement �Ͽ� �Ʒ��� ���� �����Ѵ�. ���� ���ڷ����� ������ ������ ������
 * �Ʒ� ������ �������̽� ���� ����� �� �մ�.
 */
public class Ak47 implements GunComponent{

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "this is Ak47";
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return 4000;
	}

	@Override
	public void Attack() {
		// TODO Auto-generated method stub
		System.out.println("Ak47 Attack");
		
	}
	

}
