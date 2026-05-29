package studyjava.basic;

import java.text.DecimalFormat;

public class Java04_printf {

	public static void main(String[] args) {
		
		//형식을 지정해서 출력하는 방법
		
		char c = 'A';
		int x = 100;
		double y = 34.56;
		String z = "Java Test";
		
		System.out.printf("%c %d %3.2f %s\n", c, x, y, z);
		
		//DecimalFormat 클래스
		//,(콤마),0(불필요한 숫자도 출력)을 출력형식 지정할 때 사용
		
		DecimalFormat df = new DecimalFormat("#,###.00 원"); //객체 생성하는 방법
		//#, 0은 출력형식을 지정하는 기호인데. #은 정수 한자리, 0은 불필요한 0 출력하기
		double tot = 98;
		System.out.println(df.format(tot));
		int amount = 99999;
		System.out.println(df.format(amount));
		
	}

}
