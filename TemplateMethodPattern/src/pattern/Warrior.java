package pattern;

public class Warrior extends Attacker {

	@Override
	protected double getCriticalPercent() {
		return 0.0;
	}

	@Override
	protected double getAttackPoint() {
		return 100.0;
	}

	@Override
	protected String getUsername() {
		return "warrior";
	}

}
