package ����4��;

public class Day06_�л����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1 = new student();
		s1.name = "ȫ�浿";
		s1.hakbun = "20404";
		s1.age = 18;
		s1.printstudent();
		student s2 = new student();
		//s1.printStudent(s1.name, s1.hakbun, 18);
		
		s2.name = "�����";
		s2.hakbun = "20318";
		s2.age = 18;
		
		s2.printstudent();
				
		student s3 = new student("����", "20606",18);
		s3.printstudent();
		//å���� �����ϰ� ����غ���
		Book myBook = new Book("����","�ڰ渮",30000);
		myBook.printBook();
		
		
		
	}

	
}
