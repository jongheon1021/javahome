package ����4��;

public class Phone {
	
	String model;
	int price;
	static int total;
	
	
	Phone(){
		total++;
	}	//�⺻�� ������
	Phone(String model, int price){
		this.model = model;
		this.price = price;
	}
	
	String toPrint(){
		System.out.println("������� ��" + total + "���� ������");
		return (price + "����¥�� " + model + " ����Ʈ��");
	}
}
