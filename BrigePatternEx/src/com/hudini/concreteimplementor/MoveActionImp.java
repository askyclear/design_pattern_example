package com.hudini.concreteimplementor;

import com.hudini.implementor.MoveAction;
/*
 * implementor �������̽��� �����Ѵ�. 
 */
public class MoveActionImp implements MoveAction{
	int x = 1;
	int y = 2;
	@Override
	public int getMoveX() {
		// TODO Auto-generated method stub
		return x;
	}

	@Override
	public int getMoveY() {
		// TODO Auto-generated method stub
		return y;
	}

	@Override
	public void moveXY() {
		System.out.printf("move x : %d, y : %d",x,y);
		
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.printf("Attack");
	}

	@Override
	public void defence() {
		// TODO Auto-generated method stub
		System.out.printf("Defence");
	}

}
