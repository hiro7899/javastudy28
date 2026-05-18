package studyjava;

import java.util.Scanner;

public class Java22_condition {

	public static void main(String[] args) {
		// 키보드로부터 이름, 국어, 영어, 수학 점수 입력받아서
		// 이름, 총점, 평균, 판정을 출력하시오
		// [입력예시]
		// 입력자료 : 홍길동 39 90 80
		// [출력예시]
		// 이름 : 홍길동
		// 평균 : 69.67
		// 판정 : 불합격
		// 불합격 사유 : 과락
		
		// [입력예시]
		// 입력자료 : 김학생 50 65 55
		// [출력예시]
		// 이름 : 김학생
		// 평균 : 56.67
		// 판정 : 불합격
		// 불합격 사유 : 평균미만

		//처리조건
		//평균은 소수이하 셋째자리에서 반올림하여 둘째 자리까지
		//조건 : 3과목 점수가 40 이상 평균 60이상 합격
		//평균 60 미만 -> 불합격, 이유 : 평균미만
		//1과목이라도 40미만이 있는 경우 -> 불합격, 이유 : 과락
		//판정이 불합격일 경우 불합격 사유를 출력한다
		String name;
		int kor, eng, math;
		int total;
		double avg;
		String result;
		String reason = null;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름입력: ");
		name = scanner.next();
		
		System.out.print("국어 점수 입력: ");
		kor = scanner.nextInt();
		System.out.print("영어 점수 입력: ");
		eng = scanner.nextInt();
		System.out.print("수학 점수 입력: ");
		math = scanner.nextInt();
		
		total = kor + eng + math;
		avg = (double)total / 3;
				
		if(kor >= 40 && eng >= 40 && math >= 40) {
			if(avg >= 60) {
				result = "합격";
			}else {
				result = "불합격";
				reason = "평균미만";
			}
		}else {
			if(avg >= 60) {
				result = "불합격";
				reason = "과락";
			}else {
				result = "불합격";
				reason = "평균미만 및 과락";
			}
		}
		
		System.out.println("이름: " + name);
		System.out.printf("평균: %.2f\n", avg);
		System.out.println("판정: " + result);
		
		if(reason != null){
			System.out.println("불합격 사유: " + reason);
		}
		
		scanner.close();
		
	}

}
