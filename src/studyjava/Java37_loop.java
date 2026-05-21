package studyjava;

import java.util.Scanner;

public class Java37_loop {

	public static void main(String[] args) {
		// 10개의 정수 값을 입력받아
		// 홀수의 합:
		// 홀수의 개수
		// 짝수의 합 : 
		// 짝수의 개수 :
		// 최대값: 
		// 최소값:
		// 최대값 - 최소값:
		
		int num = 0;
		int oddSum = 0;
		int oddCount = 0;
		int evenSum = 0;
		int evenCount = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 10개 입력하세요: ");
		
		for(int i = 1; i <= 10; i++) {
			num = scanner.nextInt();
			
			if(num % 2 == 1) {
				oddSum += num;
				oddCount++;
			}else {
				evenSum += num;
				evenCount++;
			}
			
			if(num > max) {
				max = num;
			}
			
			if(num < min) {
				min = num;
			}
		}
		System.out.println("홀수의 합: " + oddSum);
		System.out.println("홀수의 개수: " + oddCount);
		System.out.println("짝수의 합: " + evenSum);
		System.out.println("짝수의 개수: " + evenCount);
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
		System.out.println("최대값 - 최소값 = " + (max - min));
		
		scanner.close();
	}

}
