package com.hudini.concreateiterator;

import com.hudini.concreateaggregate.PlayerShelf;
import com.hudini.item.Player;
import com.hudini.iterator.Iterator;
/*
 * Iterator�� ������ �������̽��� ������ �κ��Դϴ�. 
 * PlayerShelf�� player�� �˻��ϱ� ���� �ʵ� �Դϴ�.
 * index �ʵ�� ���� ��ġ�� ������ ���� �ʵ��Դϴ�.
 */
public class PlayerShelfIterator implements Iterator {
	private PlayerShelf playerShelf;
	private int index;
	//ó�� ������ �����ڴ� PlayerShelf�� ������ �Ķ���ͷ� �޽��ϴ�.
	public PlayerShelfIterator(PlayerShelf playerShelf){
		this.playerShelf = playerShelf;
		this.index = 0;
	}
	@Override
	public boolean hasNext() {
		//���� ��ġ�� playerShelf.getLength() �� palyersShelf ����Ʈ�� ���� ���̺��� �۴ٸ� true�� �ƹ̳� �������� �����Ƿ� false�� ��ȯ�մϴ�.
		if(index<playerShelf.getLength()){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public Object next() {
		//��Ȯ�� ���� �������� ��ȯ�ϸ鼭 ���� next�� ����ҽ� �������� �������� ���� index�� ���� ��ŵ�ϴ�.
		Player player = playerShelf.getPlayer(index);
		index++;
		return player;
	}

}
