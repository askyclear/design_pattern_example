package pattern;

import pattern.loaders.CharacterLoader;
import pattern.loaders.ItemLoader;
import pattern.loaders.MapLoader;

/*
 * Facade 패턴은 기존에 존재했던 서브클래스들을 한데모아 사용하려는데 그 의도가 있다. - 단순화
 * 과거 분산되어있던 API를 한번더 wrapping 해서 간단하게 사용하려고 하거나,
 * 일련의 과정이 고정되어있는 사용법(컴퓨터가 켜지는데 각 부품들이 차례대로 구동되어야한다)이 있는 경우 이를 사용할 수 있다.
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
