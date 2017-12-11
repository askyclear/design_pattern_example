package patterns.factorymethod;

import patterns.factorymethod.concrete.factory.PotionFactory;
import patterns.factorymethod.concrete.item.HealthPotion;
import patterns.factorymethod.concrete.item.ManaPotion;

/**
 * 팩토리 메소드 패턴의 구현.
 * 
 * 팩토리 메소드를 구현함으로서 객제가 구현되는 부분과 활용되는 부분을 나눌 수 있다.
 * 직접 new 하는 것보다 Factory Pattern이 나은 이유는,
 * 만약 new Object의 종속성에 변동이 있는 경우, 해당 오브젝트를 사용하는 모든 위치에서 변동이 일어나야 하므로 SRP 원칙에 위배될 수 있기 때문이다.
 * 또한 로깅과 같은 전처리가 필요한 경우 Factory라는 하나의 공간에서 처리할 수 있으므로 관리가 용이해진다.
 * @author gwlee
 *
 */
public class FactoryMethodMain{
	public void run() {
		PotionFactory factory = new PotionFactory();
		
		HealthPotion hpPotion = (HealthPotion) factory.createItem("HealthPotion");
		ManaPotion mpPotion = (ManaPotion) factory.createItem("ManaPotion");
		
		hpPotion.use();
		mpPotion.use();
	}
}
