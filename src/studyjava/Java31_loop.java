package studyjava;

public class Java31_loop {

	public static void main(String[] args) {
		// 1-10까지 정수 중에서 홀수는 +, 짝수는 - 하여 합계를 출력하시오
		// +1-2+3-4+5-6+7-8+9-10 = -5
		
		//for문 이용
		
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 1) {
				System.out.print("+");
				sum += i;
			}else {
				System.out.print("-");
				sum -= i;
			}
			System.out.print(i);
		}
		System.out.println(" = " + sum);

	}

}
