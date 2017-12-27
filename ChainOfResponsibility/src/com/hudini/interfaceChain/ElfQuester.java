package com.hudini.interfaceChain;

import com.hudini.concreateChain.QuestNpc;
import com.hudini.model.GameCharacter;

public class ElfQuester extends QuestNpc{
	@Override
	public void quest(GameCharacter gameCharacter) {
		// TODO Auto-generated method stub
		if(gameCharacter.getGameKind().equals("elf")){
			System.out.println("엘프에게 퀘스트를 줍니다.");
			System.out.println("종족명 : "+gameCharacter.getGameKind()+" 클래스 : "+gameCharacter.getGameClass());
			System.out.println("인간과의 친밀도를 50이상 만들어라!(3명)");
		}else if(next!=null){
			next.quest(gameCharacter);
		}else{
			notQuester(gameCharacter);
		}
	}
}
