package studyjava.middle;

public class Java06_ObjectArray {
	
	//멤버변수
	int bno;
	String name;
	int kor;
	int eng;
	int mat;
	int tot;
	double ave;
	String grade;
	int rank;
	
	//기본생성자
	//기본생성자는 코딩을 안해도 컴파일러가 자동으로 생성해준다
	//단 매개변수가 있는 생성자를 만들면 기본생성자를 만들지 않는다
	Java06_ObjectArray() {}
	
	//매개변수가 있는 생성자
	Java06_ObjectArray(int bno, String name, int kor, int eng, int mat) {
		this.bno = bno;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	//메서드
	public void totAveCalc() {
		tot = kor + eng + mat;
		ave = (double)tot / 3;
		
		ave = Math.round(ave * 100) / 100.0;
	}
	
	public void gradeCalc() {
		if(ave >= 90) {
			grade = "A";
		}else if(ave >= 80) {
			grade = "B";
		}else if(ave >= 70) {
			grade = "C";
		}else if(ave >= 60) {
			grade = "D";
		}else {
			grade = "F";
		}
	}
	
	public void arrPrint() {
		System.out.print(bno + "\t");
		System.out.print(name + "\t");
		System.out.print(kor + "\t");
		System.out.print(eng + "\t");
		System.out.print(mat + "\t");
		System.out.print(tot + "\t");
		System.out.print(ave + "\t");
		System.out.print(grade + "\t");
		System.out.println(rank + "\t");
	}
	
	public static void rankProcess(Java06_ObjectArray[] arr) {
		
//		for(int i = 0; i < arr.length; i++) {
//			arr[i].rank = 1;
//			for(int j = 0; j < arr.length; j++) {
//				if(arr[i].ave < arr[j].ave) {
//					arr[i].rank += 1;
//				}
//			}
//		}
		
		for(Java06_ObjectArray a : arr) {
			a.rank = 1;
			for(Java06_ObjectArray b : arr) {
				if(a.ave < b.ave) {
					a.rank +=1;
				}
			}
		}
		
	}
	
	
}
