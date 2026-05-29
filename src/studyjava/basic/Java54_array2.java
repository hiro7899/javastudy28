package studyjava.basic;

public class Java54_array2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// 배열의 종류 : 1차원 => [], 2차원 => [][], 3차원 => [][][] ...
		
		// 2차원 배열의 선언과 할당
		int intArr[][]; //정수값 저장할 수 있는 2차원
		char charArray[][]; //문자 저장할 수 있는 2차원
		
		intArr = new int[2][3];
		charArray = new char[3][4];
		
		//선언과 할당을 동시에 하고 싶으면
		int[][] arr = new int[2][3];
		double[][] douArr = new double[3][3];
		
		int n=0;
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				n++;
				intArr[i][j] = n;
			}
		}
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(intArr[i][j] + " ");
			}
			System.out.println();
		}
		
		//객체 생성없이 초기화
		int[][] score = {
				{60, 70, 40},
				{55, 66, 88}
			};
		
		//2차원 배열의 길이를 이용하여 조건문을 만드는 방법
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
