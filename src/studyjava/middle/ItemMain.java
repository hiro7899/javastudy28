package studyjava.middle;

import java.util.ArrayList;
import java.util.Scanner;

public class ItemMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//장바구니 - Item 타입 ArrayList 생성
		ArrayList<Item> cart = new ArrayList<Item>();
		
		//상품 담기
		Item item1 = new Item("A000", "노트북", 1200000, 1);
		cart.add(item1);
		cart.add(new Item("A001", "마우스", 35000, 2));
		cart.add(new Item("A002", "키보드", 89000, 1));
		cart.add(new Item("A003", "모니터", 450000, 2));
		cart.add(new Item("A004", "USB허브", 25000, 3));
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
		//cart.get(1).qty = 3;
		//System.out.println("\n마우스 수량 변경후 : " + cart.get(1));
		System.out.print("상품코드 : ");
		String icode = scanner.next().toUpperCase();
		System.out.print("수량 : ");
		int iqty = scanner.nextInt();
		boolean result = false;
		
		for(Item item : cart) {
			if(item.code.equals(icode)) {
				item.qty = iqty;
				result = true;
				System.out.println("변경완료 :" + item.name + " " + item.qty + "개");
			}
		}
		if(result) {
		}else {
			System.out.println("찾을 수 없습니다.");
		}
		
		
		//상품 제거(index 이용)
		System.out.println("\nUSB허브 제거 전 크기: " + cart.size());
		cart.remove(cart.size() -1); //마지막 상품 제거
		System.out.println("\nUSB허브 제거 후 크기: " + cart.size());

		//5만원 이상 상품만 출력
		System.out.println("\n===========5만원 이상 상품 출력=============");
		for(Item item : cart) {
			if(item.price >= 50000) {
				System.out.printf("%-10s %,6d원%n" ,item.name , item.price);
			}
		}
		
		//총 수량 합산
		int count = 0;
		for(Item item : cart) {
			count += item.qty;
		}
		System.out.println("총 수량 : " + count + "개");
		
		
		scanner.close();
	}
	
}
