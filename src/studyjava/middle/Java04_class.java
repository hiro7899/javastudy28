package studyjava.middle;

class Score {
	//하나의 소스 안에 여러개의 설계도를 만들 때 public 사용할 수 없다
	int bno;
	String name;
	int age;
	
	Score(){
		
	}
	Score(int bno, String name, int age) {
		this.bno = bno;
		this.name = name;
		this.age = age;
	}
}

public class Java04_class {

	public static void main(String[] args) {
		//한 개의 소스파일 안에 여러개의 설계도를 만들 수도 있다.
		//현업에서는 거의 사용하지는 않지만 문법은 알고 있어야한다.
		

	}

}
