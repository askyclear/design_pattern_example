package pattern;

import pattern.loaders.CharacterLoader;
import pattern.loaders.ItemLoader;
import pattern.loaders.MapLoader;

/*
 * Facade ������ ������ �����ߴ� ����Ŭ�������� �ѵ���� ����Ϸ��µ� �� �ǵ��� �ִ�. - �ܼ�ȭ
 * ���� �л�Ǿ��ִ� API�� �ѹ��� wrapping �ؼ� �����ϰ� ����Ϸ��� �ϰų�,
 * �Ϸ��� ������ �����Ǿ��ִ� ����(��ǻ�Ͱ� �����µ� �� ��ǰ���� ���ʴ�� �����Ǿ���Ѵ�)�� �ִ� ��� �̸� ����� �� �ִ�.
 * 
 * */
public class GameLoaderFacade {
	public void loadGame() {
		CharacterLoader characterLoader = new CharacterLoader();
		ItemLoader itemLoader = new ItemLoader();
		MapLoader mapLoader = new MapLoader();
		
		mapLoader.mapLoad();
		itemLoader.loadItem();
		characterLoader.loadCharacter();
		System.out.println("load Complete!");
	}

}
