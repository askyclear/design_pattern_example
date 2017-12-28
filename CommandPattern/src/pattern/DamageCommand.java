package pattern;

public class DamageCommand implements Command {
	Unit target;
	
	public DamageCommand(Unit target) {
		this.target = target;
	}
	
	@Override
	public void action() {
		System.out.println(target.getName() + "은 데미지를 입었다!"); 
	}

}
