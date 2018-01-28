package visitor;

import elements.CharactorData;
import elements.ItemData;
import elements.ServerData;
import elements.TotalData;

public class StoreVisitor implements DataBaseVisitor {

	@Override
	public void visit(ItemData itemData) {
		// TODO Auto-generated method stub
		System.out.println("창고에 아이템을 저장합니다.");
	}

	@Override
	public void visit(CharactorData charactorData) {
		// TODO Auto-generated method stub
		System.out.println("캐릭터정보를 저장합니다.");
	}

	@Override
	public void visit(ServerData serverData) {
		// TODO Auto-generated method stub
		System.out.println(serverData.getServerName()+"에 정보 저장");
	}

	@Override
	public void visit(TotalData totalData) {
		// TODO Auto-generated method stub
		System.out.println("--서버,캐릭터,아이템 저장--");
	}

}
