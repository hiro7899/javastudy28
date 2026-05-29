package studyjava.basic;

import java.util.Scanner;

public class Java09_operator {

	public static void main(String[] args) {
		//항공권 가격(원) : 300000
		//숙박비(원) : 150000
		//식비(원) : 80000
		//여행인원수 : 3
		//출력화면
		//1인 여행경비 : 530000원
		//전체 여행경비 : 15900000원
		
		int flight; //항공권
		int hotel; //숙박비
		int food; //식비
		int people; //여행인원수
		
		int totalPerson; //1인 여행경비
		int total; //전체 여행 경비
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("항공기 가격을 입력하시오: ");
		flight = scanner.nextInt();
		System.out.print("숙박비를 입력하시오: ");
		hotel = scanner.nextInt();
		System.out.print("식비를 입력하시오: ");
		food = scanner.nextInt();
		System.out.print("여행인원을 입력하시오: ");
		people = scanner.nextInt();
		
		totalPerson = flight + hotel + food;
		total = totalPerson * people;
		
		System.out.println("1인 여행경비 : " + totalPerson + "원");
		System.out.println("전체 여행경비 : " + total + "원");
		
		scanner.close();
	}

}
