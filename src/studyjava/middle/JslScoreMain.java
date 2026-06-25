package studyjava.middle;

import java.util.ArrayList;
import java.util.Scanner;

public class JslScoreMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<JslScore> jsl = new ArrayList<JslScore>();
		JslScoreMethod service = new JslScoreMethod();
		
		boolean flag = true;
		
		while(flag) {
			System.out.println("[1]입력[2]출력[3]검색[4]삭제[0]종료 -> 작업선택");
			int menu = scanner.nextInt();
			if(menu == 1) {
				//입력작업
				service.insert(jsl);
				
			}else if(menu == 2) {
				//출력작업
				service.printScore(jsl);
				
			}else if(menu == 3) {
				//검색작업
				service.select(jsl);
				
			}else if(menu == 4) {
				//삭제작업
				service.delete(jsl);
				
			}else if(menu == 0) {
				System.out.println("프로젝트 종료");
				flag = false;
			}else {
				System.out.println("잘못된 번호입니다.");
				continue;
			}
			
		}
		scanner.close();

	}

}
