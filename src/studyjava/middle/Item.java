package studyjava.middle;

//상품 클래스 정의
public class Item {

	String name; //상품명
	int price; //가격
	int qty; //수량
	
	Item(String name, int price, int qty) {
		this.name = name;
		this.price = price;
		this.qty = qty;
	}
	
	//소계 계산
	int getSubtotal() {
		return price * qty;
	}
	
	//toString() - 출력 형식 지정
	
	@Override
	public String toString() {
		return String.format("%-10s %,6d원 x %d 개 = %,d원", name, price, qty, getSubtotal());
	}
	
	//장바구니 cart 클래스를 만들어 처리해보자
	
	
	
}
