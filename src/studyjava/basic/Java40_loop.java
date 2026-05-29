package studyjava.basic;

import java.util.Scanner;

public class Java40_loop {

	public static void main(String[] args) {
		// 다중 for 문
		// for 문안에 for 문이 있는경우(행열처리, 2차원 테이블 처리시 필요하다)
		// 다중 for 문에서 break 문은 반복문 하나만 빠져나간다
		// 다중 for 문에서 continue 문은 조건식 또는 증감식으로 이동한다
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("단수입력(2~9): ");
		int dan = scanner.nextInt();
		
		System.out.println(dan + "단");
		
		for(int i = 1; i < 10; i++) {
			System.out.println(dan + "*" + i + "=" + dan * i);
		}
		
		for(int i = 9; i >= 1; i--) {
			System.out.println(dan + "*" + i + "=" + dan * i);
		}
		
		scanner.close();
	}

}
