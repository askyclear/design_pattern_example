import pattern.impl.MeleeAttacker;
import pattern.impl.RangedAttacker;

/**
 * Strategy Pattern 의 주요 의도는
 * 변경점이 있을 법한 위치를 Interface로 빼서 행동을 구현측에 맡겨 클래스의 변경가능성을 낮추고,
 * 결과적으로 클래스의 변화없이 재사용성을 높이는 데 있다.
 * 
 * GoF Design Pattern에서 자주 거론되는 패턴 중 하나이다.
 *
 */
public class Main {
	public static void main(String[] args) {
		MeleeAttacker melee = new MeleeAttacker();
		RangedAttacker ranged = new RangedAttacker();
		
		melee.performAttack();
		ranged.performAttack();
	}
}
