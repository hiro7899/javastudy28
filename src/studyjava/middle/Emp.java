package studyjava.middle;

public class Emp { //직원관리 설계도
	
	private int idx; //사원번호
	private String name; //이름
	private String dept; //부서
	private int salary; //급여
	private int years; //근속년수
	
	//기본 생성자는 자동으로 삽입이 되지만 매개변수가 있는 생성자를 만들면 삽입이 되지 않는다
	//필요하면 직접 기본 생성자를 코딩해줘야한다

	public int getIdx() {
		return idx;
	}
	

	public void setIdx(int idx) {
		this.idx = idx;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDept() {
		return dept;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getYears() {
		return years;
	}
	
	public void setYears(int years) {
		this.years = years;
	}
	
	@Override
	public String toString() {
		return String.format("사번 : %d 이름: %s %s %d %d", idx, name, dept, salary, years);
	}
	
}
