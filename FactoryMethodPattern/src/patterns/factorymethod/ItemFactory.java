package patterns.factorymethod;

import patterns.factorymethod.concrete.factory.PotionFactory;

/**
 * Item Ŭ������ �����س��� ���丮 �������̽�
 * @author gwlee
 * @see PotionFactory
 */
public interface ItemFactory {
	Item createItem(String type);
}
