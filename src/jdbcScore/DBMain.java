package jdbcScore;

import java.util.Scanner;

public class DBMain {

	public static void main(String[] args) {
		
		//메뉴
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;
		
		ScoreDAO dao = new ScoreDAO();
		
		while(flag) {
			System.out.print("[1]입력[2]출력[3]전체 출력[4]국어점수 최대값[5]오라클 총점 평균 학점출력[6]수정[7]삭제[0]종료 : ");
			int menu = scanner.nextInt();
			
			if(menu == 1) {
				dao.viewInsert();
				
			}else if(menu == 2) {
				dao.findByIdx();
				
			}else if(menu == 3) {
				dao.printAll();
				
			}else if(menu == 4) {
				dao.printMaxIdxName();
				
			}else if(menu == 5) {
				dao.printTotAvg();
				
			}else if(menu == 6) {
				dao.updateView();
				
			}else if(menu == 7) {
				
				
			}else if(menu == 0) {
				flag = false;
				System.out.println("종료");
				
			}else {
				System.out.println("잘못된 입력" + menu);
			}
			
		}
		
		scanner.close();
	}

}
