package pattern.objectpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * ������ ��ü�� use��� �Լ��� ������.
 * �̷� ��� �Ʒ��Ͱ��� wrapping �ؼ� ����ϸ� ������ �������̽��� ������ ��ü�� ���۽�ų �� �ִ�.
 */
public class ObjectAdapterPattern {
	public void run() {
		List<INewPotion> potions = new ArrayList<>();
		
		potions.add(new OldPotionAdapter(new OldPotion()));
		potions.add(new NewPotion());
		
		for(INewPotion potion : potions)
			potion.usePotion();
	}
}
