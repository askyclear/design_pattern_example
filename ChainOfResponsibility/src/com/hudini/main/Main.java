package com.hudini.main;

import com.hudini.interfaceChain.ElfQuester;
import com.hudini.interfaceChain.HumanQuester;
import com.hudini.interfaceChain.OckQuester;
import com.hudini.model.GameCharacter;

/*
 * 다다님의 블로그를 참조하였습니다.
 * http://jjoreg.tistory.com/
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//player는 각자 인간, 오크, 엘프, 모르는놈이다.
		GameCharacter[] players = {new GameCharacter("humman","knight"),
				new GameCharacter("ock","warrior"),
				new GameCharacter("elf","magican"),
				new GameCharacter("unknown","unknown")
		};
		//퀘스터 3명을 생성을 한다.
		HumanQuester quester1 = new HumanQuester();
		OckQuester quester2 = new OckQuester();
		ElfQuester quester3 = new ElfQuester();
		//퀘스터들은 책임을 전가할 다른 퀘스터들을 설정해 준다.
		quester1.setNext(quester2);
		quester2.setNext(quester3);
		//마지막 놈은 더이상 퀘스터를 줄 놈이 없다.
		//플레이어들은 퀘스터1에게 퀘스트를 달라고 한다.
		for(GameCharacter player:players){
			//플레이어들은 퀘스터1에게 퀘스트를 달라 하지만 퀘스터1은 인간만 받는다. 다른 종족이 달라하면 다른 퀘스터에게 책임을 넘길것이다.
			quester1.quest(player);
		}
	}

}
