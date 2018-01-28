package main;

import pattern.Theif;
import pattern.Warrior;

public class Main {

	public static void main(String[] args) {
		Warrior warrior = new Warrior();
		Theif theif = new Theif();

		warrior.printAttackLog();
		theif.printAttackLog();
	}

}
