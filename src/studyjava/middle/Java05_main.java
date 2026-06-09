package studyjava.middle;

public class Java05_main {

	public static void main(String[] args) {
		
		Java05_class j1 = new Java05_class("홍길동", "110", 50);
		Java05_class j2 = new Java05_class("김길동", "111", 20);
		
		j1.printInfo();
		j1.deposit(10);
		j1.withdraw(5);
		
		j2.printInfo();
		j2.deposit(2);
		j2.withdraw(100);
		
		j1.transfer(j2, 10);
		
		j1.printInfo();
		j2.printInfo();
		
	}

}
