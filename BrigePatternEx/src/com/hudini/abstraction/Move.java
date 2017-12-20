package com.hudini.abstraction;

import com.hudini.implementor.MoveAction;
/*
 * �߻� �������̽��� �����Ѵ�. Implementor�� ���� ���۷����� �����Ѵ�.
 */
public abstract class Move {
	protected MoveAction moveImp;
	//interface �� ���������� ���� ������ �װ��� Ȱ���ϱ� ���� �߻��������̽����� interface�� ��ӹ��� ���� �޾ƾ� �Ѵ�.
	protected Move(MoveAction moveImp){
		this.moveImp = moveImp;
	}
	public abstract void move();
	public abstract void currentXY();
}
