package pattern.classpattern;

/**
 * Object Adapter�� �ٸ� ���� ����� ��ü�� ���߻���� ���� ���� ��üó�� ���ȴٴ� ���̴�.
 * �ڹٿ����� ���߻���� ������ ��ŭ ��ü����Ͱ� �� ���������� ������ �ʹ�.
 * 
 */
public class ClassAdapterPattern {
	public void run() {
		PotionAdapter potion = new PotionAdapter();
		potion.usePotion();
	}
}
