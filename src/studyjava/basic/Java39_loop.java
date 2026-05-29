package studyjava.basic;

import java.util.Scanner;

public class Java39_loop {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("금액 입력: ");
		
		int pay = scanner.nextInt();
		
		int money = 50000; //처음 나눌 단위
		boolean five = true; //스위치
		
		for(int i = 1; i <= 10; i++) { //화폐단위 개수만큼 반복
			int count = pay / money; //매수 세기
			System.out.println(money + "원: " + count + "개");
			
			pay = pay % money;
			
//			if(money == 50000) {
//				money = 10000;
//			}else if(money == 50000) {
//				money = 10000;
//			}else if(money == 10000) {
//				money = 5000;
//			}else if(money == 5000) {
//				money = 1000;
//			}else if(money == 1000) {
//				money = 500;
//			}else if(money == 500) {
//				money = 100;
//			}else if(money == 100) {
//				money = 50;
//			}else if(money == 50) {
//				money = 10;
//			}else if(money == 10) {
//				money = 5;
//			}else if(money == 5) {
//				money = 1;
//			}
			
			//스위치 방식
			if(five) {
				money = money / 5;
				five = false;
			}else {
				money = money / 2;
				five = true;
			}
			
		} //for
		
		scanner.close();
	}
}