package studyjava.middle;

class Product extends Object{ 
	//모든 클래스는 Object 클래스를 상속받는다. 기입무관
	
	int price; //제품가격
	int bonusPoint; //보너스 점수
	
	Product() { //기본 생성자
		
	}
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Computer extends Product{
	Computer() {
		super(100);
	}
	
	@Override
	public String toString() {
		return "Computer";
	}
}

class Audio extends Product{
	Audio() {
		super(50);
	}
	
	@Override
	public String toString() {
		return "Audio";
	}
}

class Keyboard extends Product{
	Keyboard() {
		super(70);
	}
	
	@Override
	public String toString() {
		return "Keyboard";
	}
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	
	//총약과 구매한 물품을 출력해보자 -> 객체배열
	//Computer[] comArray = new Computer[3]; computer 객체만 저장할 수 있는 배열
	
	Product[] proArray = new Product[3]; //computer, audio, keyboard 객체를 저장할 수 있는 배열이 된다.
	
	int n = 0;
	
	//물건 구매 메서드
	//물건을 구매할 때 아래처럼 buy()메서드를 여러개 만들어야 할때 매개변수를 다형성을 이용하면 한개의 메서드만 만들어 사용할 수 있다
//	void buy(Computer com) {
//		
//	}
//	void buy(Audio ad) {
//		
//	}
//	void buy(Keyboard kb) {
//		
//	}
	
	void buy(Product p) { //다형성 : 상속관계에서 부모타입의 참조변수로 자식타입의 객체를 다룰 수 있다
		//구매할 돈이 충분한가?
		if(money < p.price) {
			System.out.println("잔액이 부족합니다");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "을 구매하셨습니다.");
		//print() 메서드와 결합하여 객체를 출력하라고 하면 toString() 메서드를 무조건 호출한다
		
		proArray[n] = p;
		n++;
	}
	
	void summary() {
		int sum = 0; //총액
		String itemList = ""; //구입한 물품목록
		
		for(int i = 0; i < proArray.length; i++) {
			if(proArray[i] == null) break;
			
			sum += proArray[i].price;
			itemList += proArray[i] + ", ";
			//proArray[i]
			//자바는 문자열과 객체를 + 연산으로 연결하면 자동으로 toString()을 호출한다
		}
		
		System.out.println("구매 총액 : " + sum);
		System.out.println("구매 물품 : " + itemList);
	}
}

public class ProductMain{
	
	public static void main(String[] args) {
		
		Computer com = new Computer();
		Audio ad = new Audio();
		Keyboard kb = new Keyboard();
		
		Buyer by = new Buyer();
		by.buy(com);
		by.buy(ad);
		by.buy(kb);
		
		by.summary();
	}
}
