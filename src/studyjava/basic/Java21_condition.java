package studyjava.basic;

import java.util.Scanner;

public class Java21_condition {

	public static void main(String[] args) {
		// 정수 2개를 입력받아서 큰 값, 작은 값을 출력하시오
		// 입략 :90 70
		// Max : 90, Min: 79
		Scanner scanner = new Scanner(System.in);
		
//		int a, b;
//		System.out.print("정수 2개를 입력하시오");
//		a = scanner.nextInt();
//		b = scanner.nextInt();
//		
//		if(a> b) {
//			System.out.println("Max: " + a + "Min: " + b);
//		}else if(a == b) {
//			System.out.println("값이 같습니다."+ a +", "+ b);
//		}else {
//			System.out.println("Max: " + b + "Min: " + a);
//		}
		
		// 정수 3개의 입력받아 아래와 같이 출력하시오
		// 정수 입력: 7 9 5
		// Max : 9, Mid : 7, Min : 5

		int i, j, k;
		int max = 0, mid = 0, min = 0;
		
		System.out.println("정수 3개를 입력하시오");
		i = scanner.nextInt();
		j = scanner.nextInt();
		k = scanner.nextInt();
		
		if(i > j && i > k && j < k) { // i가 가장 큰 경우
			max = i; mid = k; min = j;
			
		}else if(i > j && i > k && j > k) { // i가 가장 큰 경우
			max = i; mid = j; min = k;
			
		}else if(i < j && i < k && j > k){ // j가 가장 큰 경우
			max = j; mid = k; min = i;
			
		}else if(i < j && i > k && j > k){ // j가 가장 큰 경우
			max = j; mid = i; min = k;
			
		}else if(i > j && i < k && j < k){ // k가 가장 큰 경우
			max = k; mid = i; min = j;
			
		}else if(i < j && i < k && j < k){ // k가 가장 큰 경우
			max = k; mid = j; min = i;
			
		}else {
			System.out.println("같은 수가 존재합니다." + i + j + k);
		}	
		
//		// 1. Max 구하기
//		max = (i > j && i > k) ? i : ((j > i && j > k) ? j : k);
//
//		// 2. Min 구하기
//		min = (i < j && i < k) ? i : ((j < i && j < k) ? j : k);
//
//		// 3. Mid 구하기 (총합에서 max와 min을 제외)
//		mid = (i + j + k) - max - min;
		
		System.out.println("Max: " + max);
		System.out.println("Mid: " + mid);
		System.out.println("Min: " + min);
		
		scanner.close();
	}

}
