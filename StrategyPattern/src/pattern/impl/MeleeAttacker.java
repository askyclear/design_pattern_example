package pattern.impl;

import pattern.Attacker;
import pattern.MeleeAttack;

public class MeleeAttacker extends Attacker{
	public MeleeAttacker() {
		super(new MeleeAttack());
	}
}
