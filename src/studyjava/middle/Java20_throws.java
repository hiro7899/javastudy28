package studyjava.middle;

public class Java20_throws {

	public static void main(String[] args) throws Exception {
		//예외 발생하면 호출한 곳으로 throws(던지다) 한다
		method1();
		//method1(); 호출
	}
	
	static void method1() throws Exception {
		//예외 발생하면 호출한 곳으로 throws(던지다) 한다
		method2();
		//method2(); 호출
	}
	
	static void method2() throws Exception {
		//예외 발생하면 호출한 곳으로 throws(던지다) 한다
		
//		try {
//			throw new Exception();
//			
//		} catch (Exception e) {
//			//Exception 최고조상으로 선언을 하면 어떤 예외든지 처리하겠다
//			e.printStackTrace();
//		}
		
		throw new Exception();
		//예외 발생
	}

}
