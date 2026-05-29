package studyjava.basic;

import java.util.Scanner;

public class Java25_Math {

	public static void main(String[] args) {
		// 가위 바위 보 게임
		// 가위 1, 바위는 2, 보는 3
		
		Scanner scanner = new Scanner(System.in);
		
		String rsp;
		int me = 0;
		int com = 0;
		System.out.print("가위 바위 보 입력 : ");
		rsp = scanner.next();
		com = (int)(Math.random() * 3) + 1;
		
		if(rsp.equals("가위")) {
			me = 1;
		}else if(rsp.equals("바위")){
			me = 2;
		}else if(rsp.equals("보")) {
			me = 3;
		}else {
			System.out.println("입력이 틀렸습니다.");
		}
		
		if(me - com == -1 || me - com == 2) {
			System.out.println("졌습니다 ");
		}else if (me - com == -2 || me - com == 1) {
			System.out.println("이겼습니다 " );
		}else {
			System.out.println("비겼습니다 ");
		}
		
		if(com == 1) {
			rsp = "가위";
		}else if(com == 2) {
			rsp = "바위";
		}else {
			rsp = "보";
		}
		
		System.out.println("컴퓨터가 낸 것: " + rsp);
		int win = me - com;
		switch(win) {
			case -1:
			case 2:
				System.out.println("졌습니다 ");
				break;
			case -2:
			case 1: 
				System.out.println("이겼습니다 " );
				break;
			case 0:
				System.out.println("비겼습니다 ");
				break;
			default:
				System.out.println("잘못된 입력입니다");
		}
		scanner.close();

	}

}
