package ����4��;

public class Student01 {

	static String school = "ROBOT";
	private String name;
	private int grade;
	static int count;
	
	
	Student01(){//������
		count++;
		
	}
	//�޼ҵ�
	void print() {
			System.out.println(name + grade + "�г�");
	}
	
	//"2�г� ���ȣ", ���·� �����ϴ� �޼ҵ带 �����ε�
	String print(int grade) {
		String str = grade + "�г� " + name;
		return str; 
	}
	
	
	//ĸ��ȭ ����
	//set : ���� �����ϴ�. �����Ѵ�
	//get : ���� �ҷ��´�. �д´�
	
	void setName(String name)
	{
		this.name = name;
	}
	
	String getName() {
		return this.name;
	}
	
	void setGrade(int grade) {
		//�Էµ� grade�� ���� 3���� ũ�� �����޼��� ����Ͻÿ�
		if(grade > 3) {
			System.out.println("�г� ������ Ȯ���ϼ���");
		return;
		}
		this.grade = grade;
	}
	
	int getGrade() {
		return this.grade;
	}
	
}
