package studyjava.middle;

import java.util.Scanner;

public class Java02_02 {

	Scanner scanner = new Scanner(System.in);
		
	int a = 0;
	int b = 0;
	int add = 0;
	int sub = 0;
	int mul = 0;
	int div = 0;
	
	public void view() {
		
		System.out.print("정수 한 개 입력: ");
		a = scanner.nextInt();
		
		System.out.print("정수 한 개 입력: ");
		b = scanner.nextInt();
	}
	
	public void calculator() {
		add = a + b;
		sub = a - b;
		mul = a * b;
		div = a / b;
		
		System.out.println("a + b = " + add);
		System.out.println("a - b = " + sub);
		System.out.println("a * b = " + mul);
		System.out.println("a / b = " + div);
	}
	
}
