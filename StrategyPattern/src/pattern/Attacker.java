package pattern;

/**
 * 공격자는 공격을 할 수 있다.
 * 하지만 공격은 원거리 공격일수도, 근거리 공격일수도 있다.
 * 
 * 그에따라 Attacker를 MeleeAttacker, RangedAttacker로 나누고,
 * 각자 구현하는 방법도 있을 것이다.
 * 
 * 하지만 해당 객체별로 어떤 RangedAttacker는 마법공격이고, 어떤 것은 물리공격이라서 또 나눈다면?
 * 아니면 다른 메소드는 동일하지만 해당 부분만 달라서 다른 부분의 코드 중복이 일어난다면?
 * 
 * 이러한 중복을 제거하기 위해 전략 패턴을 사용한다.
 */
public class Attacker {
	Attack attack;
	
	protected Attacker(Attack attack) {
		this.attack = attack;
	}
	
	public void performAttack() {
		attack.doAttack();
	}
}
