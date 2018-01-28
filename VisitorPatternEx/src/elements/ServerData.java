package elements;

import visitor.DataBaseVisitor;

public class ServerData implements DataBaseElement{
	private String serverName;
	private final int MAX_COUNT = 99;
	private int cur_count;
	public ServerData(){
		this.serverName="1서버";
		this.cur_count = 0;
	}
	public ServerData(String name, int cur_count){
		this.serverName = name;
		if(cur_count<MAX_COUNT){
			this.cur_count = cur_count+1;
		}else{
			System.out.println("더이상 유저를 추가할수 없습니다.");
		}
	}
	@Override
	public void accept(DataBaseVisitor visitor) {
		visitor.visit(this);
	}
	public String getServerName(){
		return serverName;
	}
	public int getCurCount(){
		return cur_count;
	}
}
