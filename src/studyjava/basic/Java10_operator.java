package studyjava.basic;

public class Java10_operator {

	public static void main(String[] args) {
		//두 변수의 값 교환하기
		int a = 10;
		int b = 20;
		System.out.println("교환전");
		System.out.print("a = " + a + ", ");
		System.out.println("b = " + b);
		int tmp;
		
		tmp = a;
		a = b;
		b = tmp;
		System.out.println("교환후");
		System.out.print("a = " + a + ", ");
		System.out.println("b = " + b);
	}

}
