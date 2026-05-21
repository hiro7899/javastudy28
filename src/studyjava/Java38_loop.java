package studyjava;

import java.util.Scanner;

public class Java38_loop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int select = 0; //종류 선택
		int count = 0; //거래건수
		int sal = 0; // 수입
		int totalSal = 0; //총 수입
		int wallet = 0; //지갑
		
		int food = 0; //식비
		int trans = 0; //교통비
		int shop = 0; //쇼핑
		int extra = 0; //기타
		
		int total = 0; //총 지출
		
		System.out.println("======= 가계부 =======");
		while(true) {
			System.out.println("종류: 1=수입 2=식비 3=교통 4=쇼핑 5=기타 (0 입력 시 종료)");
			select = scanner.nextInt();
			
			if(select == 1) {
				System.out.print("이번달 수입을 입력하시오: ");
				sal = scanner.nextInt();
				System.out.println("수입 " + sal + "원 추가");
				wallet += sal;
				System.out.println("현재 잔액: " + wallet + "원");
				totalSal += sal;
				count++;
			}
			
			if(select == 2){
				System.out.print("식비를 입력하시오: ");
				food = scanner.nextInt();
				System.out.println("식비 "+ food + "원 지출");
				wallet -= food;
				System.out.println("현재 잔액: " + wallet + "원");
				total += food;
				count++;
			}
			
			if(select == 3) {
				System.out.print("교통비를 입력하시오: ");
				trans = scanner.nextInt();
				System.out.println("교통비 " + trans + "원 지출");
				wallet -= trans;
				System.out.println("현재 잔액: " + wallet + "원");
				total += trans;
				count++;
			}
			
			if(select == 4) {
				System.out.print("쇼핑금액을 입력하시오: ");
				shop = scanner.nextInt();
				System.out.println("쇼핑 " + shop + "원 지출");
				wallet -= shop;
				System.out.println("현재 잔액: " + wallet + "원");
				total += shop;
				count++;
			}
			
			if(select == 5) {
				System.out.print("기타 금액을 입력하시오: ");
				extra = scanner.nextInt();
				System.out.println("기타 소비 " + extra + "원 지출");
				wallet -= extra;
				System.out.println("현재 잔액: " + wallet + "원");
				total += extra;
				count++;
			}
			
			if(select == 0) {
				break;
			}
			
			if(select > 5 || select < 0) {
				System.out.println("메뉴를 확인해주세요");
			}
		}
		
		System.out.println("============================================");
		System.out.println("\t\t최종 가계부 결산");
		System.out.println("============================================");
		
		System.out.println("총 거래 건수: " + count + "건");
		System.out.println("총   수입: " + totalSal + "원");
		
		System.out.println("---------------------------------------");
		System.out.println("식\t비: " + food + "원");
		System.out.println("교  통  비: " + trans + "원");
		System.out.println("쇼\t핑: " + shop + "원");
		System.out.println("기\t타: " + extra + "원");
		System.out.println("총  지  출: " + total + "원");
		System.out.println("---------------------------------------");
		
		System.out.println("잔\t액: " + wallet + "원");
		System.out.println("=============================================");
	
	}

}
