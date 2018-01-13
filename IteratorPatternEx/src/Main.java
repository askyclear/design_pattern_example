import java.util.ArrayList;
import java.util.List;

import com.hudini.concreateaggregate.PlayerShelf;
import com.hudini.item.Player;
import com.hudini.iterator.Iterator;

public class Main {
	public static void main(String[] args) {
		Player player1 = new Player("기웅","vvvb78","********");
		Player player2 = new Player("대선","askyclear","***********");
		Player player3 = new Player("위진","dnlwls018","최종혁!*");
		Player player4 = new Player("성표","잘모르겠음","*********");
		Player player5 = new Player("우용","궴따먹","********");
		
		Player[] players1 = {player1,player2,player3,player4,player5};
		// palyer 배열일 경우
		System.out.println("배열일 경우 입니다.");
		for(int i=0; i <players1.length;i++){
			System.out.println("이름 : " + players1[i].getName());
			System.out.println("아이디 : " +players1[i].getId());
		}
		
		List<Player> players2 = new ArrayList<>();
		players2.add(player1);
		players2.add(player2);
		players2.add(player3);
		players2.add(player4);
		players2.add(player5);
		// list일 경우
		System.out.println("list일 경우 입니다.");
		for(Player player:players2){
			System.out.println("이름 : " + player.getName());
			System.out.println("아이디 : " +player.getId());
		}
		PlayerShelf playerShelf = new PlayerShelf(players2);
		Iterator iterator = playerShelf.iterator();
		//iteraotr일 경우
		System.out.println("iterator일 경우 입니다.");
		while(iterator.hasNext()){
			Player player = (Player)iterator.next();
			System.out.println("이름 : " + player.getName());
			System.out.println("아이디 : " +player.getId());
		}
	}
}
