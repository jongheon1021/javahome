package 선택4반;

public class ShoppingMallMain {

	public static void main(String[] args) {
			ShoppingMall tv = new ShoppingMall("LG 678A"); 
			tv.addTotal(10);
			tv.subTotal(5);
	
			ShoppingMall mp3 = new ShoppingMall("아이리버 L123");
			mp3.addTotal(100);
			mp3.subTotal(1000);
	}

}
