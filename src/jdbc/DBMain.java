package jdbc;

import java.util.Scanner;

public class DBMain {

	public static void main(String[] args) {
		
		//메뉴
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;
		
		ScoreDAO dao = new ScoreDAO();
		
		while(flag) {
			System.out.print("[1]입력[2]출력[3]종료 : ");
			int menu = scanner.nextInt();
			
			if(menu == 1) {
				System.out.print("학번 : ");
				int idx = scanner.nextInt();
				
				System.out.print("이름 : ");
				String name = scanner.next();
						
				System.out.print("국어 : ");
				int kor = scanner.nextInt();
						
				System.out.print("영어 : ");
				int eng = scanner.nextInt();
						
				System.out.print("수학 : ");
				int mat = scanner.nextInt();
				
				ScoreDTO dto = new ScoreDTO();
				
				dto.setIdx(idx);
				dto.setName(name);
				dto.setKor(kor);
				dto.setEng(eng);
				dto.setMat(mat);
				
				dao.setInsert(dto);
				
			}else if(menu == 2) {
				
			}else if(menu == 3) {
				flag = false;
				System.out.println("종료");
				
			}else {
				System.out.println("잘못된 입력" + menu);
			}
			
		}
		
		scanner.close();
	}

}
