package patterns.factorymethod;

import patterns.factorymethod.concrete.factory.PotionFactory;

/**
 * Item 클래스를 생성해내는 팩토리 인터페이스
 * @author gwlee
 * @see PotionFactory
 */
public interface ItemFactory {
	Item createItem(String type);
}
