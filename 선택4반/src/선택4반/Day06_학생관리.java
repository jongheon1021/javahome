package 선택4반;

public class Day06_학생관리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1 = new student();
		s1.name = "홍길동";
		s1.hakbun = "20404";
		s1.age = 18;
		s1.printstudent();
		student s2 = new student();
		//s1.printStudent(s1.name, s1.hakbun, 18);
		
		s2.name = "정상민";
		s2.hakbun = "20318";
		s2.age = 18;
		
		s2.printstudent();
				
		student s3 = new student("김기범", "20606",18);
		s3.printstudent();
		//책정보 생성하고 출력해보자
		Book myBook = new Book("토지","박경리",30000);
		myBook.printBook();
		
		
		
	}

	
}
