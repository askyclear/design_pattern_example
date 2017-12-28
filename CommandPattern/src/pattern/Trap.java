package pattern;

/**
 * Invoker 인 Trap은 Unit에게 어떤 동작을 가하는 Command를 세팅하고,
 * 클라이언트는 이를 발동시켜 동작을 진행시킬 수 있다.
 * 이 트랩은 처음 밟았을때는 대미지를 입지만, [두번째부터는 체력을 회복시켜준다] <- 이 조건이 이후 추가되었다고 가정
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
