package com.hudini.refineabstraction;

import com.hudini.abstraction.Move;
import com.hudini.implementor.MoveAction;
/*
 * 인터페이스를 확장한다.
 */
public class Move2D extends Move{
	private int curX,curY;
	public Move2D(int curX, int curY, MoveAction moveImp) {
		super(moveImp);
		this.curX = curX;
		this.curY = curY;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		moveImp.moveXY();
		curX += moveImp.getMoveX();
		curY += moveImp.getMoveY();
	}

	@Override
	public void currentXY() {
		// TODO Auto-generated method stub
		System.out.printf("Current X, Y : %d, %d\n",curX,curY);
	}
	

}
