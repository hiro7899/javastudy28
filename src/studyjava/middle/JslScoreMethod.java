package studyjava.middle;

import java.util.ArrayList;
import java.util.Scanner;

public class JslScoreMethod {
	Scanner scanner = new Scanner(System.in);
	//입력작업
	public void insert(ArrayList<JslScore> jsl) {
		//학번, 이름, 점수 입력
		JslScore stu = new JslScore();

		System.out.print("학번 입력 : ");
		int idx = scanner.nextInt();
		stu.setIdx(idx);
		
		System.out.print("이름 입력 : ");
		String name = scanner.next();
		stu.setName(name);
		
		System.out.print("점수 입력 : ");
		int score = scanner.nextInt();
		stu.setScore(score);
		
		jsl.add(stu);
        System.out.println("학생이 등록되었습니다");
	}
	
	//출력작업
	public void printScore(ArrayList<JslScore> jsl) {
		//ArrayList<JslScore> 가변배열에
		//저장된 모든 객체를 반복하면서 출력
		if(jsl.isEmpty()) {
			System.out.println("등록된 학생이 없습니다");
			return;
		}
		
		System.out.println("=============학생부");
		System.out.printf("%-6s%-6s%-6s%n", "학번", "이름", "점수");
		for(JslScore stu : jsl) {
			System.out.printf("%-6d%-6s\t%d점%n", stu.getIdx(), stu.getName(), stu.getScore());
			
		}
	}
	
	//검색작업
	public void select(ArrayList<JslScore> jsl) {
		//학번 입력
		//ArrayList<JslScore>  가변배열에 저장값이랑
		//입력받은 학번과 비교해서
		//같으면 학번, 이름, 점수를 출력하고
		//같은 값이 없으면 해당 학번 학생이 없어요 출력
		System.out.print("학번 입력 : ");
		int idx = scanner.nextInt();
		
		boolean found = false;
		
		for(JslScore stu : jsl) {
			if (stu.getIdx() == idx) {
				System.out.printf("%-6d%-6s\t%d점%n", stu.getIdx(), stu.getName(), stu.getScore());
				found = true;
				break;
			}
		}
		
		if (!found) {
			System.out.println(idx + "해당학생이 없어요");
		}
		
	}
	
	//삭제작업
	public void delete(ArrayList<JslScore> jsl) {
		//삭제 학번 입력 :
		//ArrayList<JslScore>  가변배열에 저장값이랑
		//입력받은 학번과 비교해서
		//같으면 배열에 저장된 객체를 삭제
		//같은 값이 없으면 해당 학번 학생이 없어요 출력
		
		System.out.print("학번 입력 : ");
		int idx = scanner.nextInt();
		
		JslScore target = null;
		
		for(JslScore stu : jsl) {
			if (stu.getIdx() == idx) {
				target = stu;
				break;
			}
		}
		
		if (target != null) {
            jsl.remove(target);
            System.out.println("성공적으로 삭제되었습니다.");
        } else {
            System.out.println("해당 학번의 학생이 없어요");
        }
	}
	
	
}
