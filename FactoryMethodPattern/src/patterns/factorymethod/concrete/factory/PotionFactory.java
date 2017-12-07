package patterns.factorymethod.concrete.factory;

import patterns.factorymethod.Item;
import patterns.factorymethod.ItemFactory;
import patterns.factorymethod.concrete.item.HealthPotion;
import patterns.factorymethod.concrete.item.ManaPotion;

/**
 * ItemFactory의 실 구현체. 해당 클래스는 포션을 생성한다.
 * 포션의 타입을 입력받으면 오브젝트를 생성, 오브젝트 생성에 대한 로그를 기록한 후 객체를 반환한다.
 * 각 포션별로 팩토리를 만들거나, 하나의 팩토리에서 관련성 있는(같은 동작으로 생성되는)아이템을 모으는 것은 선택사항이다.
 * 
 * @author gwlee
 * @see ItemFactory
 */
public class PotionFactory implements ItemFactory {
	@Override
	public Item createItem(String type) {
		switch (type) {
		case "HealthPotion":
			HealthPotion healthPotion = (HealthPotion) createConcreteObject(HealthPotion.class);
			logToDatabase(healthPotion.getName(), healthPotion.hashCode());
			return healthPotion;
		case "ManaPotion":
			ManaPotion manaPotion = (ManaPotion) createConcreteObject(ManaPotion.class);
			logToDatabase(manaPotion.getName(), manaPotion.hashCode());
			return manaPotion;
		}
		throw new RuntimeException("존재하지 않는 포션명");
	}

	private void logToDatabase(String itemType, int hashCode) {
		System.out.println(itemType + "이 생성되었습니다. HashCode : " + hashCode);
	}

	/**
	 * 클래스명을 받아, 해당 클래스에 해당하는 객체를 만들어낸다.
	 * @param clazz 생성할 클래스. 클래스는 Item의 서브클래스여야 한다.
	 * @return simple instance
	 */
	private Object createConcreteObject(Class<? extends Item> clazz) {
		try {
			Object newInstance = clazz.newInstance();
			return newInstance;
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
}
