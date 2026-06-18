package studyjava.middle;

public class PowerMain {

	public static void main(String[] args) {
		SmartAC ac = new SmartAC("LG", 24, 1500);
		System.out.println("스마트 홈 제어");
		
		ac.turnOn();
		ac.setTemperature(22);
		ac.setTimer(120); //2시간 후 off
		ac.schedule("08:00");
		ac.printStatus();
		
		
		ac.turnOff();
		
	}

}
