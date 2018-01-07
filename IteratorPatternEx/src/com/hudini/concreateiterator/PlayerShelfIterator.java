package com.hudini.concreateiterator;

import com.hudini.concreateaggregate.PlayerShelf;
import com.hudini.item.Player;
import com.hudini.iterator.Iterator;
/*
 * Iterator가 결정한 인터페이스를 구현한 부분입니다. 
 * PlayerShelf는 player를 검색하기 위한 필드 입니다.
 * index 필드는 현재 위치를 가지기 위한 필드입니다.
 */
public class PlayerShelfIterator implements Iterator {
	private PlayerShelf playerShelf;
	private int index;
	//처음 생성시 생성자는 PlayerShelf를 생성자 파라미터로 받습니다.
	public PlayerShelfIterator(PlayerShelf playerShelf){
		this.playerShelf = playerShelf;
		this.index = 0;
	}
	@Override
	public boolean hasNext() {
		//현재 위치가 playerShelf.getLength() 즉 palyersShelf 리스트의 현재 길이보다 작다면 true를 아미녀 다음것이 없으므로 false를 반환합니다.
		if(index<playerShelf.getLength()){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public Object next() {
		//정확히 현재 아이템을 반환하면서 다음 next를 사용할시 다음것을 가져오기 위해 index를 증가 시킵니다.
		Player player = playerShelf.getPlayer(index);
		index++;
		return player;
	}

}
