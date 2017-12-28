package com.hudini.flyweightconcreate;

import com.hudini.flyweight.Monster;

public class MonsterImp implements Monster{
	private final String name;
	private final int maxLife;
	private final String imageURL;
	public MonsterImp(String name, int maxLife, String imageURL){
		this.name = name;
		this.maxLife = maxLife;
		this.imageURL = imageURL;
	}
	@Override
	public void monsterInfo() {
		// TODO Auto-generated method stub
		System.out.println("Name : " + name + " Max Life : " + maxLife
							+" Image : " + imageURL);
	}
	public String getMonsterName(){
		return name;
	}
	public int getMonsterMaxLife(){
		return maxLife;
	}
	public String getMonsterURL(){
		return imageURL;
	}
}
