package com.hudini.concreateChain;

import com.hudini.model.GameCharacter;

public abstract class QuestNpc {
	protected QuestNpc next;
	/*
	 * 다음 책임자를 설정해 주는 메소드이다. next에 설정된 대로 quest 메소드에서 처리를 못할 경우 다음 QuestNpc에게
	 * 진행을 하도록 책임을 전가한다.
	 */
	public QuestNpc setNext(QuestNpc next){
		this.next = next;
		return next;
	}
	abstract public void quest(GameCharacter gameCharacter);
	public void notQuester(GameCharacter gameCharacter){
		System.out.println("퀘스트를 줄수 있는 상대가 아닙니다.");
		System.out.println("종족명 : "+gameCharacter.getGameKind()+" 클래스 : "+gameCharacter.getGameClass());
	}
	
}
