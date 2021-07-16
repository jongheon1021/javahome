package ����4��;

public class Item {
	private int no;
	private String name;
	private int price;
	private int count;
	private static final String company = "��� ȸ��";
	private int ItemCnt;
	
	public Item() {
		ItemCnt++;
	}
	public Item(int no, String name) {
		this();
		this.no = no;
		this.name = name;
	}
	public Item(int no, String name, int price, int count) {
		this(no,name);
		this.price = price;
		this.count = count;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getItemCnt() {
		return ItemCnt;
	}
	public void setItemCnt(int itemCnt) {
		ItemCnt = itemCnt;
	}
	public static String getCompany() {
		return company;
	}
	public void inStore(int cnt) {
		count = count + cnt;
		System.out.println("�԰� :" + name + "," + cnt +"��");
	}
	public void outStore(int cnt)
	{
		if(count < cnt) {
			System.out.println("��� ���� :" + name + ",���� ��� :" + count + "��");
		}
		else {
			count = count - cnt;
			System.out.println("�԰� :" + name + "," + count + "��");
		}
	}
	public void printInfo() {
		System.out.println("��ǰ�ڵ� :" + no + "��ǰ�� :" + name + "��ǰ���� :" + price + "��ǰ����:" + count);
	}
}
