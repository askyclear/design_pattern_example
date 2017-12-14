package pattern.classpattern;

/**
 * Object Adapter와 다른 점은 어댑터 자체가 다중상속을 통해 직접 객체처럼 사용된다는 것이다.
 * 자바에서는 다중상속을 금지한 만큼 객체어댑터가 더 직관적이지 않을까 싶다.
 * 
 */
public class ClassAdapterPattern {
	public void run() {
		PotionAdapter potion = new PotionAdapter();
		potion.usePotion();
	}
}
