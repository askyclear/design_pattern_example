package pattern;

import java.util.Random;

public abstract class Attacker {
	private static final double CRITICAL_DAMAGE_PERCENT = 1.5;

	abstract protected double getCriticalPercent();

	abstract protected double getAttackPoint();

	abstract protected String getUsername();

	public void printAttackLog() {
		Random rand = new Random(System.currentTimeMillis());
		boolean isCritical = getCriticalPercent() - (double) rand.nextInt(101) >= 0;
		System.out.println(getUsername() + "'s Attack Information");

		double calculatedDamage = getAttackPoint();
		if (isCritical) {
			calculatedDamage *= CRITICAL_DAMAGE_PERCENT;
			System.out.println("Damage : " + calculatedDamage + "(critical)");
		} else {
			System.out.println("Damage : " + calculatedDamage);
		}
	}
}
