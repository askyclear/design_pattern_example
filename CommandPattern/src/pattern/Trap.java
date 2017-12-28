package pattern;

/**
 * Invoker �� Trap�� Unit���� � ������ ���ϴ� Command�� �����ϰ�,
 * Ŭ���̾�Ʈ�� �̸� �ߵ����� ������ �����ų �� �ִ�.
 * �� Ʈ���� ó�� ��������� ������� ������, [�ι�°���ʹ� ü���� ȸ�������ش�] <- �� ������ ���� �߰��Ǿ��ٰ� ����
 */
public class Trap {
	Command firstActionCommand;
	Command secondActionCommand;
	boolean isActioned = false;
	
	public Trap(Command first, Command second) {
		firstActionCommand = first;
		secondActionCommand = second;
	}
	
	public void action() {
		if(!isActioned) {
			firstActionCommand.action();
		} else {
			secondActionCommand.action();
		}
	}
	
}
