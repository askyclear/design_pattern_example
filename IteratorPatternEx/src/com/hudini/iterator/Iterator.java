package com.hudini.iterator;
/*
 * Iteraotr는 아이템들을 하나씩 나열하면서 루프 변수와 같은 역할을 수행합니다. for문에서 일반적으로 변수 i를 의미 합니다.

 */
public interface Iterator {
	//hasNext()는  다음 요소가 존재할 시 true를 반환하게 구현해야 합니다.
	public abstract boolean hasNext();
	//next를 호출 했을때 현재 아이템을 반환하고, 그 다음 next 호출시 정확히 다음 요소를 반환하도록 내부상태를 진행시켜 주는 역할도 합니다.
	public abstract Object next();
}
