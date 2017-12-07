package patterns.factorymethod.concrete.factory;

import patterns.factorymethod.Item;
import patterns.factorymethod.ItemFactory;
import patterns.factorymethod.concrete.item.HealthPotion;
import patterns.factorymethod.concrete.item.ManaPotion;

/**
 * ItemFactory�� �� ����ü. �ش� Ŭ������ ������ �����Ѵ�.
 * ������ Ÿ���� �Է¹����� ������Ʈ�� ����, ������Ʈ ������ ���� �α׸� ����� �� ��ü�� ��ȯ�Ѵ�.
 * �� ���Ǻ��� ���丮�� ����ų�, �ϳ��� ���丮���� ���ü� �ִ�(���� �������� �����Ǵ�)�������� ������ ���� ���û����̴�.
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
		throw new RuntimeException("�������� �ʴ� ���Ǹ�");
	}

	private void logToDatabase(String itemType, int hashCode) {
		System.out.println(itemType + "�� �����Ǿ����ϴ�. HashCode : " + hashCode);
	}

	/**
	 * Ŭ�������� �޾�, �ش� Ŭ������ �ش��ϴ� ��ü�� ������.
	 * @param clazz ������ Ŭ����. Ŭ������ Item�� ����Ŭ�������� �Ѵ�.
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
