package studyjava.basic;

import java.util.Scanner;

public class Java36_loop {

	public static void main(String[] args) {
		// 아이디와 비밀번호를 입력받아
		// 로그인 시도횟수가 3번 틀리면 "로그인 실패! 계정이 잠금처리 되었습니다" 출력하시오
		Scanner scanner = new Scanner(System.in);
		
		String id = "hong";
		String pw = "1234";
		
		String isid = ""; //입력 id
		String ispw = ""; //입력 비밀번호
		
		int count = 0; //실패 횟수
		int failCount = 3; //실패 제한 횟수
		
		while(count < failCount) {
			System.out.print("아이디를 입력하세요: ");
			isid = scanner.next();
			System.out.print("비밀번호를 입력하세요: ");
			ispw = scanner.next();
			
			if(id.equals(isid) && pw.equals(ispw)) {
				System.out.println("로그인 성공!");
				break;
			}else {
				System.out.println("아이디 또는 비밀번호가 틀렸습니다.");
				count++;
				if(failCount - count > 0)
					System.out.println("남은 횟수: "+ (failCount - count));
			}
			
			if(count == failCount) {
				System.out.println("로그인 실패! 계정이 잠금처리 되었습니다");
				break;
			}
		}
		scanner.close();
		
	}

}
