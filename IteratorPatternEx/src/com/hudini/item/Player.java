package com.hudini.item;
/*
 * List�� ���� �⺻ Item�Դϴ�.
 */
public class Player {
	private String name;
	private String id;
	private String password;
	public Player(String name, String id, String password){
		this.name = name;
		this.id = id;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public String getPassword() {
		return password;
	}
	
}
