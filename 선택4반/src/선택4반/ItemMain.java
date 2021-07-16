package 선택4반;

public class ItemMain {

	public static void main(String[] args) {
		System.out.println(Item.getCompany() + "에 오신걸 환영합니다!");
		//System.out.println("현재 상품 종류 개수:" + Item.getItemCnt() + "개");
		System.out.println("===========================================");
		
		Item i1 = new Item();
		i1.setNo(100);
		i1.setName("연필");
		i1.setPrice(500);
		i1.setCount(5);
		

	}

}
