package ����4��;

public class student {
	//������
	student(String name, String hakbun, int age){
		this.name = name;
		this.hakbun = hakbun;
		this.age = age;
			
		
	}
	public student() {}	//�⺻������
	String name;
	String hakbun;
	int age;
	private String jumin;
	
	void printStudent(String name, String hakbun, int age) {
		System.out.print("�л��̸�:"+name);
		System.out.print("�й�:" + hakbun);
		System.out.println("����:" + age);
		
	}
	void printstudent() {
			System.out.print("�л��̸�:"+name);
			System.out.print("�й�:"+hakbun);
			System.out.println("����:"+age);
		
	}
}
