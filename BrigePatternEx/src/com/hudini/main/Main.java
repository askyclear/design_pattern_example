package com.hudini.main;

import com.hudini.abstraction.Move;
import com.hudini.concreteimplementor.MoveActionImp;
import com.hudini.refineabstraction.Move2D;
/*
 * Move �� �߻� Ŭ�����̱� ������ Move�� ��� ���� Move2D�� ���;
 */
public class Main {
	public static void main(String[] args) {
		//�߻� Ŭ������ ���� �κ��� �и� �Ͽ���. MoveAction�� �����ΰ��� ���� ���� ����� �޶���.
		Move move = new Move2D(0,0,new MoveActionImp());
		
			move.move();
			move.currentXY();
			move.move();
			move.currentXY();
	}
}
