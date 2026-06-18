package studyjava.middle;

class Box<T> {
	//멤버변수
	T value; //value 라는 변수애는 어떤 데이터 객체 타입도 가능하다
	
	//생성자 - T타입 매개변수 받기
	Box(T value) {
		this.value = value;
	}

	// T타입 변경 메서드
	void setValue(T value) {
		this.value = value; //새 값으로 교체
	}
	
	// 타입정보 출력
	void printType() {
		System.out.println("타입 : " + value.getClass().getName() + "/ 값 : " + value);
		//getClass().getName 실제타입 이름 반환
	}
}

public class Java16_Generic {
	
	public static void main(String[] args) {
		//Wrapper 클래스
		//기본형 데이터 타입을 객체로 만들어 놓은 클래스
		
		//boolean -> Boolean
		//byte -> Byte
		//char -> Char
		//short -> Short
		//int -> Integer
		//long -> Long
		//float -> Floats
		//double -> Double
		
		//제네릭(Generic)이란?
		//제네릭이란 클래스나 메서드를 만들 떄 타입을 나중에 결정하는 기능이다
		//<T>라는 타입 매개변수를 사용해서 어떤 타입(객체)이든 처리할 수 있게 한다
		
		//제네릭이 있을 떄 ->Box<T> 하나로 Integer, String, Double 모두 처리 가능!
		
		Box<Integer> inBox = new Box<Integer>(100);
		Box<String> strBox = new Box<String>("Hello");
		Box<Double> doubleBox = new Box<Double>(12.456);
		
		inBox.printType();
		strBox.printType();
		doubleBox.printType();
		
		//제네릭 타입 매개변수 관례
		// t -> Type (일반타입)
		// E -> Element(요소, 컬렉션에서 사용)
		// K -> Key(키)
		// V -> Value(값)
		// N -> Number(숫자)
		// R -> Return(반환)
		
	}
}
