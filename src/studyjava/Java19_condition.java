package studyjava;

import java.util.Scanner;

public class Java19_condition {
	public static void main(String[] args) {
		//점수입력(0~100): 85
		//학점 : B
		//입력하신 점수는 홀수 입니다.
		
		Scanner scanner = new Scanner(System.in);
		
		int score;
		String grade;
		
		System.out.println("점수 입력: ");
		score = scanner.nextInt();
		
		if(score >= 90) {
			grade = "A";
		}else if(score >= 80) {
			grade = "B";
		}else if(score >= 70) {
			grade = "C";
		}else if(score >= 60) {
			grade = "D";
		}else {
			grade = "F";
		}
		
		System.out.println("학점은 "+ grade + "입니다");
		
		if(score % 2 == 1) {
			System.out.println("입력하신 점수는 홀수 입니다");
		}else {
			System.out.println("입력하신 점수는 짝수 입니다");
		}
		
		scanner.close();
	}
}
