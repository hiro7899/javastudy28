package studyjava;

public class Java47_array {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// 배열(Array)이란?
		// 같은 자료형의 데이터를 여러개 저장할 수 있는 자료구조
		// 여기서 중요한 것은 같은 자료형만 저장이 가능하다
		// 배열을 이용하면 많은 메모리 공간이 할당된다
		// 인덱스를 이용하여 원소 데이터 접근을 한다
		// 배열 인덱스(index)는 0부터 시작한다
		// 배열이 초기화 되지 않을 경우에는 묵시적인 값으로 자동 설정된다

		// 정수값 저장하는 배열 선언
		int intArr[];
		// 문자 저장하는 배열 선언문
		char charArr[];
		// 문자열 저장하는 배열 선언문
		String strArr[];

		// 선언문에서 주의사항은 배열의 개수를 적으면 안된다

		// 배열의 할당(생성)하고 싶으면

		// 정수값 저장하는 배열 5개를 만들고 싶으면
		intArr = new int[5];
		// 문자를 저장하는 배열 5개를 만들고 싶으면
		charArr = new char[5];
		// 문자열을 저장하는 배열 5개를 만들고 싶으면
		strArr = new String[5];

		// 위 두 개의 문장을 한 문장으로 바꾸면
		// int[] intArr = new int[5];

		// 실수값을 저장하는 배열 5개를 한문장으로 만들고 싶으면
		double[] douArray = new double[5];

		System.out.println("douArray : " + douArray);
		System.out.println("douArray[0] : " + douArray[0]);
		System.out.println("douArray[4] : " + douArray[4]);
		// System.out.println("douArray[5] : " + douArray[5]);
		// ArrayIndexOutOfBoundsException

		// 만들어진 5개의 배열에 값 저장
		douArray[0] = 10.0;
		douArray[1] = 20.0;
		douArray[2] = 30;// 4바이트 -> 8바이트에 저장. 자동 형변환이 되어서 30.0 저장
		douArray[3] = 40;
		douArray[4] = 50.0;

		// 위 문장을 for문으로 변경
		for (int i = 0; i < 5; i++) {
			douArray[i] = 10.0 * (i + 1);
		}

		// 인덱스(index)번호는 음수를 사용할 수 없음

		// 인덱스 번호를 이용한 출력문 작성
		System.out.println(douArray[0]);
		System.out.println(douArray[1]);
		System.out.println(douArray[2]);
		System.out.println(douArray[3]);
		System.out.println(douArray[4]);

		// 위 문장을 for문으로 변경
		for (int i = 0; i < 5; i++) {
			System.out.println(douArray[i]);
		}

		// 배열을 선언과 동시에 원하는 값으로 초기화 하는 방법
		int[] array1 = { 10, 20, 30, 40, 50 }; // 이 범위 만큼만 배열 생성

		// 배열의 길이를 알고 싶으면 배열명.length, 배열의 개수는 5, 인덱스번호는 0부터 시작
		for (int x = 0; x < array1.length; x++) {
			System.out.println(array1[x]);
		}

	}

}
