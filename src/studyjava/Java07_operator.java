package studyjava;

import java.util.Scanner;

public class Java07_operator {
	public static void main(String[] args) {
		//연산자(Operator)
		//연산자란 데이터를 계산하거나 비교하거나 논리적으로 판단할때 사용하는 기호이다
		//연산자의 종류
		//산술연산자 : + - * / % 				: 사칙연산
		//대입연산자 : = += -= *= /= 			:값을 저장 
		//비교연산자 : == != > < >= <= 		: 크기비교, 결과는 boolean(참, 거짓)
		//논리연산자 : &&(and) ||(or) !(not)
		//증감연산자 : ++ -- 					: 1씩 증가 / 감소
		//삼항연산자 : (조건)?"참일때":"거짓일때" 	: 조건에따라 값 선택
		
		//산술연산자 처리순서() -> * / % -> + -
		//같은 순위는 왼쪽 -> 오른쪽 순서로 계산
		
		int result = 2 + 3 * 4; //14
		int result2 = (2+ 3) * 4; //20
		int result3 = 10 - 4 / 2 + 1; //9
		
		int a = 10;
		int b = 3;
		int result4 = a + b;
		System.out.println("10 + 3 = " + result4);
		int result5 = a - b;
		System.out.println("10 - 3 = " + result5);
		int result6 = a * b;
		System.out.println("10 * 3 = " + result6);
		int result7 = a / b;
		System.out.println("10 / 3 = " + result7);
		double result8 = (double)a / b; //정수를 형변환해서 실수로 바꾸어 준다
		System.out.println("10 / 3 = " + result8);//정확한 결과 3.3333333333333335
		int result9 = a % b;
		System.out.println("10 % 3 = " + result9);
		
		a=5;
		System.out.println("현재 a= "+a); //5
		a++;//a의 저장값 1증가
		System.out.println("a++후="+a); //6
		a--;//a의 저장값 1감소
		System.out.println("a--후="+a); //5
		
		a=10;
		a += 5; //15
		a -= 3; //12
		a *= 2; //24
		a /= 4; //6
		
		//물건가격 : 1500원
		//수량 : 4개
		//할인 : 1000원
		//최종금액 : 5000원
		
		Scanner scanner = new Scanner(System.in);
		
		int price;
		int count;
		int discount;
		int tot;
		
		System.out.print("물건가격: ");
		price = scanner.nextInt();
		System.out.print("수량: ");
		count = scanner.nextInt();
		System.out.print("할인");
		discount = scanner.nextInt();
		
		tot = price * count - discount;
		System.out.println("최종금액 : "+ tot);
		
	}
}
