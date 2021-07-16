package 선택4반;

import java.util.*;

public class Day02_입출력 {

	public static void main(String[] args) {
	
		//스캐너 Scanner
		//자동 임포트 : ctrl shift M
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력:");
		//scanf("%d",&a);
		int age = sc.nextInt();
		System.out.println("입력된 나이는"+age);
		
		System.out.println("이름:");
		String name;
		name = sc.next();
		System.out.println("당신의 이름은: "+name);
		
	}

}
