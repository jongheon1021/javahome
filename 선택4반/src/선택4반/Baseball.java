package ����4��;

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
		System.out.println("�߱��� ���ݰ� ����� �����ϰ� 9���� �����̴�.");
	}
	
	public static void main(String[] args) {
		// TOD O Auto-generated method stub
		Baseball bb = new Baseball("�߱�", 9);
	System.out.println("������� :" + bb.getName());
	System.out.println("�����ο�:" + bb.getPlayer());
	System.out.println("����Ģ:");
	bb.rule();
	}

}
