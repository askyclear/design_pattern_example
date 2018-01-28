package pattern;

public class Theif extends Attacker {

	@Override
	protected double getCriticalPercent() {
		return 75.0;
	}

	@Override
	protected double getAttackPoint() {
		return 85.5;
	}

	@Override
	protected String getUsername() {
		return "Theif";
	}

}
