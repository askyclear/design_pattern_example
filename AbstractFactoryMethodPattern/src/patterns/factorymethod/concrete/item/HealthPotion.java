package patterns.factorymethod.concrete.item;

import patterns.abstractfactorymethod.Item;

public class HealthPotion implements Item{

	@Override
	public String getName() {
		return "체력포션";
	}

	@Override
	public void use() {
		System.out.println(getName() + "을 사용하였습니다.");
	}

}
