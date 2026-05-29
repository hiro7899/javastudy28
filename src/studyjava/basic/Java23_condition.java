package studyjava.basic;

import java.util.Scanner;

public class Java23_condition {

	public static void main(String[] args) {
		//주차시간을 입력받아서
		//30분 이하 주차 : 무료
		//31-60분: 1000원
		//61-120분: 2000원
		//120분 초과
		//	기본요금 3000원
		//	이후 초과 1시간마다 1000원 추가
		//	1시간 미만이어도 1시간으로 계산
		
		int min;
		int price;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("주차시간을 입력하세요(분): ");
		min = scanner.nextInt();
		
		if(min <= 30) {
			price = 0;
		}else if(min > 30 && min <= 60) {
			price = 1000;
		}else if(min > 60 && min <= 120) {
			price = 2000;
		}else {
			price = 3000;
			price += (int)Math.ceil((min - 120) / 60.0)* 1000;
		}
		
		System.out.println("주차요금은 " + price + "원 입니다.");
		scanner.close();
	}

}
