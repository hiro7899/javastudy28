package studyjava.middle;

public class PaymentMain {

	public static void main(String[] args) {

		
		CreditCard cc = new CreditCard("홍길동", "1234-1234-2036", 1000000);
		DebitCard dc = new DebitCard("김길동", 500000);
		KakaoPay kp = new KakaoPay("박길동" , "010-1234-1234", 3000000);
		
		System.out.println("신용카드 결제");
		cc.pay(120000);
		cc.pay(50000);
		cc.pay(90000000); //한도초과
		
		System.out.println("체크카드 결제");
		dc.pay(200000);
		dc.pay(350000);	//잔액부족
		
		System.out.println("카카오 페이 결제");
		kp.pay(100000);
		kp.pay(500000);
	}

}
