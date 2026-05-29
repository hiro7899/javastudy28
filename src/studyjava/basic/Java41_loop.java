package studyjava.basic;

public class Java41_loop {

	public static void main(String[] args) {
		// *****
		// *****
		// *****

		// 행수는 바깥 for 문으로 처리, 열수는 안쪽 for 문으로 처리한다
		// x=1 일때 y=12345 실행
		// x=2 일때 y=12345 실행
		// x=3 일때 y=12345 실행
		// 15번 실행한다
		
		for(int x = 1; x <= 3; x++) { // x= 1,2,3
			//바깥 for 문 조건식이 거짓이면 빠져나간다
			//참이면 안쪽 for 문을 실행한다
			for(int y = 1; y <= 5; y++) {// y= 1,2,3,4,5
				//안쪽 for 문 조건식이 거짓이면 안쪽 for 문을 빠져나간다
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
