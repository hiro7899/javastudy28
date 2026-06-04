package studyjava.middle;

public class Java03_class {

	public static void main(String[] args) {
		// 클래스(Class)란
		// 객체를 만들기 위한 설계도
		// 객체(Object)란
		// 클래스(설계도)로 만들어진 실제 인스턴스(개체) 이다.

		// 클래스의 구성요소
		// 필드(field) : 멤버변수(객체의 데이터가 저장되는 곳)
		// 생성자(Constructor) : 객체 생성시 초기화 역할 담당
		// 메서드(Method) : 객체의 동작에 해당하는 실행 블록
		
		// 생성자 만드는 규칙
		// 클래스의 이름과 생성자의 이름이 같아야 한다
		// 생성자는 리턴타입이 없다
		
		// 오버로딩(Overloading)
		// 생성자 또는 이름이 같은 메서드를 여러개 만들 수 있다
		// 조건 : 매개변수의 개수 또는 데이터 형이 다르다.
		
		// this
		// 현재 자기 자신 객체의 멤버변수를 선택할 때 사용
		
		//객체 생성 후 매개변수 없는 생성자 호출
		Score28 s281 = new Score28();
		
		//객체 생성 후 멤버변수에 값을 저장할 수 있게 된다
		s281.bno = 1;
		s281.name = "aaa";
		s281.kor = 100;
		s281.eng = 100;
		s281.mat = 100;
		
		Score28 s282 = new Score28();
		
		s282.bno = 2;
		s282.name = "bbb";
		s282.kor = 90;
		s282.eng = 90;
		s282.mat = 90;
	}

}
