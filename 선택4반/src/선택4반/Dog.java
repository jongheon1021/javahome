package ����4��;

public class Dog {
	//ǰ���� ���� �÷��� �޾Ƽ� ��ü�� �����ϴ� �����ڸ� ����ÿ�.
	Dog(){
		System.out.println("������ ��ü�� ����");
	}
	Dog(String breed, int age, String color){
		this();
		this.breed = breed;
		this.age = age;
		this.color = color;
		
	}
	//��� ����
	
	String breed;
	int age;
	String color;
	//�޼ҵ�
	void barking() {
		System.out.println(breed + "is barking");
	}
	
	void hungry() {
		System.out.println(breed + "is hungry");
	}
	
	void sleeping() {
		System.out.println(breed + "is hungry");
	}
	
	String toPrint() {
		String str;
		str = "(" + breed + "," + age + "," + color + ")";
		return str;
		
	}
}
