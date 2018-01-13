import java.util.ArrayList;
import java.util.List;

import com.hudini.concreateaggregate.PlayerShelf;
import com.hudini.item.Player;
import com.hudini.iterator.Iterator;

public class Main {
	public static void main(String[] args) {
		Player player1 = new Player("���","vvvb78","********");
		Player player2 = new Player("�뼱","askyclear","***********");
		Player player3 = new Player("����","dnlwls018","������!*");
		Player player4 = new Player("��ǥ","�߸𸣰���","*********");
		Player player5 = new Player("���","�Ƶ���","********");
		
		Player[] players1 = {player1,player2,player3,player4,player5};
		// palyer �迭�� ���
		System.out.println("�迭�� ��� �Դϴ�.");
		for(int i=0; i <players1.length;i++){
			System.out.println("�̸� : " + players1[i].getName());
			System.out.println("���̵� : " +players1[i].getId());
		}
		
		List<Player> players2 = new ArrayList<>();
		players2.add(player1);
		players2.add(player2);
		players2.add(player3);
		players2.add(player4);
		players2.add(player5);
		// list�� ���
		System.out.println("list�� ��� �Դϴ�.");
		for(Player player:players2){
			System.out.println("�̸� : " + player.getName());
			System.out.println("���̵� : " +player.getId());
		}
		PlayerShelf playerShelf = new PlayerShelf(players2);
		Iterator iterator = playerShelf.iterator();
		//iteraotr�� ���
		System.out.println("iterator�� ��� �Դϴ�.");
		while(iterator.hasNext()){
			Player player = (Player)iterator.next();
			System.out.println("�̸� : " + player.getName());
			System.out.println("���̵� : " +player.getId());
		}
	}
}
