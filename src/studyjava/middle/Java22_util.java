package studyjava.middle;

class Point {
	int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() { //Object가 물려준 toString() 메서드를 재정의 했다
		return "Point(" + x + ", " + y + ")";
	}
	
	@Override
	public boolean equals(Object obj) {
		Point p = (Point)obj;
		if(x == p.x && y == p.y) return true;
		else return false;
	}
}

class Rect {
	int width;
	int height;
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public boolean equals(Object obj) {
		Rect p = (Rect)obj;
		if(width * height == p.width * p.height) return true;
		else return false;
	}
}

class ObjectProperty {
	public static void print(Object obj) { //Object 최상위 클래스. 모든 클래스는 Object 클래스를 상속받는다
		System.out.println(obj.getClass().getName()); //클래스 이름 출력
		System.out.println(obj.hashCode()); //해시 코드 값. 해시코드란? 데이터를 계산해서 만든 '숫자 번호표'
		System.out.println(obj.toString()); //객체를 문자열로 만들어 출력
		System.out.println(obj); //객체출력
		
	}
}

public class Java22_util {

	public static void main(String[] args) {
		// 패키지(Package)
		// 서로 관련된 클래스와 인터페이스의 컴파일된 클래스 파일들을 하나의 디렉토리에 묶어놓은것
		// 하나의 응용 프로그램은 여러개의 패키지로 작성 가능하다
		// 패키지는 jar 파일로 압축할 수 있다
		
		// 주요 패키지
		// java.util : 날짜, 시간, 벡터, 해시맵 등과 같은 유틸리티 클래스와 인터페이스 제공
		// java.lang : 스트링, 수학함수, 입출력 등
		// java.io : 키보드, 모니터, 프린터, 디스크 등에 입출력 할 수 있는 클래스와 인터페이스 제공
		// java.swing : 자바 GUI 프로그래밍을 위한 스윙 패키지 제공
		
		Point p = new Point(2, 3);
		ObjectProperty.print(p); 
		
		Point a = new Point(2, 3);
		Point b = new Point(2, 3);
		Point c = a;
		
		if(a == b) {
			System.out.println("a == b");
		}
		if(a == c) {
			System.out.println("a == c");
		}
		if(a.equals(b)) { //객체 내용이 같은지 비교. String 문자열이 같은 지 비교할때 equals() 사용
			System.out.println("a is eqaul to b");
		}
		if(a.equals(c)) {
			System.out.println("a is eqaul to c");
		}
		
		Rect r1 = new Rect(20, 30);
		Rect r2 = new Rect(30, 20);
//		Rect r3 = new Rect(10, 20);
		
		if(r1.equals(r2)) {
			System.out.println("r1과 r2는 같다");
		}
		
	}

}
