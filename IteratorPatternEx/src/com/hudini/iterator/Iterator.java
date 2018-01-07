package com.hudini.iterator;
/*
 * Iteraotr�� �����۵��� �ϳ��� �����ϸ鼭 ���� ������ ���� ������ �����մϴ�. for������ �Ϲ������� ���� i�� �ǹ� �մϴ�.

 */
public interface Iterator {
	//hasNext()��  ���� ��Ұ� ������ �� true�� ��ȯ�ϰ� �����ؾ� �մϴ�.
	public abstract boolean hasNext();
	//next�� ȣ�� ������ ���� �������� ��ȯ�ϰ�, �� ���� next ȣ��� ��Ȯ�� ���� ��Ҹ� ��ȯ�ϵ��� ���λ��¸� ������� �ִ� ���ҵ� �մϴ�.
	public abstract Object next();
}
