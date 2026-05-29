package studyjava.basic;

public class Java18_condition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Java조건문(Conditional Statement)
		//조건문이란 주어진 조건이 참 또는 거짓이냐에 따라
		//다른 코드를 실행하도록 제어하는 문장을 말한다
		
		//조건문의 종류
		//if, if - else, if - else if - else, 중첩if, switch-case문, 삼항연산자
		
		//if문 : 조건이 참일때만 실행
		
		int score = 80;
		if(score >= 60) {
			System.out.println("합격");
		}
		
		//if-else문 : 참이면 if, 거짓이면 else 실행
		if(score >= 60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		if(score >=90) {
			System.out.println("A학점");
		}else if(score >= 80) {
			System.out.println("B학점");
		}else if(score >= 70) {
			System.out.println("C학점");
		}else if(score >= 60) {
			System.out.println("D학점");
		}else {
			System.out.println("F학점");
		}
		
		//중첩if : if문 안에 if문
		//18세 이상이면 성인입니다를 출력
		//돈 5000이상 있으면 입장 가능합니다. 출력
		int age = 19;
		int money = 8000;
		
		if(age >= 18) {
			System.out.println("성인입니다.");
			if(money >= 5000) {
				System.out.println("입장 가능합니다");
			}else {
				System.out.println("잔액이 부족합니다");
			}
		}else {
			System.out.println("미성년자는 입장 불가 입니다");
		}
		
		//switch-case문 : 값에 따라 분기
		int day = 3;
		switch(day) {
		case 1:
			System.out.println("월요일");
			break;
		case 2:
			System.out.println("화요일");
			break;
		case 3:
			System.out.println("수요일");
			break;
		case 4:
			System.out.println("목요일");
			break;
		case 5:
			System.out.println("금요일");
			break;
		default:
			System.out.println("주말"); //break를 하지 않아도 끝남
		}
		//break를 빠뜨리면 아래 case까지 모두 실행된다. *주의
			
		//삼항연산자 - 한 줄로 조건 처리
		String result = (score>=60)? "합격": "불합격";
		System.out.println("Result: " + result);
		
		int a=10, b= 20;
		int max = (a>b)? a:b;
		System.out.println("큰 값: " + max);
		}
	

}
