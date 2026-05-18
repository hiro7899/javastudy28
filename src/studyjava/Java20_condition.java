package studyjava;

import java.util.Scanner;

public class Java20_condition {

	public static void main(String[] args) {
		//BMI 측정
		//키입력(m): 1.75
		//몸무게 입력(kg) : 70
		//BMI지수 : 22.9
		//판정 : 정상
		
		double height;
		double weight;
		double bmi;
		String result;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("키 입력(m)");
		height = scanner.nextDouble();
		
		System.out.print("몸무게 입력(kg)");
		weight = scanner.nextDouble();
		
		bmi = weight / (height * height);
		
		if(bmi < 18.5) {
			result = "저체중";
		}else if(bmi < 23.0) {
			result = "정상";
		}else if(bmi < 25.0) {
			result = "과체중";
		}else {
			result ="비만";
		}
		
		System.out.println("당신의 BMI는 " + bmi + "이며 당신은 " + result + "입니다");
		
		scanner.close();
	}

}
