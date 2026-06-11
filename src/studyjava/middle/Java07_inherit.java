package studyjava.middle;

class Animal {
	String name;
	int age;
	double weight;
	
	public Animal() {
		this("누렁이", 100);
		//현재 자기 자신의 매개변수 2개를 갖고 있는 생성자를 호출해라
	}
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Animal(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	void eat() { //먹는 기능 메서드
		System.out.println(name + "먹는 중 ...");
	}
	
	void sleep() {
		System.out.println(name + "자는 중 ...");
	}
	
	// 공통 정보 출력
	void printInfo() {
		System.out.println("이름 : " + name +"| 나이 : " + age + "| 몸무게 : " + weight);
	}
	
}

class Dog extends Animal {
	String breed; //품종 dog만의 멤버변수
	
	Dog(String name, int age, double weight, String breed){
		//super.name = name;
		//super 부모의 멤버변수, 메서드를 직접 지정해서 사용하고 싶을 때 사용한다
		super(name, age, weight); // 부모 생성자를 호출하는 메서드
		this.breed = breed;
	}
	
//	public void dogPrint() {
//		System.out.println(name + ", " + breed);
//	}
	
//	public void eatDog() {
//		System.out.println(name + "사료를 먹는 중...");
//	}
	
//	public void eat() {
//		System.out.println(name + "사료를 먹는 중...");
//	}
	
	@Override //Override 어노테이션
	//부모가 물려준 메서드를 재정의해서 사용하는 기능을 말한다
	void eat() {
		System.out.println(name + "사료를 먹는 중...");
	}
	
	void bark() {
		System.out.println("멍멍!");
	}
	
	@Override
	void printInfo() {
		super.printInfo();
		System.out.println("품종: " + breed);
	}
}

class Cat extends Animal{

	boolean isIndoor; //실내 실외

	public Cat(String name, int age, double weight, boolean isIndoor) {
		super(name, age, weight); //부모 생성자 중에서 매개변수 3개 자리를 호출해라
		this.isIndoor = isIndoor;
	}
	
	@Override
	void eat() {
		System.out.println(name + "참치를 먹는 중 ...");
	}
	
	//cat 메서드
	void meow() {
		System.out.println(name + "야옹");
	}
	
	@Override
	void printInfo() {
		super.printInfo();
		System.out.println("실내 : " + ((isIndoor)? "예" : "아니오"));
	}
}

public class Java07_inherit {

	public static void main(String[] args) {
		// 상속(inheritance)
		// 기존의 클래스를 재사용하여 새로운 클래스를 작성하는 것
		// 부모클래스에서 만들어진 멤버변수, 메서드를 자식클래스가 물려받는 것을 말한다
		// 상속 선언만 하면 자식 클래스는 부모 클래스에서 만들어진 멤버변수와 메서드를 만들지 않고도 사용할 수 있다
		// 자손클래스는 부모 클래스의 모든 멤버를 상속받는다.
		// 단. 생성자와 초기화 블럭은 상속되지 않는다.
		// 자식 클래스의 멤버 개수는 조상 클래스보다 항상 같거나 많다
		// 상속을 통해 코드의 재사용성을 높이고 코드의 중복제거, 프로그램의 생산성과 유지보수에 크게 기여한다
		// 상속을 구현하는 방법은 상속 받고자 하는 클래스의 이름을 키워드 extends 와 함께 써 주기만 하면 된다.
		// 자바언어는 다중 상속을 지원하지 않는다
		// 상속의 최상위 클래스는 java.lang.Object 클래스이다
		// 모든 클래스는 Object 클래스를 상속받는다.
		
		Dog dog = new Dog("바둑이", 3, 5.2, "시베리안허스키");
		Cat cat = new Cat("나비", 2, 3.8, true);
		
		System.out.println("강아지 ===========");
		dog.printInfo();
		dog.eat();
		dog.bark();
		dog.sleep();
		
		System.out.println("고양이 ===========");
		cat.printInfo();
		cat.meow();
		cat.eat();
		
	}

}
