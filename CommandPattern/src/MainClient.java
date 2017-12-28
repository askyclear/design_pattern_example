import pattern.Command;
import pattern.DamageCommand;
import pattern.HealCommand;
import pattern.Trap;
import pattern.Unit;

public class MainClient {

	/**
	 * ������ �����Ͽ��� ������ ���� �䱸������
	 * �� ������ ����, ��� ����, ���� �ϴ� ���ο� Ʈ�� �߰� ���� ������� ����Ͽ� ��Ȱ���� �����ϴ�.
	 */
	public static void main(String[] args) {
		Unit character = new Unit("����");
		Command trapDamageCommand = new DamageCommand(character);
		Command trapHeadCommand = new HealCommand(character);
		Trap trap = new Trap(trapDamageCommand, trapHeadCommand);
		
		trap.action(); // ù ������ ����
		trap.action(); // �ι�° ������ ȸ��.
	}

}
