package 선택4반;

public class student {
	//생성자
	student(String name, String hakbun, int age){
		this.name = name;
		this.hakbun = hakbun;
		this.age = age;
			
		
	}
	public student() {}	//기본생성자
	String name;
	String hakbun;
	int age;
	private String jumin;
	
	void printStudent(String name, String hakbun, int age) {
		System.out.print("학생이름:"+name);
		System.out.print("학번:" + hakbun);
		System.out.println("나이:" + age);
		
	}
	void printstudent() {
			System.out.print("학생이름:"+name);
			System.out.print("학번:"+hakbun);
			System.out.println("나이:"+age);
		
	}
}
