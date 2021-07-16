	package 선택4반;

public class ShoppingMall {
	String code;
	static int total;
	
	ShoppingMall(String code){
		this.code = code;
		System.out.println(code + "등록");
	}
	
	void addTotal(int count) {
		total += count;
		System.out.println("현재 총 재고:" + total);
	}
	void subTotal(int count) {
		//만약 감소할 count 가 total보다 크면
		// 에러메시지를 보이고 리턴한다
		if(count > total) {
			System.out.println("수량이 부족합니다");
			return;
		}
		else {
		
		total -= count;	
		System.out.println("현재 총 재고:" + total);
		}
	}
}
