package studyjava;

import java.util.Scanner;

public class Java49_array {

	public static void main(String[] args) {
		// 번호 이름 국어 영어 수학 점수를 키보드로부터 3개의 데이터를 입력 받는다
		Scanner scanner = new Scanner(System.in);
		
		int[] num = new int[3];
		String[] name = new String[3];
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] math = new int[3];
		int[] tot = new int[3];
		double[] avg = new double[3];
		int[] rank = new int[3];
		
		//데이터 입력받아서 배열에 저장하기
		
		for(int i = 0; i < num.length; i++) {
			System.out.print("번호를 입력하시오: ");
			num[i] = scanner.nextInt();
			
			System.out.print("이름을 입력하시오: ");
			name[i] = scanner.next();
			
			System.out.print("국어점수를 입력하시오: ");
			kor[i] = scanner.nextInt();
			
			System.out.print("영어점수를 입력하시오: ");
			eng[i] = scanner.nextInt();
			
			System.out.print("수학점수를 입력하시오: ");
			math[i] = scanner.nextInt();
					
			
		}
		
		//총점 구하기
		for(int i = 0; i < num.length; i++) {
			tot[i] = kor[i] + eng[i] + math[i];
		}
		
		//평균 구하기
		for(int i = 0; i < num.length; i++) {
			avg[i] = (double)tot[i] / 3;
		}
		
		//등수 구하기
		for(int i = 0; i < num.length; i++) {
			rank[i] = 1;
			for(int j = 0; j < num.length; j++) {
				if(avg[i] < avg[j]) {
					rank[i]++;
				}
			}
		}
		
		
		System.out.println("===========================================================");
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t등수");
		System.out.println("-----------------------------------------------------------");
		
		for(int i = 0; i < num.length; i++) {
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",num[i], name[i], kor[i], eng[i], math[i], tot[i],
					avg[i], rank[i]);
			System.out.println("-------------------------------------------------------");
		}
		System.out.println("===========================================================");
		
		scanner.close();
	}

}
