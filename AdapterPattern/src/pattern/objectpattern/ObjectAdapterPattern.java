package pattern.objectpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 기존의 객체는 use라는 함수가 없었다.
 * 이런 경우 아래와같이 wrapping 해서 사용하면 동일한 인터페이스로 기존의 객체를 동작시킬 수 있다.
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
