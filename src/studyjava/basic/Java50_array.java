package studyjava.basic;

import java.util.Scanner;

public class Java50_array {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("학생 수 입력: ");
		int n = scanner.nextInt();
		
		String[] name = new String[n];
		int[] scores = new int[n];
		
		//1번 이름 : aa
		//1번 점수 : 89
		//위 처럼 3번을 입력받아 배열에 저장하는 프로그램을 작성하시오
		
		for(int i = 0; i < n; i++) {
			System.out.print((i + 1) + "번 이름 : ");
			name[i] = scanner.next();
			
			System.out.print((i + 1) + "번 점수 : ");
			scores[i] = scanner.nextInt();
		}
		
		//배열에 저장된 정수값 합계(total)를 계산하시오
		//배열에 저장된 정수값 중에서 최대값(max), 최소값(min), 평균(avg)을 구하시오.
		
		int total = 0;
		int max = scores[0];
		int min = scores[0];
		double avg = 0.0;
		
//		for(int i = 0; i < n; i++) {
//			total += scores[i];
//			
//			if(max < scores[i]) {
//				max = scores[i];
//			}
//			if(min > scores[i]) {
//				min = scores[i];
//			}
//		}
		
		//향상된 for문
		for(int score : scores) {
			total += score;
			
			if(max < score) {
				max = score;
			}
			if(min > score) {
				min = score;
			}
		}
		avg = (double)total / n;
		
	
		System.out.println("----------------------------------------------------------");
		System.out.printf("%-6s\t점수\t등수\t학점\t합격\t전체평균대비\n","이름");
		System.out.println("----------------------------------------------------------");
		
		//등수와 학점을 계산하시오
		//학점은 90이상 A, 80이상 B, 70이상 C, 60이상 D, 아니면 F
		//합격여부는 점수가 60이상이면 합격, 아니면 불합격
		
		int rank;
		char grade;
		String result;
		
		for(int i = 0; i < n; i++) {
			rank = 1;
			for(int j = 0; j < n; j++) {
				if(scores[i] < scores[j]) {
					rank++;
				}
			}
			
			if(scores[i] >= 90) {
				grade = 'A';
			}else if(scores[i] >= 80) {
				grade = 'B';
			}else if(scores[i] >= 70) {
				grade = 'C';
			}else if(scores[i] >= 60) {
				grade = 'D';
			}else {
				grade = 'F';
			}
			
			if(scores[i] >= 60) {
				result = "합격";
			}else {
				result = "불합격";
			}
			
			double diff;
			diff = scores[i] - avg;
			String avgDiff = String.format("%+.1f", diff);
			
			System.out.printf("%-6s	%3d점\t%2d등\t%s\t%-5s\t%s\n",
					name[i], scores[i], rank, grade, result, avgDiff);
		}

		System.out.println("=========================================================");
		System.out.printf("전체평균 : %.1f점\t최고 : %d점\t최저 : %d점\n", avg, max, min);
		System.out.println("=========================================================");
		scanner.close();
	}

}
