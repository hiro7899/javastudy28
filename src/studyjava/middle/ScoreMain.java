package studyjava.middle;

import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ScorePro scorePro = new ScorePro();
		
		boolean select = true;
		
		while(select) {
			System.out.println("[1]입력기능[2]출력기능[3]검색기능[4]삭제기능[5]수정기능[0]종료");
			
			int menu = scanner.nextInt();
			switch(menu) {
				case 1:
					System.out.println("입력기능");
					
					scorePro.insert();
					
					break;
				case 2:
					System.out.println("출력기능");
					
					scorePro.scorePrint();
					
					break;
				case 3: 
					System.out.println("검색기능");
					
					scorePro.select();
					
					break;
				case 4: 
					System.out.println("삭제기능");
					
					scorePro.delete();
					
					break;
				case 5:
					System.out.println("수정기능");
					
					scorePro.update();
					
					break;
				case 0: 
					System.out.println("프로그램 종료");
					
					select = false;
					
					break;
				default:
					System.out.println("잘못된 입력입니다.");
					break;
			}
			
		}
		
		scanner.close();
	}

}
