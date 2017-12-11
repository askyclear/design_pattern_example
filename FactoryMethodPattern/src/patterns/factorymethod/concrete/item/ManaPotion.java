package patterns.factorymethod.concrete.item;

import patterns.factorymethod.Item;

public class ManaPotion implements Item {

	@Override
	public String getName() {
		return "마나포션";
	}

	@Override
	public void use() {
		System.out.println(getName() + "을 사용했습니다.");
	}

}
