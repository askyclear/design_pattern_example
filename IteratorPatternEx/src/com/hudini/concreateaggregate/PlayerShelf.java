package com.hudini.concreateaggregate;

import java.util.ArrayList;
import java.util.List;

import com.hudini.aggregate.Aggregate;
import com.hudini.concreateiterator.PlayerShelfIterator;
import com.hudini.item.Player;
import com.hudini.iterator.Iterator;
/*
 * Aggregate역할이 결정한 인터페이스를 실제로 구현하는 일을 합니다.
 * players List 필드는 ArrayList로 설정하였습니다. 여기를 배열로 선언하여도 Iterator 부분에서는 next로 물품을 가져갈수 있습니다.
 * 즉 여기를 수정하여도 Iterator를 사용한 부분은 수정하지 않아도 되므로 재이용화를 촉진하였습니다.
 */
public class PlayerShelf implements Aggregate {
	private List<Player> players = new ArrayList<>();
	//생성자를 2개를 두어 기존 List 를 처음 셋팅 할수도 있습니다.
	public PlayerShelf(){
		
	}
	public PlayerShelf(List<Player> players){
		this.players.addAll(players);
	}
	public void addPlayer(Player player){
		players.add(player);
	}
	//Iterator 인스턴스를 반환합니다.
	@Override
	public Iterator iterator() {
		// PlayerShelfIterator에 자기 자신의 인스턴스를 넘겨 줍니다.
		return new PlayerShelfIterator(this);
	}
	public int getLength() {
		// TODO Auto-generated method stub
		return players.size();
	}
	public Player getPlayer(int index) {
		// TODO Auto-generated method stub
		return players.get(index);
	}

}
