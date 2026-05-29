package studyjava.basic;

import java.util.Scanner;

public class Java56_array2 {

	public static void main(String[] args) {
		// 좌석현황(O = 빈자리, X = 예매)
		//		1열 	2열 	3열 	4열 	5열
		//A행 	o	o	o	o	o
		//B행 	o	o	o	o	o
		//C행 	o	o	o	o	o
		//D행 	o	o	o	o	o
		//E행 	o	o	o	o	o

		//행 입력(A-E) : B
		//열 입력(1-5) : 3
		//B3예약 완료!
		
		//예매는 3회 실행시킨다
		Scanner scanner = new Scanner(System.in);
		
		boolean[][] seats = new boolean[5][5]; //false빈자리
		String[] rows = {"A", "B", "C", "D", "E"}; //행 이름
		int[] columns = {1, 2, 3, 4, 5}; //열 이름
		
		String row = ""; //선택할 행
		int column = 0;	 //선택할 열
		
		int successCount = 0;
		
		while(successCount < 3) {
			System.out.println("좌석현황(O = 빈자리, X = 예매)");
			System.out.println("\t1열\t2열\t3열\t4열\t5열"); //열 번호 붙이기
			for(int i = 0; i < seats.length; i++) {
				System.out.print(rows[i]+ "행\t"); // A B C D E 행 출력
				
				for(int j = 0; j < seats[i].length; j++) { // 빈자리 표시
					if(seats[i][j] == true) {
						System.out.print("X\t");
					}else {
						System.out.print("O\t");
					}
				}
				System.out.println(); //다음 행
			}
			
			System.out.print("행 입력(A-E): ");
			row = scanner.next().toUpperCase();
			
			int rowIndex = row.charAt(0) - 'A';  // 자동형변환
			//charAt(0) 행 입력한 첫번째 문자를 가져와라 
			//String => char
			//charAt(0) => B를 입력하면 66 - 65 = 1
			
			switch(rowIndex) {
			case 0: case 1: case 2: case 3: case 4:
				break;
			default:
				System.out.println("[입력 오류] A~E행 사이로 다시 입력해 주세요.");
				continue;
			}
			
			System.out.print("열 입력(1-5): ");
			
			column = scanner.nextInt();
			
			int columnIndex = column - 1;
			
			if(columnIndex < 0 || columnIndex > 4) {
				System.out.println("[입력 오류] 1~5열 사이로 다시 입력해 주세요.");
				continue;
			}
			
			if(seats[rowIndex][columnIndex] == true) {				
				System.out.println(rows[rowIndex]+ columns[columnIndex] + "는 이미 예약된 자리입니다!");
				continue;
			}
			
			seats[rowIndex][columnIndex] = true;
			System.out.printf("%s행 %d열 예약완료!\n", row, column);
			
			successCount++;
		}
		
		System.out.println("좌석현황(O = 빈자리, X = 예매)");
		System.out.println("\t1열\t2열\t3열\t4열\t5열"); //열 번호 붙이기
		for(int i = 0; i < seats.length; i++) {
			System.out.print(rows[i]+ "행\t"); // A B C D E 행 출력
			
			for(int j = 0; j < seats[i].length; j++) { // 빈자리 표시
				if(seats[i][j] == true) {
					System.out.print("X\t");
				}else {
					System.out.print("O\t");
				}
			}
			System.out.println(); //다음 행
		}
		
		scanner.close();
	}

}
