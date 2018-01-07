package com.hudini.concreateaggregate;

import java.util.ArrayList;
import java.util.List;

import com.hudini.aggregate.Aggregate;
import com.hudini.concreateiterator.PlayerShelfIterator;
import com.hudini.item.Player;
import com.hudini.iterator.Iterator;
/*
 * Aggregate������ ������ �������̽��� ������ �����ϴ� ���� �մϴ�.
 * players List �ʵ�� ArrayList�� �����Ͽ����ϴ�. ���⸦ �迭�� �����Ͽ��� Iterator �κп����� next�� ��ǰ�� �������� �ֽ��ϴ�.
 * �� ���⸦ �����Ͽ��� Iterator�� ����� �κ��� �������� �ʾƵ� �ǹǷ� ���̿�ȭ�� �����Ͽ����ϴ�.
 */
public class PlayerShelf implements Aggregate {
	private List<Player> players = new ArrayList<>();
	//�����ڸ� 2���� �ξ� ���� List �� ó�� ���� �Ҽ��� �ֽ��ϴ�.
	public PlayerShelf(){
		
	}
	public PlayerShelf(List<Player> players){
		this.players.addAll(players);
	}
	public void addPlayer(Player player){
		players.add(player);
	}
	//Iterator �ν��Ͻ��� ��ȯ�մϴ�.
	@Override
	public Iterator iterator() {
		// PlayerShelfIterator�� �ڱ� �ڽ��� �ν��Ͻ��� �Ѱ� �ݴϴ�.
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
