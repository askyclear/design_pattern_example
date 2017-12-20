package com.hudini.abstraction;

import com.hudini.implementor.MoveAction;
/*
 * 추상 인터페이스를 정의한다. Implementor에 대한 레퍼런스를 유지한다.
 */
public abstract class Move {
	protected MoveAction moveImp;
	//interface 와 독립적으로 발전 되지만 그것을 활용하기 위해 추상인터페이스에는 interface를 상속받은 것을 받아야 한다.
	protected Move(MoveAction moveImp){
		this.moveImp = moveImp;
	}
	public abstract void move();
	public abstract void currentXY();
}
