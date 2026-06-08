package studyjava.middle;

public class Java05_class {	//은행계좌 클래스
	
	//필요한 멤버변수(필드)
	String owner; //예금주 이름
	String accountNum; //계좌번호
	int balance; //잔액
	
	public Java05_class() {//기본생성자
		//기본생성자는 코딩을 안해도 컴파일하면 자동으로 생성해 준다
	}
	public Java05_class(String owner, String accountNum, int balance) {
		//매개변수가 있는 생성자를 만들면 기본 생성자는 만들어지지 않는다
		
		this.owner = owner;
		this.accountNum = accountNum;
		this.balance = balance;
	}
	
	//입금 메서드
	void deposit(int amount) { //amount 매개변수는 입금액
		if(amount < 0) {
			System.out.println("입금액을 확인 하세요");
			return;
		}
		this.balance = balance + amount; //현재 자기 자신의 멤버변수일 때는 this 생략가능
		
		System.out.printf("%,d원 입금완료! 잔액: %,d원\n", amount, balance);
		
	}
	//출금 메서드
	void withdraw(int amount) {
		if(amount <= 0) {
			System.out.println("출금액을 확인 하세요");
			return;
		}
		if(amount > balance) {
			System.out.println("잔액부족 현재잔액: " + balance + "원");
			return;
		}
		this.balance = balance - amount;
		
		System.out.printf("%,d원 출금완료! 잔액: %,d원\n", amount, balance);
		
	}
	
	//계좌 정보 출력 메서드
	void printInfo() {
		System.out.println("========================================================");
		System.out.println("예금주 : " + owner);
		System.out.println("계좌번호 : " + accountNum);
		System.out.printf("잔액 : %,d원\n", balance);
		System.out.println("========================================================");
	}
	
	//계좌 이체 메서드
	void transfer(Java05_class target, int amount) {
		if(amount <= 0) {
			System.out.println("이체금액을 확인 하세요");
			return;
		}
		if(amount > balance) {
			System.out.println("잔액부족 현재잔액: " + balance + "원");
			return;
		}
		this.balance -= amount;
		
		target.balance += amount;
		
		System.out.printf("%s -> %s 이체 : %,d원%n", this.owner, target.owner, amount);
	}
	
}
