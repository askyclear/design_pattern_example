package com.hudini.interfaceChain;

import com.hudini.concreateChain.QuestNpc;
import com.hudini.model.GameCharacter;

public class OckQuester extends QuestNpc{
	@Override
	public void quest(GameCharacter gameCharacter) {
		// TODO Auto-generated method stub
		if(gameCharacter.getGameKind().equals("ock")){
			System.out.println("��ũ���� ����Ʈ�� �ݴϴ�.");
			System.out.println("������ : "+gameCharacter.getGameKind()+" Ŭ���� : "+gameCharacter.getGameClass());
			System.out.println("���!���! ���!"
					+ "��⸦ �����Ͷ�!");
		}else if(next!=null){
			next.quest(gameCharacter);
		}else{
			notQuester(gameCharacter);
		}
	}
}
