package com.hudini.implementor;
/*
 * 구현 클래스를 위한 인터페이스를 정의한다.
 */
public interface MoveAction {
	public void moveXY();
	public void attack();
	public void defence();
	public int getMoveX();
	public int getMoveY();
}
