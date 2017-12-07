package patterns.factorymethod.concrete.item;

import patterns.factorymethod.Item;

public class ManaPotion implements Item {

	@Override
	public String getName() {
		return "��������";
	}

	@Override
	public void use() {
		System.out.println(getName() + "�� ����߽��ϴ�.");
	}

}
