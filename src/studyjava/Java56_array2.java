package studyjava;

import java.util.Scanner;

public class Java56_array2 {

	public static void main(String[] args) {
		// 좌석현황(O = 빈자리, X = 예매)
		//	1열 2열 3열 4열 5열
		//A행 o	o	o	o	o
		//B행 o	o	o	o	o
		//C행 o	o	o	o	o
		//D행 o	o	o	o	o
		//E행 o	o	o	o	o

		//행 입력(A-E) : B
		//열 입력(1-5) : 3
		//B3예약 완료!
		
		//예매는 3회 실행시킨다
		Scanner scanner = new Scanner(System.in);
		
		boolean[][] seats = new boolean[5][5]; //false빈자리
		String[] rows = {"A", "B", "C", "D", "E"};
		int[] columns = {1, 2, 3, 4, 5};
		
		String row = "";
		int column = 0;	
		
		int successCount = 0;
		
		while(successCount < 3) {
			int rowCount = -1; //다른 값 입력 감지를 위해 -1을 넣어줌
			int columnCount = -1;
			
			System.out.print("행 입력(A-E): ");
			row = scanner.next();
			
			System.out.print("열 입력(1-5): ");
			column = scanner.nextInt();
			
			for(int i = 0; i < rows.length; i++) {
				if(row.equals(rows[i])) {
					rowCount = i;
					break;
				}
			}
			
			for(int i = 0; i < columns.length; i++) {
				if(column == columns[i]) {
					columnCount = i;
					break;
				}
			}
			
			if(rowCount == -1 || columnCount == -1) {
				System.out.println("[입력 오류] A~E행, 1~5열 사이로 다시 입력해 주세요.");
				continue;
			}
			
			if(seats[rowCount][columnCount] == true) {				
				System.out.println(rows[rowCount]+ columns[columnCount] + "는 이미 예약된 자리입니다!");
				continue;
			}
			
			seats[rowCount][columnCount] = true;
			System.out.printf("%s행 %d열 예약완료!\n", row, column);
			
			successCount++;
		}
		
		System.out.println("\t1\t2\t3\t4\t5"); //열 번호 붙이기
		for(int i = 0; i < seats.length; i++) {
			System.out.print(rows[i]+ "\t"); // A B C D E 행 출력
			
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
