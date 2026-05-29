package studyjava.basic;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Java06_scanner {

	public static void main(String[] args) {
		//키보드로부터 데이터를 입력받는 방법
		//번호 입력 : 1111
		//이름 입력 : 홍길동
		//국어입력 : 100
		//영어입력 : 100
		//수학입력 : 100
		//번호 이름 국어 영어 수학 총점 평균 학점 합격여부를 출력하시오
		
		//Scanner 클래스
		//키보드로 부터 데이터를 입력받기 위한 클래스
		//System.in에게 키를 읽게 하고 읽은 바이트를
		//문자, 정수, 불린, 실수, 문자열 등 다양한 타입으로 변환하여 리턴
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		int num;
		String name;
		int kor, eng , math;
		int tot;
		double avg;
		String grade;
		String result;
		
		System.out.print("번호 입력: ");
		num = sc.nextInt();
		
		System.out.print("이름 입력: ");
		name = sc.next();
		
		System.out.print("국어점수 입력: ");
		kor = sc.nextInt();
		
		System.out.print("영어점수 입력: ");
		eng = sc.nextInt();
		
		System.out.print("수학점수 입력: ");
		math = sc.nextInt();
		
		tot = kor + eng + math;
		avg = tot / 3;
		
		if(avg >= 90) {
			grade = "A";
		}
		else if(avg >= 80) {
			grade = "B";
		}
		else if(avg >= 70) {
			grade = "C";
		}
		else if(avg >= 60) {
			grade = "D";
		}
		else {
			grade = "F";
		}
		
		if(avg >= 80) {
			result = "합격";
		}
		else {
			result = "불합격";
		}
		
		System.out.println("\t\t\t\t성적표");
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t학점\t합격여부");
		System.out.println(num + "\t" + name + "\t" + kor + "\t" + eng + "\t" + math 
				+ "\t" + tot + "\t" + df.format(avg) + "\t" + grade + "\t" + result);
		
		sc.close();
	}

}
