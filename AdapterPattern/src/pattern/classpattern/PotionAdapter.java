package pattern.classpattern;

public class PotionAdapter extends OldPotion implements Potion {
	@Override
	public void usePotion() {
		use();
	}
}
