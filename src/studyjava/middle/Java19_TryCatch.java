package studyjava.middle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Java19_TryCatch {

	public static void main(String[] args) {
		
		try {
			System.out.println(100/0); 
			//예외가 발생할 수 있는 문장을 코딩한다
		}catch (ArithmeticException e) {
			//예외처리 문장을 코딩한다
			//ArithmeticException : 0으로 나눌 수 없는 예외 발생
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		try {
			System.out.println(100/0);
		}catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}finally {
			//finally 는 예외가 발생하던지 안 하던지 무조건 실행한다
			System.out.println("무조건 실행");
		}
		
		
		int[] intArr = new int[5];
		
		intArr[0] = 0;
		
		try {
			for(int i = 0; i < 5; i ++) {
				intArr[i + 1] = i + 1 + intArr[i];
				System.out.print(intArr[i] + " ");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스 범위가 벗어났어요");
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 값: ");
		try {
			int a = scanner.nextInt();
			System.out.println(a);
		} catch (InputMismatchException e) {
			System.out.println("정수값이 아닙니다. 다시 입력!");
		}

		String[] strNum = {"23", "12", "3.14", "999"};
		int i = 0;
		try {
			for(i = 0; i < strNum.length; i++) {
				int j = Integer.parseInt(strNum[i]);
				//Integer.parseInt() 는 정수만 변환한다.
				System.out.println("정수로 변환된 값은 : " + j);
			}
		} catch (NumberFormatException e) {
			System.out.println(strNum[i] + " 값은 정수로 변환 불가!");
		}
		
		try {
			System.out.println(3);
			System.out.println(0/0);
			//예외 발생
			System.out.println(4);
			//실행 안한다
		} catch (ArithmeticException e) {
			e.printStackTrace();
			//호출 스택에 있는 메서드의 정보와 예외 메세지를 출력한다
			System.out.println("예외 메세지 : " + e.getMessage());
			//발생한 예외 클래스의 인스턴스에 저장된 메세지를 출력한다
		}
		
		scanner.close();
	}

}
