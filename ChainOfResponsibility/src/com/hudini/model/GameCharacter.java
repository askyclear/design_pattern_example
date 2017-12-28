package com.hudini.model;

public class GameCharacter {
	private String gameKind;
	private String gameClass;
	public GameCharacter(String gameKind, String gameClass){
		this.gameKind = gameKind;
		this.gameClass = gameClass;
	}
	public String getGameKind() {
		return gameKind;
	}
	public void setGameKind(String gameKind) {
		this.gameKind = gameKind;
	}
	public String getGameClass() {
		return gameClass;
	}
	public void setGameClass(String gameClass) {
		this.gameClass = gameClass;
	}
	
}
