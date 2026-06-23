package studyjava.middle;

public class Java24_Math {

	public static void main(String[] args) {
		// Math 클래스
		// 산술 연산 메서드 제공, java.lang.Math
		// 모든 메서드는 static 타입, 클래스 이름으로 바로 호출한다
		
		//0.0 이상 1.0 미만의 임의의 double 값을 반환
		for(int x = 0; x < 1; x++) {
			int n = (int)(Math.random()*100 + 1);
			System.out.println(n);
		}
		
		//원주율
		System.out.println(Math.PI);
		double a = Math.PI;
		//올림
		System.out.println(Math.ceil(a));
		//내림
		System.out.println(Math.floor(a));
		//제곱근
		System.out.println(Math.sqrt(a));
		//e의 2승
		System.out.println(Math.exp(a));
		//반올림
		a=123.5678;
		System.out.println(Math.round(a));
		System.out.println(Math.round(a * 100) / 100.0);
		System.out.println(Math.round(a * 1000) / 1000.0);
		
		
	}

}
