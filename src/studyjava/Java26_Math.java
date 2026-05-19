package studyjava;

public class Java26_Math {

	public static void main(String[] args) {
		// 반올림 하는 방법 Math.round()
		// 공식 : 곱하고 -> round -> 다시 나눈다
		
		//1자리 반올림, 소수 첫째 자리까지 표시
		
		double num = 3.141592;
		double result1 = Math.round(num * 10) / 10.0;
		//3.141592 * 10 == 31.41592
		//31 / 10.0 => 3.1
		System.out.println(result1);
		
		//2자리 반올림
		double result2 = Math.round(num * 100) / 100.0;
		System.out.println(result2);
		
		//3자리 반올림
		double result3 = Math.round(num * 1000) / 1000.0;
		System.out.println(result3);
	}

}
