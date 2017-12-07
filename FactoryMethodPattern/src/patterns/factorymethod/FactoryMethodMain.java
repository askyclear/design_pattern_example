package patterns.factorymethod;

import patterns.factorymethod.concrete.factory.PotionFactory;
import patterns.factorymethod.concrete.item.HealthPotion;
import patterns.factorymethod.concrete.item.ManaPotion;

/**
 * ���丮 �޼ҵ� ������ ����.
 * 
 * ���丮 �޼ҵ带 ���������μ� ������ �����Ǵ� �κа� Ȱ��Ǵ� �κ��� ���� �� �ִ�.
 * ���� new �ϴ� �ͺ��� Factory Pattern�� ���� ������,
 * ���� new Object�� ���Ӽ��� ������ �ִ� ���, �ش� ������Ʈ�� ����ϴ� ��� ��ġ���� ������ �Ͼ�� �ϹǷ� SRP ��Ģ�� ����� �� �ֱ� �����̴�.
 * ���� �α�� ���� ��ó���� �ʿ��� ��� Factory��� �ϳ��� �������� ó���� �� �����Ƿ� ������ ����������.
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
