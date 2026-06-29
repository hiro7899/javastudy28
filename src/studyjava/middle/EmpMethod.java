package studyjava.middle;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpMethod {

	Scanner scanner = new Scanner(System.in);
	
	public void insert(ArrayList<Emp> list) {
		System.out.print("사번 : ");
		int idx = scanner.nextInt();
		
		System.out.print("이름 : ");
		String name = scanner.next();
		
		System.out.print("부서 : ");
		String dept = scanner.next();
		
		System.out.print("급여 : ");
		int salary = scanner.nextInt();
		
		System.out.print("근속년수 : ");
		int years = scanner.nextInt();
		
		Emp emp = new Emp();
		
		emp.setIdx(idx);
		emp.setName(name);
		emp.setDept(dept);
		emp.setSalary(salary);
		emp.setYears(years);
		
		list.add(emp);
				
//		Emp emp1 = new Emp();
//		emp1.setIdx(1);
//		emp1.setName("홍길동");
//		emp1.setDept("개발팀");
//		emp1.setSalary(3500000);
//		emp1.setYears(5);
		
//		list.add(emp1);
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
