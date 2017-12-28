package com.hudini.main;

import com.hudini.interfaceChain.ElfQuester;
import com.hudini.interfaceChain.HumanQuester;
import com.hudini.interfaceChain.OckQuester;
import com.hudini.model.GameCharacter;

/*
 * �ٴٴ��� ��α׸� �����Ͽ����ϴ�.
 * http://jjoreg.tistory.com/
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//player�� ���� �ΰ�, ��ũ, ����, �𸣴³��̴�.
		GameCharacter[] players = {new GameCharacter("humman","knight"),
				new GameCharacter("ock","warrior"),
				new GameCharacter("elf","magican"),
				new GameCharacter("unknown","unknown")
		};
		//������ 3���� ������ �Ѵ�.
		HumanQuester quester1 = new HumanQuester();
		OckQuester quester2 = new OckQuester();
		ElfQuester quester3 = new ElfQuester();
		//�����͵��� å���� ������ �ٸ� �����͵��� ������ �ش�.
		quester1.setNext(quester2);
		quester2.setNext(quester3);
		//������ ���� ���̻� �����͸� �� ���� ����.
		//�÷��̾���� ������1���� ����Ʈ�� �޶�� �Ѵ�.
		for(GameCharacter player:players){
			//�÷��̾���� ������1���� ����Ʈ�� �޶� ������ ������1�� �ΰ��� �޴´�. �ٸ� ������ �޶��ϸ� �ٸ� �����Ϳ��� å���� �ѱ���̴�.
			quester1.quest(player);
		}
	}

}
