package studyjava.middle;

//부모클래스 - 직원
class Employee { //직원
	
	String name; //이름
	String dept; //부서
	int baseSalary; //기본급
	int workYears; //근속년수
	
	//부모 생성자
	Employee(String name, String dept, int baseSalary, int workYears) {
		this.name = name;
		this.dept = dept;
		this.baseSalary = baseSalary;
		this.workYears = workYears;
	}
	
	//근속수당 - 공통개선
	int getSendPay() {
		return workYears * 50000; //1년 => 5만원
	}
	
	//급여계산 - 자식에게 오버라이딩 예정
	int calcSalary() {
		return baseSalary + getSendPay();
	}

	//직원 정보 출력
	void printInfo() {
		System.out.println("이름: " + name);
		System.out.println("부서: " + dept);
		System.out.printf("기본급 : %,d원%n" ,baseSalary);
		System.out.println("근속 : " + workYears + "년");
		System.out.printf("급여: %,d원%n" , calcSalary());
	}
	
}

class FullTime extends Employee{ //정규직
	
	int bonus;//상여금
	String position;//직급
	
	public FullTime(String name, String dept, int baseSalary, int workYears, int bonus, String position) {
		super(name, dept, baseSalary, workYears);
		this.bonus = bonus;
		this.position = position;
	}
	
	@Override
	int calcSalary() {
		return super.calcSalary() + bonus;
	}
	
	@Override
	void printInfo() {
		System.out.println("[정규직]");
		super.printInfo();
		System.out.println("직급 : " + position);
		System.out.printf("상여금 : %,d원%n" , bonus);
	}
	
}

class PartTime extends Employee{
	int workHours; //월 근무시간
	int hourlyWage; //시급
	
	public PartTime(String name, String dept, int workHours, int hourlyWage) {
		super(name, dept, 0, 0);
		this.workHours = workHours;
		this.hourlyWage = hourlyWage;
	}
	
	@Override
	int calcSalary() {
		return hourlyWage * workHours;
	}
	
	@Override
	void printInfo() {
		System.out.println("[계약직]");
		System.out.println("이름: " + name);
		System.out.println("부서: " + dept);
		System.out.printf("시급 : %,d원%n" ,hourlyWage);
		System.out.println("근무시간 : " + workHours + "시간");
		System.out.printf("급여: %,d원%n" , calcSalary());
	}
	
}

class Intern extends Employee{ //인턴
	int preiod; //인턴기간(개월 수)
	boolean converted; //정규직 전환 여부
	
	public Intern(String name, String dept, int baseSalary, int preiod) {
		super(name, dept, baseSalary, 0);
		this.preiod = preiod;
		this.converted = false;
	}
	
	void convert() {
		converted = true;
		System.out.println(name + "님 정규직 전환 완료");
	}
	
	@Override
	void printInfo() {
		System.out.println("[인턴]");
		super.printInfo();
		System.out.println("기간: " + preiod + "개월");
		System.out.println("전환: " + (converted ? "완료" : "미완료"));
	}
}

public class Java12_inherit {

	public static void main(String[] args) {

		FullTime ft = new FullTime("홍길동", "개발팀", 3500000, 5, 500000, "대리");
		PartTime pt = new PartTime("김알바", "영업팀", 10000, 160);
		Intern it = new Intern("이인턴", "기획팀", 2000000, 6);
		
		ft.printInfo();
		System.out.println();
		pt.printInfo();
		System.out.println();
		it.printInfo();
		
	}

}
