package studyjava;

import java.util.Scanner;

public class Java08_operator {
	public static void main(String[] args) {
		//키보드로부터 정수를 입력받아서 홀수, 짝수를 출력하시오
		//정수 입력 : 33
		//홀수입니다.
		int score;
		String result;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		score = scanner.nextInt();
		
		//result = (score % 2 == 0) ? "짝수입니다" : "홀수입니다";
		if(score%2 == 0) {
			result = "짝수입니다";
		}
		else {
			result = "홀수입니다";
		}
		
		System.out.println(result);
		//문자, 문자열 연산
		System.out.println('A');
		//ASCII A -> 65, a->97
		System.out.println('A'+1);
		//숫자와 덧셈을 하면 65+ 1 => 66
		System.out.println('A' + 'B'); //131
		//연산식으로 문자를 더하면 ASCII 코드값으로 계산을 한다
		System.out.println("A" + "B");
		//문자열과 문자열을 더하면 AB가 출력
		System.out.println("1" + "2");
		//문자12출력
		System.out.println("A" + 1);
		//문자열과 숫자열을 더하면 문자열 A1 출력
		
		scanner.close();
	}
}
