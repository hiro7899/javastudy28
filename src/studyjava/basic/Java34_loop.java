package studyjava.basic;

import java.util.Scanner;

public class Java34_loop {

	public static void main(String[] args) {
		
		int i=0;
		do {
			System.out.println(i++); //후위 연산자는 실행후 증가 즉 0출력 후 1 증가
			
		}while(i == 3);// 조건이 참일때 반복 i == 3;
		
		//키보드로 부터 점수 (1~100)을 입력받아 최대 점수, 최소 점수를 구하여 출력하시오
		//단. 입력되는 점수가 -99이면 출력 후 종료한다
		//입력예시 
		//점수입력 : 10 5 60 41 78 92 50 -99
		//최대점수 : 92
		//최소점수 : 5
		
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		int max = Integer.MIN_VALUE; //최저점
		int min = Integer.MAX_VALUE; //최고점
		
		while(true) {
			System.out.print("정수 입력: ");
			num = scanner.nextInt();
			if(num == -99) {
				break;
			}
			
			if(num <= 100 && num >= 1) {			
				if(num > max) {
					max = num;
				}
				
				if(num < min) {
					min = num;
				}
			}
			
		} //while
		System.out.println("최대점수: " + max);
		System.out.println("최소점수: " + min);
		
		scanner.close();
	}

}
