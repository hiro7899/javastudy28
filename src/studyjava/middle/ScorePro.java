package studyjava.middle;

import java.util.Scanner;

public class ScorePro {
	
	//배열 또는 필요한 변수 선언
	//int[][] arr = new int[][];
	int[][] arr = new int[][] { //테스트용
		{1, 100, 100, 100, 0},
		{2, 90, 90, 90, 0},
		{3, 80, 80, 80, 0}
	};
	
	Scanner scanner = new Scanner(System.in);
	
	int num;
	
	//입력처리 메서드()
	public void insert() {
//		for(int i = 0; i < arr.length; i++) {
//			System.out.print("번호 입력: ");
//			num = scanner.nextInt();
//			arr[i][0] = num;
//			
//			System.out.print("국어 점수 입력: ");
//			int kor = scanner.nextInt();
//			arr[i][1] = kor;
//			
//			System.out.print("영어 점수 입력: ");
//			int eng = scanner.nextInt();
//			arr[i][2] = eng;
//			
//			System.out.print("수학 점수 입력: ");
//			int math = scanner.nextInt();
//			arr[i][3] = math;
//			
//			arr[i][4] = arr[i][1] + arr[i][2] + arr[i][3];
//		}
		
		totalCalculator();
	}// insert()
	
	public void totalCalculator() {
		for(int i = 0; i < arr.length; i++) {
			arr[i][4] = arr[i][1] + arr[i][2] + arr[i][3];
		}
	}
	
	//출력 기능
	public void scorePrint() {
		for(int i = 0; i < arr.length; i++) {
			arr[i][4] = arr[i][1] + arr[i][2] + arr[i][3]; //임시
			
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	//검색기능
	public void select() {
		System.out.print("검색 학번 입력: ");
		
		int num = scanner.nextInt();
		boolean result = true;
		
		for(int i = 0; i < arr.length; i++) {
			if(num == arr[i][0]) {
				for(int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + "\t");
				}
				result = false;
				break;
			}
		}
		
		if(result) {
			System.out.println("학번이 존재하지 않습니다.");
		}
		
		System.out.println();
	} 
	
	//삭제기능
	public void delete() {
		System.out.print("검색 학번 입력: ");
		
		int num = scanner.nextInt();
		boolean result = true;
		
		for(int i = 0; i < arr.length; i++) {
			if(num == arr[i][0]) {
				for(int j = 0; j < arr[i].length; j++) {
					arr[i][j] = 0;
				}
				result = false;
				System.out.println(num + "번 학생 삭제되었습니다.");
				break;
			}
		}
		
		if(result) {
			System.out.println("학번이 존재하지 않습니다.");
		}
		
		System.out.println();
	}
	
	//수정기능
	public void update() {
		System.out.print("검색 학번 입력: ");
		
		int num = scanner.nextInt();
		boolean result = true;
		
		for(int i = 0; i < arr.length; i++) {
			if(num == arr[i][0]) {
				
				System.out.print("국어 점수 입력: ");
				arr[i][1] = scanner.nextInt();
				
				System.out.print("영어 점수 입력: ");
				arr[i][2] = scanner.nextInt();
				
				System.out.print("수학 점수 입력: ");
				arr[i][3] = scanner.nextInt();
				
				arr[i][4] = arr[i][1] + arr[i][2] + arr[i][3];
				
				result = false;
				System.out.println(num + "번 학생 업데이트 되었습니다.");
				break;
			}
		}
		
		if(result) {
			System.out.println("학번이 존재하지 않습니다.");
		}
		
		System.out.println(); 
		
	}
}
