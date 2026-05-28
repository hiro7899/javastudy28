package studyjava;

public class Java55_array2 {
		
	public static void main(String[] args) {
		//번호 국어 영어 수학 총점 평균 구하기
		
		int [][] score = {
				{100, 100, 100},
				{90, 90, 90},
				{80, 80, 80}
		};
		
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		
		int num = 0;
		int tkor = 0;
		int teng = 0;
		int tmat = 0;
		
		for(int i = 0; i < score.length; i++) {
			num += 1;
			int sum = 0;
			double avg = 0;
			
			for(int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
				
			}
			
			tkor += score[i][0];
			teng += score[i][1];
			tmat += score[i][2];
			
			avg = (double)sum / score[i].length;
			
			System.out.printf("%d\t%d\t%d\t%d\t%d\t%.2f\n", num, score[i][0], score[i][1], score[i][2], sum, avg);
		}
		System.out.println(tkor + "\t" + teng + "\t" + tmat);
		
	}
}
