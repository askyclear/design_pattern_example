package pattern;

public class HealCommand implements Command {
	Unit target;
	
	public HealCommand(Unit target) {
		this.target = target;
	}
	
	@Override
	public void action() {
		System.out.println(target.getName() + "은 체력을 회복했다!"); 
	}

}
