package com.hudini.product;

public class GameWeapon {
	private String job="";
	private String name="";
	private String content="";
	private int level=0;
	private int str=0;
	private int dex=0;
	private int intellect=0;
	private int damage=0;
	public void setJob(String job) {
		this.job = job;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public void setStr(int str) {
		this.str = str;
	}
	public void setDex(int dex) {
		this.dex = dex;
	}
	public void setIntellect(int intellect) {
		this.intellect = intellect;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name : " + this.name +"\n"+"job : " + this.job +"\n"+"content : " + this.content +"\n"+"level : " + this.level +"\n"
				+ "str : " + this.str +"\n" + "dex : " + this.dex +"\n"+ "demage : " +"int : " + this.intellect +"\n"+ this.damage +"\n"; 
	}
	
}
