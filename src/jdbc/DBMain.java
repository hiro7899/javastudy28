package jdbc;

import java.util.Scanner;

public class DBMain {

	public static void main(String[] args) {
		
		//메뉴
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;
		
		ScoreDAO dao = new ScoreDAO();
		
		while(flag) {
			System.out.print("[1]입력[2]출력[3]전체 출력[4]수정[5]삭제[0]종료 : ");
			int menu = scanner.nextInt();
			
			if(menu == 1) {
//				System.out.print("학번 : ");
//				int idx = scanner.nextInt();
				
				System.out.print("이름 : ");
				String name = scanner.next();
						
				System.out.print("국어 : ");
				int kor = scanner.nextInt();
						
				System.out.print("영어 : ");
				int eng = scanner.nextInt();
						
				System.out.print("수학 : ");
				int mat = scanner.nextInt();
				
				ScoreDTO dto = new ScoreDTO();
				
				dto.setIdx(dao.countIdx());
				dto.setName(name);
				dto.setKor(kor);
				dto.setEng(eng);
				dto.setMat(mat);
				
				dao.setInsert(dto);
				
			}else if(menu == 2) {
				System.out.print("학번 입력: ");
				int idx = scanner.nextInt();
				
				ScoreDTO dto = dao.getCondition(idx);
				
				System.out.print(dto.getIdx()+ " " + dto.getName() + " " 
						+ dto.getKor() + " " + dto.getEng() + " " + dto.getMat());
				
				int tot = dto.getKor() + dto.getEng() + dto.getMat();
				double ave = (double)tot / 3;
				
				System.out.print(" 총점 : " + tot + " ");
				System.out.println("평균 : " + ave);
				
				
			}else if(menu == 3) {
				System.out.println("========전체출력=========");
				System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
				
				for(ScoreDTO dto : dao.getScore()) {
					System.out.print(dto.getIdx() + "\t");
					System.out.print(dto.getName() + "\t");
					System.out.print(dto.getKor() + "\t");
					System.out.print(dto.getEng() + "\t");
					System.out.print(dto.getMat() + "\t");
					
					int tot = dto.getKor() + dto.getEng() + dto.getMat();
					double ave = (double)tot / 3;
					System.out.print(tot + "\t");
					System.out.println(ave);
				}
				
			}else if(menu == 4) {
				System.out.print("수정할 학번 입력: ");
			    int idx = scanner.nextInt();
			    
			    ScoreDTO dto = dao.getCondition(idx);
			    
			    if(dto == null) {
			        System.out.println("존재하지 않는 학번입니다.");
			        continue;
			    }
			    
			    System.out.print("[1]이름 [2]국어 [3]영어 [4]수학 : ");
			    int subMenu = scanner.nextInt();
			    
			    if(subMenu == 1) {
			        System.out.print("새 이름: ");
			        dto.setName(scanner.next());
			    } else if(subMenu == 2) {
			        System.out.print("새 국어점수: ");
			        dto.setKor(scanner.nextInt()); 
			    } else if(subMenu == 3) {
			        System.out.print("새 영어 점수: ");
			        dto.setKor(scanner.nextInt()); 
			    } else if(subMenu == 4) {
			        System.out.print("새 수학 점수: ");
			        dto.setKor(scanner.nextInt()); 
			    } else {
					System.out.println("잘못 된 입력");
					continue;
				}
			    
			    dao.getUpdate(dto);
			    System.out.println("수정 완료!");
				
			}else if(menu == 5) {
				System.out.print("삭제하실 학번 : ");
				int idx = scanner.nextInt();
				
				dao.getDelete(idx);
				
				System.out.println(idx + "번 삭제 성공!");
				
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
