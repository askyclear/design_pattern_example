package com.hudini.interfaceChain;

import com.hudini.concreateChain.QuestNpc;
import com.hudini.model.GameCharacter;

public class HumanQuester extends QuestNpc{

	@Override
	public void quest(GameCharacter gameCharacter) {
		// TODO Auto-generated method stub
		if(gameCharacter.getGameKind().equals("humman")){
			System.out.println("�ΰ����� ����Ʈ�� �ݴϴ�.");
			System.out.println("������ : "+gameCharacter.getGameKind()+" Ŭ���� : "+gameCharacter.getGameClass());
			System.out.println("��ũ��� 10����");
		}else if(next!=null){
			next.quest(gameCharacter);
		}else{
			notQuester(gameCharacter);
		}
	}
}
