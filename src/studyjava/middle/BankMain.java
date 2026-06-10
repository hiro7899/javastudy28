package studyjava.middle;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		// 메뉴와 객체 배열만 있는 설계도
		Bank[] bank = new Bank[100];
		BankPro bankPro = new BankPro();
		
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금하기 | 4. 출금하기 | 5.종료");
			System.out.println("---------------------------------------");
			System.out.print("메뉴 선택: ");
			int choice = scanner.nextInt();
			
			if(choice == 1) {
				bankPro.createAccount(bank);
			}else if(choice == 2) {
				bankPro.accountList(bank);
			}else if(choice == 3) {
					bankPro.deposit(bank);
			}else if(choice == 4) {
					bankPro.withdraw(bank);
			}else if(choice == 5) {
				System.out.println();
				System.out.println("종료합니다.");
				run = false;
			}else {
				System.out.println("잘못된 입력입니다");
			}
			
		}
		scanner.close();
	}

}
