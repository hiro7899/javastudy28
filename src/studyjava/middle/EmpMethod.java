package studyjava.middle;

import java.util.ArrayList;

public class EmpMethod {

	public void insert(ArrayList<Emp> list) {
		Emp emp1 = new Emp();
		emp1.setIdx(1);
		emp1.setName("홍길동");
		emp1.setDept("개발팀");
		emp1.setSalary(3500000);
		emp1.setYears(5);
		
		list.add(emp1);
	}
	
	//전체 출력
	public void empAllPrint() {
		
	}
	
	//급여 오름차순 출력
	public void empSalaryAsc() {
		
	}
	
	//급여 내림차순 출력
	public void empSalaryDesc() {
		
	}
	
	//이름 오름차순 출력
	public void empNameAsc() {
		
	}
	
	//이름 내림차순 출력
	public void empNameDesc() {
		
	}
	
}
