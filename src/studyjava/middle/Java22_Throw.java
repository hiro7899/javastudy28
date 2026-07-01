package studyjava.middle;

class Ex1 {
	static double divide(int a, int b) {
		if(b == 0) { 
			throw new ArithmeticException("0으로 나눌 수 없어요!"); //직접 예외 발생
		}
		return (double)a / b;
	}
	
	static int parseNumber(String input) {
		try {
			return Integer.parseInt(input);
		} catch (NumberFormatException e) {
			System.out.println("숫자가 아닙니다 : " + input);
			return 0;
		}
	}
}

public class Java22_Throw {

	public static void main(String[] args) {
		try {
			double result = Ex1.divide(10, 2);
			System.out.println("10 / 2 = " + result);
			result = Ex1.divide(10, 0);
			System.out.println("여기는 실행 안됨");
		} catch (ArithmeticException e) {
			System.out.println("오류: " + e.getMessage());
		} finally {
			System.out.println("종료");
		}
	}

}
