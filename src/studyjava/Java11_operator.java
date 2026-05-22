package studyjava;

import java.util.Scanner;

public class Java11_operator {
	public static void main(String[] args) {
		//관계연산자
		//나이와 키를 입력받아
		//나이가 10세이상 그리고 키가 130cm 이상이면 놀이기구를 탈 수 있다
		
		int age;
		int height;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("나이 : ");
		age = scanner.nextInt();
		
		System.out.print("키 : ");
		height = scanner.nextInt();
		
		if(age >= 10 && height >= 130) {
			System.out.println("놀이기구를 타도 돼요");
		}else {
			System.out.println("우리친구 더 크면 타요");
		}
		
		scanner.close();
	}
}
