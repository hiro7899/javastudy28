package studyjava.middle;

//스마트 홈 기기 인터페이스

//전원 제어 인터페이스
public interface PowerController {

	void turnOn(); //전원 켜기
	void turnOff(); //전원 끄기
	boolean isPowerd(); //전원 상태 변환
}

//원격 제어 인터페이스
interface RemoteController {
	void setTimer(int minutes); //타이머 설정
	void schedule(String time); //예약설정
}
//에너지 모니터링 인터페이스
interface EnergyMoniter {
	double getWattage(); //소비전력 반환
	double calcMonthlyBill(); //월 전기요금 계산
	
}
//스마트 에어컨
class SmartAC implements PowerController, RemoteController, EnergyMoniter{
	String brand; //브렌드
	boolean powered; //전원 상태
	int temperature; //설정 온도
	double wattage; //소비전력(W)
	int timeMin; //타이머(분)
	
	
	
	public SmartAC(String brand, int temperature, double wattage) {
		this.brand = brand;
		this.temperature = temperature;
		this.wattage = wattage;
		this.powered = false;
		this.timeMin = 0;
	}

	@Override
	public void turnOn() {
		powered = true; // 전원 on
		System.out.println(brand + "에어컨 on! 설정온도 : " + temperature + "℃");
	}
	
	@Override
	public void turnOff() {
		powered = false; // 전원 off
		System.out.println(brand + "에어컨 off!");		
	}
	
	@Override
	public boolean isPowerd() { //전원상태 반환
		return powered;
	}
	
	@Override
	public void setTimer(int minutes) { //타이머
		timeMin = minutes; //타이머 설정
		System.out.println(minutes + "분 후로 자동 off 예약");
	}
	
	@Override
	public void schedule(String time) {
		System.out.println(time + "자동 on 예약 완료");
	}

	@Override
	public double getWattage() {
		return powered? wattage : 0;
	}

	@Override
	public double calcMonthlyBill() {
		//전력(kw) * 하루 8시간 * 30일 * 요금(120원/kw)
		
		return (wattage/1000) * 8 * 30 * 120;
	}
	
	void setTemperature(int temp) { //온도 설정 메서드
		temperature = temp;
		
		System.out.println("온도 " + temp + "℃ 설정");
	}
	
	void printStatus() {
		System.out.println("=============================");
		System.out.println("기기 : " + brand + "에어컨");
		System.out.println("전원 : " + (powered ? "ON" : "Off"));
		System.out.println("온도 : " + temperature + "℃");
		System.out.println("소비전력 : " + getWattage());
		System.out.println("월 요금 : " + calcMonthlyBill());
		System.out.println("==============================");
	}
}
//스마트 전구











