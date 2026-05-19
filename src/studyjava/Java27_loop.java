package studyjava;

public class Java27_loop {

	public static void main(String[] args) {
		// java 반복문(Loop)이란?
		// 반복문이란 특정 코드를 조건이 만족하는 동안 반복해서 실행하는 문장
		// 같은 코드를 여러번 작성하지 않고 효율적으로 처리할 수 있다
		
		// 반복문의 종류
		// for : 반복횟수가 정해진 경우 사용
		// while : 조건이 참 인동안 반복
		// do-while : 최소 1번은ㄴ 무조건 실행 후 반복
		// 중첩 for : for문에 for문
		// break : 반복문 즉시 종료
		// continue : 현재 반복 건너뛰고 다음으로
		System.out.println(1 + ": JSL인재개발원");
		System.out.println(2 + ": JSL인재개발원");
		System.out.println(3 + ": JSL인재개발원");
		System.out.println(4 + ": JSL인재개발원");
		System.out.println(5 + ": JSL인재개발원");
		
		//위 문장을 while문으로 작성해보자
		System.out.println("while문으로 변경해서 출력");
		
		int cnt = 1;
		while(cnt <= 5) {
			System.out.println(cnt + ": JSL인재개발원");
			cnt++;
		}
		
		//문제 : 1-10까지 정수의 합계를 구하여 출력하시오
		int i = 1;
		int sum = 0;
		while(i <= 10) {
			System.out.print(i);
			
			if (i < 10) {
		        System.out.print(" + ");
		    }
			sum += i;
			i++;
		}
		System.out.println(" = " + sum);
		
		
	}

}
