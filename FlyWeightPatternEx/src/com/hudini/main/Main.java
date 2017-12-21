package com.hudini.main;

import com.hudini.flyweight.Monster;
import com.hudini.flyweightfactory.MonsterFactory;

public class Main {
	public static void main(String[] args) {
		
		Monster mon0 = MonsterFactory.create("ø¿≈©", 100, "/image/ork.png");
		Monster mon1 = MonsterFactory.create("µÂ∑°∞Ô", 100000, "/image/dragon.png");
		
		Monster mon2 = MonsterFactory.getMonster("ø¿≈©");
		Monster mon3 = MonsterFactory.getMonster("µÂ∑°∞Ô");
		Monster mon4 = MonsterFactory.getMonster("∞Ì∫Ì∏∞");
		
		
		if(mon2!=null)
			mon2.monsterInfo();
		if(mon3!=null)
			mon3.monsterInfo();
		if(mon4!=null)
			mon4.monsterInfo();
		if(mon0 == mon2){
			mon0.monsterInfo();
			System.out.println("mon0 & mon2 ∞∞¿∫ ∞¥√º");
		}
		if(mon1 == mon3){
			mon1.monsterInfo();
			System.out.println("mon1 & mon3 ∞∞¿∫ ∞¥√º");
		}
		
	}
}
