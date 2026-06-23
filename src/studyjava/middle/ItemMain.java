package studyjava.middle;

import java.util.ArrayList;

public class ItemMain {

	public static void main(String[] args) {
		//장바구니 - Item 타입 ArrayList 생성
		ArrayList<Item> cart = new ArrayList<Item>();
		
		//상품 담기
		Item item1 = new Item("노트북", 1200000, 1);
		cart.add(item1);
		cart.add(new Item("마우스", 35000, 2));
		cart.add(new Item("키보드", 89000, 1));
		cart.add(new Item("모니터", 450000, 2));
		cart.add(new Item("USB허브", 25000, 3));
		int total = 0;
		
		//장바구니 출력
		System.out.println("=========================================================");
		System.out.println("\t\t장바구니");
		System.out.println("=========================================================");
		for(Item item : cart) {
			System.out.println(item);
			total += item.getSubtotal();
		}
		System.out.println("=========================================================");
		System.out.printf("총 합계 : %,d원 %n", total);
		
		//특정 상품 수량 변경
		cart.get(1).qty = 3;
		System.out.println("\n마우스 수량 변경후 : " + cart.get(1));
	}
	
}
