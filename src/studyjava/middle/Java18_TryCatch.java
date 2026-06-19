package studyjava.middle;

class Notice{ //공지사항
	String writer; //글쓴이
	String title; //제목
	
}

public class Java18_TryCatch {

	public static void main(String[] args) {
		// 예외처리(Exception)
		// 프로그램 오류
		// 프로그램이 실행중 어떤 원인에 의해서 오동작을 하거나 비정상적으로 종료되는 경우가 있다
		// 이러한 결과를 초래하는 원인을 프로그램 에러 또는 오류라고 한다
		
		// 발생시점에 따라 컴파일 에러와 런타임 에러로 나눌 수 있다
		// 종류
		// 컴파일 에러 : 컴파일시 발생되는 에러
		// 런타임 에러 : 실행할때 발생되는 에러
		// 논리적 에러 : 실행은 되지만 의도와 다르게 동작하는 것
		
		// 에러와 예외
		// 에러 : 프로그램 코드에 의해서 수습될 수 없는 심각한 오류(메모리 부족, 스택 오버플로우)
		// 예외 : 프로그램 코드에 의해서 수습될 수 있는 다소 미약한 오류
		
		// 클래스의 최고 조상 Object
		// 모든 예외의 최고 조상 
		
		// 자주 발생하는 예외
		// ArithmeticException : 정수를 0으로 나눌 떄 발생
		// NullPointException : null 레퍼런스를 참조할 때 발생
		// ClassCastException : 형변환할 수 없는 타입으로 객체를 변환할 떄 발생
		// OutOfMemoryError : 메모리가 부족할 때 발생
		// ArrayIndexOutOfBoundsException : 배열의 범위를 벗어난 접근 시 발생
		// IllegalArgumentExeotion : 잘못된 인수 전달 시 발생
		// IOException : 입출력 동작 실패 또는 인터럽트 시 발생
		// NumberFormatException : 문자열이 나타내는 숫자와 일치하지 않는 타입의 숫자로 변환 시 발생
		// InputMismatchException : 정수를 입력받고자 하였지만 문자를 입력한 경우
		
		// 예외 처리하는 방법
		// try-catch-finally, throw
		
	}

}
