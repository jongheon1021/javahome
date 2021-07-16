package 선택4반;

public class Baseball extends Sports{

	static int count;
	Baseball(){
		count++;
	}
	
	Baseball(String name, int player)
	{
		this();
		this.name = name;
		this.player = player;
	}
	
	public void rule() {
		System.out.println("야구는 공격과 수비로 구성하고 9명이 한팀이다.");
	}
	
	public static void main(String[] args) {
		// TOD O Auto-generated method stub
		Baseball bb = new Baseball("야구", 9);
	System.out.println("경기종목 :" + bb.getName());
	System.out.println("선수인원:" + bb.getPlayer());
	System.out.println("경기규칙:");
	bb.rule();
	}

}
