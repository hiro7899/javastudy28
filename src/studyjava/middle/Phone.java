package studyjava.middle;

public interface Phone {
	
	//상수
	public static final int TIMEOUT = 1000;
	public abstract void sendCall();
	
	void receiveCall(); //public abstract 생략가능
	default void printLogo() { //default 메서드 java 8 버전부터 사용가능
		System.out.println("***PHONE***");
	}
}

interface MobilePhone extends Phone { //인터페이스 상속 가능
	void sendSMS();
	void receiveSMS();
}

interface Mp3 {
	public void play();
	public void stop();
}

class PDA {
	public int calculator(int x, int y) {
		return x + y;
	}
}

class SmartPhone extends PDA implements MobilePhone, Mp3 { //상속과 구현을 동시에 할 수 있

	@Override
	public void sendCall() {
		System.out.println("전화 거는중");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화 받아");		
	}


	@Override
	public void sendSMS() {
		System.out.println("메세지 보낸다");		
	}

	@Override
	public void receiveSMS() {
		System.out.println("메세지 받았다");		
	}
	
	@Override
	public void play() {
		System.out.println("음악 연주 시작");
	}
	
	@Override
	public void stop() {
		System.out.println("음악 연주 종료");
	}
	
	//추가 메서드
	public void schedule() {
		System.out.println("일정관리 합니다");
	}
}

class SamsungPhone implements Phone {
	
	//멤버변수
	
	//생성자
	
	@Override
	public void sendCall() {
		System.out.println("띠리링");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화왔어요");
	}
	
	//일반 메서드
	public void flash() {
		System.out.println("전화기 불 켜짐");
	}
	
}
