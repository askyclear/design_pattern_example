package main;

import elements.CharactorData;
import elements.ItemData;
import elements.ServerData;
import elements.TotalData;
import visitor.PrintVisitor;
import visitor.StoreVisitor;

/* 비지터 패턴은 알고리즘을 객체 구조에서 분리시키는 디자인패턴이다.
 * 이렇게 분리를 하면 구조를 수정하지 않고도 실질적으로 새로운 동작을 기존의 객체 구조에 추가할 수 있게 된다.(Wiki 설명)
 * 하나의 객체에 여러 동작하게 하는 전략패턴, 하나의 객체에 하나의 동작(+보조동작) 하는 커맨드 패턴
 * N개의 객체에 N개의 동작
 * N:N 관계
 * 테스트를 하는 곳. visitor를 상속받는 visitor 클래스를 생성하고, 이를
 * 엘리먼트를 상속 및 관리하는 하나의 클래스에게 accept 시킨다.
 * 
 */
public class Main {

	public static void main(String[] args) {
		TotalData totalData = new TotalData();
		ItemData itemData = new ItemData("밥","기본창","음식");
		ServerData serverData = new ServerData("마루",3);
		totalData.accept(new PrintVisitor());
		totalData.accept(new StoreVisitor());
		//별개로 정보를 집어 넣는다 해보자;
		System.out.println();
		totalData = new TotalData(itemData,serverData,new CharactorData());
		totalData.accept(new PrintVisitor());
		totalData.accept(new StoreVisitor());
	}

}
