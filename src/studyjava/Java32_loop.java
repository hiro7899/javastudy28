package studyjava;

import java.util.Scanner;

public class Java32_loop {

	public static void main(String[] args) {
		// break : 반복문 수행중 break 문을 만나면 가장 가까운 반복문을 빠져나간다
		// continue : 반복문중 continue 문을 만나면 while문은 조건식으로 이동하고 for문은 증감식으로 이동한다
		
		// 개수 카운트 하는 방법
		// 키보드로 부터 정수를 입력받아서 합과 평균을 출력해보자
		// 단 입력값이 -99이면 종료한다
		
		Scanner scanner = new Scanner(System.in);
		
		int num = 0; //입력받은 정수값 저장변수
		int tot = 0; //입력받은 값이 정수 이면 합을 구하는 변수
		double avg; //평균을 저장하는 변수
		int cnt = 0; //입력받은 개수가 몇개인지 저장하는 변수
		
		while(true) { //무한반복, do-while(true); for(;;){ }
			System.out.print("정수를 입력하시오(-99 = 종료): ");
			num = scanner.nextInt();
			
			if(num > 0) {
				tot += num;
				cnt ++;
			}else if(num == -99) {
				break;
			}else {
				continue;
			}
			
		}
		avg = (double)tot / cnt;
		System.out.println("총합: " + tot);
		System.out.println("평균: " + avg);
		System.out.println("정수 개수:" + cnt);
		
		scanner.close();
	}
}
