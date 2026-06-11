package studyjava.middle;

//자식 클래스에 매개변수를 가진 생성자
class Aaa{
	public Aaa() {
		System.out.println("생성자 A");
	}
	public Aaa(int x) {
		System.out.println("매개변수 있는 생성자 A");
	}
}

class Bbb extends Aaa{
	public Bbb() {
		System.out.println("생성자 B");
	}
	public Bbb(int x) {
//		super(10); 만약 자식 클래스에서 생성자를 호출하고 싶으면 ***첫줄에 코딩***
		System.out.println("매개변수 있는 생성자 B");
	}
}

public class Java10_inherit {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Bbb b = new Bbb(5);
		//출력 : 생성자 A\n 매개변수 있는 생성자 B
		//매개변수가 있는 생성자를 호출하되 무조건 부모 클래스의 기본 생성자를 찾아간다
		
	}

}
