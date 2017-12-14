package pattern.objectpattern;

public class OldPotionAdapter implements INewPotion{
	private OldPotion potion;
	public OldPotionAdapter(OldPotion potion) {
		this.potion = potion;
	}
	
	@Override
	public void usePotion() {
		potion.use();
	}
}
