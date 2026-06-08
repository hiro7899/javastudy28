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
		ave = (double)tot / 3;
		ave = Math.round(ave * 100.0) / 100.0;
		
		// 현재 자기 자신의 객체일때는 this 생략 가능하다
	}
	
	public void grade() {
		if(ave >= 90) this.grade = 'A';
		else if(ave >= 80) this.grade = 'B';
		else if(ave >= 70) this.grade = 'C';
		else if(ave >= 60) this.grade = 'D';
		else this.grade = 'F';
	}
	
	public void scoreTitle() {
		System.out.println("성적표");
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t학점");
	}
	
	public void scorePrint() {
		System.out.print(bno+ "\t");
		System.out.print(name+ "\t");
		System.out.print(kor+ "\t");
		System.out.print(eng+ "\t");
		System.out.print(mat+ "\t");
		System.out.print(tot+ "\t");
		System.out.print(ave+ "\t");
		System.out.print(grade);
		System.out.println();
		
	}
}
