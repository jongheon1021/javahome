package ����4��;

public class Taxi extends Cars{
	//�ý� ������ �Ӽ� �߰�
	
	int pay = 3000;
	//�ý� ������ �޼ҵ� �߰�
	void payUP() {
		pay+=100;
		System.out.println(name + "���� ���" + pay);
	}
}
