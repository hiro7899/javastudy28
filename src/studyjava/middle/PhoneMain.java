package studyjava.middle;

public class PhoneMain {

	public static void main(String[] args) {
		
		System.out.println(Phone.TIMEOUT); //★★★★★★★중요
		
		//static 붙은 변수, 메서드 사용법
		//인터페이스명.변수명 
		//클래스명.변수명, 클래스명.메소드명()
		
		SamsungPhone sp = new SamsungPhone();
		
		sp.printLogo();
		sp.sendCall();
		sp.receiveCall();
		sp.flash();
		
		SmartPhone smp = new SmartPhone();
		
		System.out.println(smp.calculator(10, 20));
		smp.play();
		smp.stop();
		smp.sendSMS();
		smp.receiveSMS();
		smp.sendCall();
		smp.receiveCall();
	
	}

}
