	package ����4��;

public class ShoppingMall {
	String code;
	static int total;
	
	ShoppingMall(String code){
		this.code = code;
		System.out.println(code + "���");
	}
	
	void addTotal(int count) {
		total += count;
		System.out.println("���� �� ���:" + total);
	}
	void subTotal(int count) {
		//���� ������ count �� total���� ũ��
		// �����޽����� ���̰� �����Ѵ�
		if(count > total) {
			System.out.println("������ �����մϴ�");
			return;
		}
		else {
		
		total -= count;	
		System.out.println("���� �� ���:" + total);
		}
	}
}
