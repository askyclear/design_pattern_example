package main;

import pattern.classpattern.ClassAdapterPattern;
import pattern.objectpattern.ObjectAdapterPattern;

/**
 * Adapter Pattern
 * @author gw
 * ����� ������ ������ ����� �ٸ� Ŭ������ �ϳ��� �������̽��� ������ ����ϱ� ���� ���ȴ�.
 * ������ ����ϴ� ������İ� ���������� ���� ������ �ϴ� Ŭ������ �߰��� ���, �� ���� �����ϰ� ����ϱ� ���� ����� ������ ����Ѵ�.
 * ���� �����ϸ� wrapper class�� �����ϸ� �ȴ�. ���� ��ü�� ���ϵ� � wrapper class�� ���� ��������� ���ʿ��� ó���Ѵ�.
 * 
 * �̿� ���� ����� ����ϴ� ������ OCP(Open Close Principal)�� ��ȯ����, �䱸������ ����ȴ� �ϴ���
 * ����� ��ü�� ����ϴ� ��ġ������ ������ ������ �Ͽ� Ȯ�强�� Ű�� �� �ִ�. - ȣȯ��
 * 
 * ���ڷ����� ���ϰ� ����� ���� �Ѵ� wrap �Ѵٴ� �Ϳ��� ���� �� ������,
 * ���ڷ����� ������ ����� ������ �߰��� �� �ǵ��� �ְ�
 * ����ʹ� �����ġ(Ŭ���̾�Ʈ)���� ��ü�� ��ȭ������ å���� �и��ϴµ� �� �ǵ��� �ִ�.
 */
public class Main {
	public static void main(String[] args) {
		ClassAdapterPattern cap = new ClassAdapterPattern();
		ObjectAdapterPattern oap = new ObjectAdapterPattern();
		
		cap.run();
		oap.run();
	}
}
