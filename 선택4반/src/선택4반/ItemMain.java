package ����4��;

public class ItemMain {

	public static void main(String[] args) {
		System.out.println(Item.getCompany() + "�� ���Ű� ȯ���մϴ�!");
		//System.out.println("���� ��ǰ ���� ����:" + Item.getItemCnt() + "��");
		System.out.println("===========================================");
		
		Item i1 = new Item();
		i1.setNo(100);
		i1.setName("����");
		i1.setPrice(500);
		i1.setCount(5);
		

	}

}
