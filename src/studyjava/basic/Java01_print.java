package studyjava.basic;
//package 란 여러 클래스를 모아놓은 폴더를 말한다
public class Java01_print {
//클래스 이름은 관례상 첫글자를 대문자로 만든다
//접근제한자 : public, default, protected, private 가 있다.
//public이란 접근제한이 없다.	
//class 란: 설계도를 의미한다. 자바언어는 개발을 할 때 클래스를 만들어야 한다
//클래스의 이름과 소스파일의 이름이 같아야 한다.	
	public static void main(String[] args) {
		//자바언어는 class 인스턴스화 하여 객체(object)를 생성한다
		//하지만 static을 붙이면 객체생성없이 main() 메서드를 사용할수 있다.
		//void : 리턴값이 없을 때 사용한다
		//main() : 메인 메서드는 맨 처음 실행하는 메서드 이다
		//String[] args : 매개변수라고 부른다
		//매개변수란? main()메서드를 호출하면서 넘어온 데이터를 저장하는 변수
		
		//출력하는 방법
		System.out.print("성적표"); //클래스.객체.print() . . 체인방식
		System.out.println();
		System.out.print("번호\t이름\t국어\t영어\t수학\t총점\t평균\t학점\t등수\n");
		System.out.println("1111\t홍길동\t100\t100\t100");
		System.out.println("2222\t김길동\t100\t100\t100");
	}
}