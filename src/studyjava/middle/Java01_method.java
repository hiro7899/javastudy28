package studyjava.middle;

public class Java01_method {
	
	public static void add() {
		System.out.println("add 메서드 호출 되었습니다");
		//public : add() 메서드를 접근 제한이 없는 메서드로 만든다
		//static : 객체생성 없이 add() 메서드를 호출할 수 있다
		//void : 호출한 곳으로 되돌려주는 값이 없을 때 void
		//return 문이 없어도 호출한 곳으로 되돌아간다
	}
	
	public static void hap(int a) {
		System.out.println("hap 메서드가 호출되면서 a 변수 저장값은 " + a + "입니다");
		//return 문이 없어도 호출한 곳으로 되돌아간다
	}
	
	public static void mul(int a, int b) {
		System.out.println("a * b = " + (a * b));
		//return 문이 없어도 호출한 곳으로 되돌아간다
	}
	
	public static double sub(double a, int b) {
		double c = (double)a - b;
		
		return c; // c값을 double 데이터 형으로 호출한 곳으로 되돌려줘라
	}
	
	public static int arrSum(int[] arr) { //sum 값이 int 타입이기 떼문에 반환값 데이터형 int
		//int[] arr { } 안에서만 인식이 되는 지역변수이다
		
		int sum = 0;
		for(int a : arr) {
			sum += a;
		}
		//System.out.println("sum = " + sum);
		//호출한 곳으로 sum 값응 보내서 출력할 때
		return sum;
	}
	
	public static void main(String[] args) {
		
		add();
		add();
		hap(10);
		
		mul(10, 20);
		
		System.out.println(sub(12.45, 10));
		double result = sub(12.45, 10); //sub() 메서드 실행 후 되돌아 온 값 2.45를 result 변수에 저장
		result = Math.round(result * 100) / 100.0;
		System.out.println("12.45 - 10 = " + result);
		
		int[] arr = {1, 2, 3, 4, 5};
		int sum = arrSum(arr);

		System.out.println("sum = " + sum);
		
		
		// 메서드(Method) 
		
		// 메서드란 특정 기능을 수행하는 코드 묶음이다
		// 코드를 메서드로 만들어 필요할 때마다 호출하여 사용한다
		// 기본구조
		// 반환형 메서드명(매개변수) {
		//		실행코드
		// return 반환값;
		// }
		
		// 메서드명은 호출을 할 때 사용하는 이름이다.
		// 매개변수는 메서드를 호출하면서 넘어온 값을 저장하는 변수ㅡ이다
		// 매개변수 데이터형은 메서드를 호출하면서 넘겨준 값의 데이터형과 같아야 한다
		// return 은 호출한 곳으로 되돌아 가라
		// 반환형: 호출한 곳으로 되돌려 주는 값의 데이터형
		// 메서드를 호출하면 반환값이 있던지 없던지 무조건 호출한 곳으로 되돌아 간다
		// 만약 return 10 이면 반환형은 int, long
		// 만약 return 123.45 이면 반환형은 double
		// 만약 return "abc" 이면 반환형은 String
		// 만약 return 해주는 값이 없으면 반환형은 void
		
		// 호출한 곳으로 되돌아 온 값을 저장하고 싶을 때는 변수를 호출한 곳에서 만들면 된다
		
		// 메서드를 만드는 방법
		// 하나의 클래스에 여러개의 메서드를 만들 수도 있고, 다른 클래스 안에 메서드를 만들 수 있다
		// 다른 클래스에 메서드를 만들었을 때는 new 키워드를 이용하여 객체를 생성해야 사용할 수 있다
		
		
	}

}
