package patterns.factorymethod.concrete.item;

import patterns.factorymethod.Item;

public class HealthPotion implements Item{

	@Override
	public String getName() {
		return "ü������";
	}

	@Override
	public void use() {
		System.out.println(getName() + "�� ����Ͽ����ϴ�.");
	}

}
