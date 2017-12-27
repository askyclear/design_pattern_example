package com.hudini.interfaceChain;

import com.hudini.concreateChain.QuestNpc;
import com.hudini.model.GameCharacter;

public class OckQuester extends QuestNpc{
	@Override
	public void quest(GameCharacter gameCharacter) {
		// TODO Auto-generated method stub
		if(gameCharacter.getGameKind().equals("ock")){
			System.out.println("오크에게 퀘스트를 줍니다.");
			System.out.println("종족명 : "+gameCharacter.getGameKind()+" 클래스 : "+gameCharacter.getGameClass());
			System.out.println("고기!고기! 고기!"
					+ "고기를 가져와라!");
		}else if(next!=null){
			next.quest(gameCharacter);
		}else{
			notQuester(gameCharacter);
		}
	}
}
