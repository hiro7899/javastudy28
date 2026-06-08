package quiz.jsl;

public class Cash {
	
	int money = 50000; // 처음 나눌 단위
	boolean five = true; // 1과 5를 스위치 하기위한 변수
	
	public void processMoney(int pay) {
		
		while(money >= 1) {
			int count = pay / money;
			pay %= money;
			
			System.out.println(money + "원 " + count + "장");
			
			if(five) {
				five = false;
				money /= 5;
			}else {
				five = true;
				money /=2;
			}
			
		}
		
		
	}
	
}
