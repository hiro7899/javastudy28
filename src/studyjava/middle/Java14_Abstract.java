package studyjava.middle;

abstract class Calculator{ //추상클래스
	//추상메서드
	
	public abstract int add(int a, int b); 
	//추상메서드 : 선언부만 있고 구현부가 없다
	
	public abstract int subtract(int a, int b);
	public abstract double average(int[] a);
	
}

class GoodCalc extends Calculator{

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int subtract(int a, int b) {
		return a - b;
	}

	@Override
	public double average(int[] a) {
		double sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
}

public class Java14_Abstract {

	public static void main(String[] args) {
		// 추상클래스 (Abastract Class)
		// 추상클래스란 미완성 설계도이다

		// 일반 클래스 = 완성된 설계도 -> 바로 객체 생성 가능
		// 추상 클래스 = 미완성 설계도 -> 객체 생성 불가, 상속만 가능
		// 추상 메서드 = 미완성 메서드 -> 자식이 반드시 구현해야 함
		// 미완성 메서드 : 선언부만 있고 구현부가 없는 메서드
		// 추상 클래스도 멤버변수, 생성자, 메서드, 추상메서드를 가질 수 있다
		// 키워드 : abstract
		
		// 왜 사용하나?
		// 공통된 기능은 부모(추상클래스)에 구현
		// 반드시 구현해야 할 기능은 추상메서드로 강제시킨다
		// 자식 클래스가 빠뜨리면 컴파일 에러 발생
		// 설계의 일관성을 유지
		
		GoodCalc c = new GoodCalc();
		
		System.out.println(c.add(2, 3));
		System.out.println(c.subtract(2, 2));
		System.out.println(c.average(new int[] {2, 3, 4}));
		
		//결제관련 추상 클래스를 만들어 보자 Payment
	}

}
