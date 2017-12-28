import pattern.Command;
import pattern.DamageCommand;
import pattern.HealCommand;
import pattern.Trap;
import pattern.Unit;

public class MainClient {

	/**
	 * 구현을 분할하였기 때문에 추후 요구사항이
	 * 힐 다음에 공격, 계속 공격, 힐만 하는 새로운 트랩 추가 등이 생기더라도 계속하여 재활용이 가능하다.
	 */
	public static void main(String[] args) {
		Unit character = new Unit("구엠");
		Command trapDamageCommand = new DamageCommand(character);
		Command trapHeadCommand = new HealCommand(character);
		Trap trap = new Trap(trapDamageCommand, trapHeadCommand);
		
		trap.action(); // 첫 행위는 공격
		trap.action(); // 두번째 행위는 회복.
	}

}
