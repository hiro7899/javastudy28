package quiz.jsl;

import java.util.Scanner;

public class CashDividing {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Cash cash = new Cash();
		
		System.out.print("급여(금액) 입력: ");
		int pay = scanner.nextInt();
		
		cash.processMoney(pay);
		
		scanner.close();
	}

}
