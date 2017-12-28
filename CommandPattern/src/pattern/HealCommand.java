package pattern;

public class HealCommand implements Command {
	Unit target;
	
	public HealCommand(Unit target) {
		this.target = target;
	}
	
	@Override
	public void action() {
		System.out.println(target.getName() + "�� ü���� ȸ���ߴ�!"); 
	}

}
