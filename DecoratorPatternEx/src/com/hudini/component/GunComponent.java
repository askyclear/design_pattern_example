package com.hudini.component;
/*
 * 생성 하고자 하는 컴포넌트의 인터페이스를 제시해준다.
 * 이것을 상속 받은 ConcreateComponent에서 아래 내용을 구현 한다.
 */
public interface  GunComponent {
	String getDescription();
	int cost();
	void Attack();
}
