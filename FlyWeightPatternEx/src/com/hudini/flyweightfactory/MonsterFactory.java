package com.hudini.flyweightfactory;

import java.util.HashMap;
import java.util.Map;

import com.hudini.flyweightconcreate.MonsterImp;
public class MonsterFactory {
	private static Map<String, MonsterImp> monster = new HashMap<String, MonsterImp>();
	
	public static MonsterImp create(String name, int maxLife, String monsterURL){
		MonsterImp monsterImp = monster.get(name);
		//�ִٸ� ���ο� ��ü�� �������� �ʴ´�.
		if(!(monster.containsKey(name))){
			//���ٸ� ���ο� ��ü�� ����.
			monsterImp = new MonsterImp(name,maxLife,monsterURL);
			monster.put(name, monsterImp);
		}
		return monster.get(name);
	}
	public static MonsterImp getMonster(String name){
		MonsterImp monsterImp = monster.get(name);
		return monsterImp;
	}
	public static int getNum(){
		return monster.size();
	}
}
