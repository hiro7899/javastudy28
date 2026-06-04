package studyjava.middle;

public class Score28 {

	//멤버 변수
	int bno;
	String name;
	int kor;
	int eng;
	int mat;
	int tot;
	double ave;
	char grade;
	
	//기본 생성자: 매개변수가 없다
	//클래스의 이름과 메서드 이름이 같다
	//리턴타입이 없다
	public Score28() { 
		
	}
	
	//매개변수가 있는 생성자
	public Score28(int bno, String name, int kor, int eng, int mat) {
		this.bno = bno;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;	
	}
	
	public Score28(int bno, String name, int kor, int eng) {
		this.bno = bno;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	
	public Score28(String name, int bno, int kor, int eng) {
		this.bno = bno;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	
	public void calc() {
		this.tot = this.kor + this.eng + this.mat;
		ave = tot / 3;
		
		// 현재 자기 자신의 객체일때는 this 생략 가능하다
	}
	
	public void grade() {
		if(ave >= 90) {	this.grade = 'A';}
		else if(ave >= 80) { this.grade = 'B';}
		else if(ave >= 70) { this.grade = 'C';}
		else if(ave >= 60) { this.grade = 'D';}
		else { this.grade = 'F';}
	}
	
}
