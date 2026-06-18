package studyjava.middle;

class Member {
	
}

class User{
	private static User instance = new User();
	//하난의 객체를 만든다
	//private를 붙여서 instance 변수 접근을 막아버린다
	private User() {
		//생성자 또한 호출 못 하도록 막아버린다
	}

	public static User getInstance() {
		//다른 클래스에서 User 객체를 사용하려면
		//getInstance() 메서드를 통해서만 접근을 할 수 있도록 한다
		return instance;
	}

}

//싱글톤을 사용하는 이유
// 사용자 환경설정, 커넥션 풀, 사용자의 정보 로딩 등...

public class Java17_Singleton {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// 싱글톤(singleton) 패턴
		// 하나의 어플리케이션에서 오로지 단, 하나만 생성되는 객체(인스턴스)
		
		Member m1 = new Member();
		Member m2 = new Member();
		
		//User user = new User();
		//User 클래스에 접근제한자 private 를 붙이면 접근 불가하기 때문에 객체 생성도 불가
		
		User.getInstance();
	}

}
