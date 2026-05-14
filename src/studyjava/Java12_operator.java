package studyjava;

import java.util.Scanner;

public class Java12_operator {

	public static void main(String[] args) {
		//아이디와 비밀번호를 입력받아
		//아이디 (abcd), 비밀번호(1234)와 같으면 로그인 성공을 출력하시오
		//그렇지 않으면 아이디와 비밀번호를 확인하세요 출력
		
		String id = "abcd";
		String pw = "1234";
		
		String cid;
		String cpw;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("아이디를 입력하세요 : ");
		cid = scanner.next();
		System.out.print("비밀번호를 입력하세요 : ");
		cpw = scanner.next();
		
		if(id.equals(cid) && pw.equals(cpw)) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("아이디와 비밀번호를 확인하세요");
		}
		
		
	}

}
