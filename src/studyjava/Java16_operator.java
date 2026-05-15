package studyjava;

import java.util.Scanner;

public class Java16_operator {

	public static void main(String[] args) {
		//무료배송 여부 처리
		
		//주문금액(원) : 20000
		//회원여부(1-회원, 0-비회원) : 1
		//무료배송 여부 : true
		
		//조건 : 3만원 이상 또는 회원이면 무료배송
		
		Scanner scanner = new Scanner(System.in);
		int price; //주문 금액
		int member; //회원 여부
		boolean result; //무료배송 여부
		
		System.out.print("주문금액을 입력하세요: ");
		price = scanner.nextInt();
		
		System.out.print("회원 여부를 선택하세요 1. 회원 0. 비회원 : ");
		member = scanner.nextInt();
		
		result = price >= 30000 || member == 1;
		
		if(result) {
			System.out.println("무료배송입니다");
		}
		else {
			System.out.println("배송비가 청구됩니다.");
		}
	}

}
