package visitor;

import elements.CharactorData;
import elements.ItemData;
import elements.ServerData;
import elements.TotalData;

public class PrintVisitor implements DataBaseVisitor {

	@Override
	public void visit(ItemData itemData) {
		// TODO Auto-generated method stub
		String[] items = itemData.getItems();
		for(String item :items){
			System.out.println("소지아이템 : " + item);
		}
	}

	@Override
	public void visit(CharactorData charactorData) {
		// TODO Auto-generated method stub
		System.out.println("캐릭터 생성 완료");
	}

	@Override
	public void visit(ServerData serverData) {
		// TODO Auto-generated method stub
		System.out.println("서버 : " + serverData.getServerName());
		System.out.println("현재인원 : " + serverData.getCurCount());
	}

	@Override
	public void visit(TotalData totalData) {
		// TODO Auto-generated method stub
		System.out.println("--서버,캐릭터,아이템 정보--");
	}

}
