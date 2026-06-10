package studyjava.middle;

import java.util.Scanner;

public class BankPro {

	//메서드만 있는 설계도
	Scanner scanner = new Scanner(System.in);
	
	//계좌생성 기능 메서드
	public void createAccount(Bank[] bank) {
		System.out.println("----------------------------------");
		System.out.println("계좌를 생성 합니다");
		System.out.println("----------------------------------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		
		System.out.print("계좌주: ");
		String owner = scanner.next();
		
		System.out.print("초기 입금액: ");
		int balance = scanner.nextInt();
		
		if(balance < 1) {
			System.out.println("초기 금액이 부족합니다");
			return;
		}
		
		Bank b = new Bank(ano, owner, balance);
		
		for(int i = 0; i < bank.length; i++) {
			if(bank[i] == null) {
				bank[i] = b;
				System.out.println("계좌 생성 완료");
				break;
			}
		}
		
	}
	
	//계좌목록 기능 메서드
	public void accountList(Bank[] bank) {
		System.out.println("----------------------------------");
		System.out.println("계좌목록");
		System.out.println("----------------------------------");
		
		for(int i = 0; i < bank.length; i++) {
			if(bank[i] != null) {
				System.out.print(bank[i].ano + "\t");
				System.out.print(bank[i].owner + "\t");
				System.out.println(bank[i].balance + "\t");
			}
		}
	}
	
	//예금하기 기능 메서드
	public void deposit(Bank[] bank) {
		System.out.println("----------------------------------");
		System.out.println("입금");
		System.out.println("----------------------------------");
		
		System.out.print("입금하실 계좌를 입력하세요: ");
		String ano = scanner.next();
		
		for(Bank b : bank) {
			if(b != null && b.ano.equals(ano)) {
				System.out.print("입금하실 금액을 입력해주세요: ");
				int money = scanner.nextInt();
				
				if(money > 0) {					
					b.balance += money;
				}else {
					System.out.println("잘못된 금액 입력");
				}
				
				System.out.println("결과 : 예금 성공, 잔액 : " + b.balance);
				return; // return이 더 좋음
			}
		}
		
		System.out.println("없는 계좌번호 입니다 " + ano);
	}
	
	//출금하기 기능 메서드
	public void withdraw(Bank[] bank) {
		System.out.println("----------------------------------");
		System.out.println("출금");
		System.out.println("----------------------------------");
		
		System.out.print("출금하실 계좌를 입력하세요: ");
		String ano = scanner.next();
		
		for(Bank b : bank) {
			if(b != null && b.ano.equals(ano)) {
				System.out.print("출금하실 금액을 입력해주세요: ");
				int money = scanner.nextInt();
				
				if(money > 0 && money <= b.balance) {					
					b.balance -= money;
				}else {
					System.out.println("잘못된 금액 입력" + money + "잔액: " + b.balance);
				}
				
				System.out.println("결과 : 출금 성공, 잔액 : " + b.balance);
				return; // return이 더 좋음
			}
		}
		
		System.out.println("없는 계좌번호 입니다 " + ano);
	}
	
	//계좌찾기 기능 메서드
	public void findAccount() {
		
	}
	
}
