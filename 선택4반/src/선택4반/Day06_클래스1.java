package ����4��;

public class Day06_Ŭ����1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ü(�ν��Ͻ�) ����
		Car myCar1 = new Car();
		myCar1.������ = "������";
		myCar1.���� = "RED";
		myCar1.����ȸ�� = "����";
		myCar1.�޸���();
		myCar1.�����ϴ�();
		
		Car redCar = new Car();
		redCar.������ = "����";
		redCar.�޸���();
		
		myCar1.�޸���();myCar1.�޸���();myCar1.�޸���();
		myCar1.�޸���();myCar1.�޸���();
		myCar1.�����ϴ�();
		
		
	}

}
//-----------------------------------------------

class Car{
	//�𵨸� --> Ŭ���� ����
	//�Ӽ�
	String ������;
	String ����;
	String ����ȸ��;
	
	
	//�޼ҵ�
	void �޸���() {
		System.out.println(������ + ���� + ":�޸��� ��");
	}
	
	void �����ϴ�() {
			System.out.println(������ + ���� + ":������");
	}
}