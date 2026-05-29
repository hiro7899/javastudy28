package studyjava.basic;

import java.util.Scanner;

public class Java15_operator {
	public static void main(String[] args) {
		//입력받은 값이 80-90 사이 이거나 7의 배수이면 true 아니면 false 출력
		
		Scanner scanner = new Scanner(System.in);
		int i;
		
		System.out.print("숫자를 입력하세요: ");
		i = scanner.nextInt();
		boolean result = i >= 80 && i <= 90 || i % 7 == 0;
		
		System.out.println(result);
		scanner.close();
	}
}
