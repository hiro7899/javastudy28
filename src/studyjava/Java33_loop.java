package studyjava;

import java.util.Scanner;

public class Java33_loop {

	public static void main(String[] args) {
		// 키보드로 부터 N개의 정수값을 입력받아 값이 0-100 사이의 점수 5개를
		//찾아서 합계를 구하여 출력하시오
		Scanner scanner = new Scanner(System.in);
		
		int num = 0;
		int sum = 0;
		int cnt = 0;
		
		while(true) {
			System.out.print("정수 입력: ");
			num = scanner.nextInt();
			
			if(num <= 100 && num >= 0) {
				sum += num;
				cnt ++;
			}
			
			if(cnt == 5) {
				break;
			}
		}
		
		System.out.println("정수 5개의 합: " + sum);

		scanner.close();
	}

}
