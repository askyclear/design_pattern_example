package com.hudini.interfaceChain;

import com.hudini.concreateChain.QuestNpc;
import com.hudini.model.GameCharacter;

public class ElfQuester extends QuestNpc{
	@Override
	public void quest(GameCharacter gameCharacter) {
		// TODO Auto-generated method stub
		if(gameCharacter.getGameKind().equals("elf")){
			System.out.println("�������� ����Ʈ�� �ݴϴ�.");
			System.out.println("������ : "+gameCharacter.getGameKind()+" Ŭ���� : "+gameCharacter.getGameClass());
			System.out.println("�ΰ����� ģ�е��� 50�̻� ������!(3��)");
		}else if(next!=null){
			next.quest(gameCharacter);
		}else{
			notQuester(gameCharacter);
		}
	}
}
