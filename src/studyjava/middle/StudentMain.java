package studyjava.middle;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
		Scanner scanner = new Scanner(System.in);
		boolean menu = true;
		
		StudentMethod service = new StudentMethod();
		
		while(menu) {
			System.out.println("====[1]입력[2]일반출력[3]등수포함출력[4]람다식출력[0]종료====");
			int select = scanner.nextInt();
			if(select == 1) {
				service.insert(list);
			}else if(select == 2) {
				service.printMap(list);
			}else if(select == 3) {
				service.printMapWithRank(list);
			}else if(select == 4) {
				service.printLambda(list);
			}else if(select == 0) {
				menu = false;
			}else {
				System.out.println("잘못된 번호 입력: " + select);
			}
		}
		
		scanner.close();
	}

}
