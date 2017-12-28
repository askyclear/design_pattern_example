package com.hudini.concreateChain;

import com.hudini.model.GameCharacter;

public abstract class QuestNpc {
	protected QuestNpc next;
	/*
	 * ���� å���ڸ� ������ �ִ� �޼ҵ��̴�. next�� ������ ��� quest �޼ҵ忡�� ó���� ���� ��� ���� QuestNpc����
	 * ������ �ϵ��� å���� �����Ѵ�.
	 */
	public QuestNpc setNext(QuestNpc next){
		this.next = next;
		return next;
	}
	abstract public void quest(GameCharacter gameCharacter);
	public void notQuester(GameCharacter gameCharacter){
		System.out.println("����Ʈ�� �ټ� �ִ� ��밡 �ƴմϴ�.");
		System.out.println("������ : "+gameCharacter.getGameKind()+" Ŭ���� : "+gameCharacter.getGameClass());
	}
	
}
