package com.hudini.implementor;
/*
 * ���� Ŭ������ ���� �������̽��� �����Ѵ�.
 */
public interface MoveAction {
	public void moveXY();
	public void attack();
	public void defence();
	public int getMoveX();
	public int getMoveY();
}
