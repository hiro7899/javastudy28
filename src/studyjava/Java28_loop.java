package studyjava;

public class Java28_loop {

	public static void main(String[] args) {
		
		//프로그램 들여쓰기 재정렬 ctrl + shift + F
		// 문제 : 1-10까지 정수의 합계를 구하여 출력하시오
		int i = 1;
		int sum = 0;
		while (i <= 10) {
			System.out.print(i);

			if (i < 10) {
				System.out.print(" + ");
			}
			sum += i;
			i++;
		}
		System.out.println(" = " + sum);

		// 위 프로그램을 do-while 문으로 바꾸자

		int k = 1;
		int total = 0;
		do {
			System.out.print(k);

			if (k < 10) {
				System.out.print(" + ");
			}
			total += k;
			k++;
		} while (k <= 10);// 반복실행할 조건식은 최종값 가지고 만든다
		System.out.println(" = " + total);
		
		int tot=0;
		for(int j = 1; j <= 10; j++) {
			System.out.print(j);
			if(j < 10) {
				System.out.print(" + ");
			}
			tot += j;
		}
		System.out.println(" = " + tot);
		
	}

}
