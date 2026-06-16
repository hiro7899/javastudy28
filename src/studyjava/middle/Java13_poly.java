package studyjava.middle;

class Tv {
	boolean power; //전원상태
	int channel; //채널
	
	void power() {
		power = !power;
	}
	
	void channelUp() {
		++channel;
	}
	
	void channelDown() {
		--channel;
	}
	
}

class CaptionTv extends Tv {
	String text; //캡션내용
	
	void caption() {
		
	}
}

public class Java13_poly {

	public static void main(String[] args) {
		// 다형성(polymorphism)
		// 사전적 의미: 여러 형태를 취할 수 있는 능력
		// 프로그램적 의미 : 상속관계에 있을 경우 부모의 참조변수로 자식 타입의 객체를 다룰 수 있다
		
//		Tv t = new Tv();　5개 요소를 다룰 수 있다
//		CaptionTv c = new CaptionTv(); 7개 요소를 다룰 수 있다
		
		Tv t = new CaptionTv();
		//다형성 : 부모타입(Tv)의 참조변수가 자손타입의 객체(CaptionTv)를 다룰 수 있다.
		//부모타입의 참조변수일지라도 자식타입의 모든 요소를 다룰 수는 없고
		//부모타입의 멤버요소만 다룰 수 있다
		
		t.power = false;
		t.channel = 17;
		t.channelUp();
		t.channelDown();
		
		//t.text; 에러
		//t.caption();에러
		
		//참조변수가 부모 타입일 때와 자손 타입일때의 차이점은
		//참조변수로 사용할 수 있는 멤버의 갯수가 달라진다.
		
//		CaptionTv c = new Tv();
		//자손 아입의 참조 변수로 조상 타입의 객체를 다룰 수 없다
		
		//참조변수의 형변환
		
		CaptionTv ct = (CaptionTv) new Tv(); // 다운 캐스팅
		
		ct.channel = 11;
		ct.power = false;
		ct.text = "꽁냥 꽁냥";
		ct.caption();
		ct.channelDown();
		ct.channelUp();
		ct.power();
		
		Tv tv = ct; //업 캐스팅
		tv.channel = 22;
		tv.power = true;
		tv.channelDown();
		tv.channelUp();
		tv.power();
		
//		tv.text = "aaa";
//		tv.caption();
		//부모참조변수로 자식요소를 다룰 수 없다
		
		//Product 설계도를 만들어 매개변수의 다형성을 알아보자
		
		
	}

}
