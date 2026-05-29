package studyjava.basic;

import java.util.Scanner;

public class Java35_loop {

	public static void main(String[] args) {
		// 업다운 게임 만들기
		
		// 컴퓨터가 무작위의 1-100 정수값 숫자를 만든다
		int com = (int)(Math.random()*100)+1;
		int num = 0;
		int cnt = 0;
		
		boolean isRunning = true;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자 맞추기 게임");
		
		while(isRunning) {
			System.out.print("숫자를 입력(1-100): ");
			num = scanner.nextInt();
			if(num > 100 || num < 1) {
				System.out.println("잘못된 숫자를 입력했습니다.(1~ 100) 범위 내 숫자를 입력하세요");
				continue;
			}
			
			cnt++;
			
			if(num < com) {
				System.out.println("업");
			}else if(num > com) {
				System.out.println("다운");
			}else {
				isRunning = false;
			}
		}
		
		System.out.println("정답입니다. " + cnt + "회 걸리셨습니다");
		
		scanner.close();
	}

}
