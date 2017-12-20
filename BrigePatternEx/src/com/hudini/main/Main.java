package com.hudini.main;

import com.hudini.abstraction.Move;
import com.hudini.concreteimplementor.MoveActionImp;
import com.hudini.refineabstraction.Move2D;
/*
 * Move 는 추상 클래스이기 때문에 Move를 상속 받은 Move2D를 사용;
 */
public class Main {
	public static void main(String[] args) {
		//추상 클래스와 구현 부분을 분리 하였음. MoveAction이 무엇인가에 따라 동작 방식이 달라짐.
		Move move = new Move2D(0,0,new MoveActionImp());
		
			move.move();
			move.currentXY();
			move.move();
			move.currentXY();
	}
}
