package studyjava.middle;

public class Java02__01 {

	public static void main(String[] args) {
		
		//main() 메서드 위치에 Java02_02 설계도를 사용하고 싶으면
		//Java02_02 설계도에는 static 이 없는 메서드가 2개 있다
		
		//static 이 없는 메서드를 사용하고 싶으면
		//객체 생성을 해야 사용할 수 있다
		
		Java02_02 calc = new Java02_02();
		
		calc.view();
		
		calc.calculator();
	}

}
