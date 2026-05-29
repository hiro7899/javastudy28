package studyjava.basic;

import java.util.Scanner;

public class Java14_operator {

	public static void main(String[] args) {
		//할인 대상 할인(학생 또는 경로우대)
		//나이 입력 : 20
		//할인 대상 여부 : true
		
		//조건 : 나이 24세이하(학생) 또는 65세 이상(경로우대)
		
		Scanner scanner = new Scanner(System.in);
		int age;
		
		System.out.print("나이를 입력하세요: ");
		age = scanner.nextInt();
		
		boolean result = age<= 24 || age >=65;
		//조건이 참이면 true(1) 저장 그렇지 않으면 false(0)을 저장
		
		if(result) { //result 변수에 저장된 값이 true이면
			System.out.println("할인 대상자 입니다");
		}
		else { // false이면
			System.out.println("할인 대상자가 아닙니다");
		}
		scanner.close();
	}

}
