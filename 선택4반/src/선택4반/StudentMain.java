package 선택4반;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student01 kim = new Student01();
		kim.school = "서울예술고";
		System.out.println("김:" + kim.school);
		
		Student01 jang = new Student01();
		Student01 choi = new Student01();
		Student01 bak = new Student01();
		System.out.println("최:" + choi.school);
		
		
		System.out.println("생성된 학생수는 " + Student01.count);
		
	}

}
