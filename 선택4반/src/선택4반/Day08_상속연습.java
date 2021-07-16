package 선택4반;

public class Day08_상속연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cars sonata = new Cars();
		sonata.name = "소나타";
		sonata.color = "은색";
		sonata.velocity = 80;
		sonata.speedUP();
		sonata.speedUP();
		sonata.speedDown();
		
		Taxi t = new Taxi();
		t.name = "카카오 택시";
		t.color = "노란색";
		t.velocity = 60;
		t.speedUP();
		t.speedUP();
		t.speedDown();
		t.speedDown();
		t.payUP();
		t.payUP();
		t.payUP();
	}

}
