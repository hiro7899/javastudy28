package studyjava.basic;

public class Java30_loop {

	public static void main(String[] args) {
		// 1~10까지 정수중에서 홀수의 합계를 구하여 출력하시오
		// 1+3+5+7+9 = 25
		
		// while 문
		
		int i =1;
		int sum = 0;
		while(i<= 10) {
			if(i % 2 == 1) {
				System.out.print(i);
				if(i < 9) {
					System.out.print("+");
				}
				sum += i;
			}
			i++;
		}
		System.out.println(" = " + sum);
		
		//do-while 문
		i = 1;
		sum = 0;
		do {
			if(i % 2 == 1) {
				System.out.print(i);
				if(i < 9) {
					System.out.print("+");
				}
				sum += i;
			}
			i++;
		}while(i <= 10);
		System.out.println(" = " + sum);
		
	}

}
