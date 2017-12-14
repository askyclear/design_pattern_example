package main;

import pattern.classpattern.ClassAdapterPattern;
import pattern.objectpattern.ObjectAdapterPattern;

/**
 * Adapter Pattern
 * @author gw
 * 어댑터 패턴은 구현된 방식이 다른 클래스를 하나의 인터페이스로 통일해 사용하기 위해 사용된다.
 * 기존에 사용하던 구현방식과 상이하지만 같은 동작을 하는 클래스가 추가된 경우, 이 둘을 유연하게 사용하기 위해 어댑터 패턴을 사용한다.
 * 쉽게 생각하면 wrapper class를 생각하면 된다. 기존 객체를 통일된 어떤 wrapper class로 덮어 실제사용은 이쪽에서 처리한다.
 * 
 * 이와 같은 방식을 사용하는 이유는 OCP(Open Close Principal)의 일환으로, 요구사항이 변경된다 하더라도
 * 변경된 객체를 사용하는 위치에서는 변경이 없도록 하여 확장성을 키울 수 있다. - 호환성
 * 
 * 데코레이터 패턴과 어댑터 패턴 둘다 wrap 한다는 것에서 같을 수 있으나,
 * 데코레이터 패턴은 기능의 유연한 추가에 그 의도가 있고
 * 어댑터는 사용위치(클라이언트)에서 객체의 변화에서의 책임을 분리하는데 그 의도가 있다.
 */
public class Main {
	public static void main(String[] args) {
		ClassAdapterPattern cap = new ClassAdapterPattern();
		ObjectAdapterPattern oap = new ObjectAdapterPattern();
		
		cap.run();
		oap.run();
	}
}
