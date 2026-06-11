package studyjava.middle;

//부모 클래스의 기본 생성자가 자동 선택
class AA {
	public AA() {
		System.out.println("생성자 A");
	}
	public AA(int x) {
		System.out.println("X = " + x);
	}
	//매개변수가 있는 생성자를 만들면 기본 생성자는 컴파일러가 삽입을 안 한다
}

class BB extends AA{
	public BB() { // AA의 기본 생성자를 호출하는데, 없을경우 오류가 발생한다
		System.out.println("생성자 B");
	}
}

public class Java09_inherit {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		BB bb = new BB();// AA 객체 아래 BB 객체를 생성하게 된다
		
		
	}

}
