package studyjava.middle;

public class Java06_main {

	public static void main(String[] args) {
		//객체를 정하는 배열을 만들어보자
		Java06_ObjectArray[] arr = new Java06_ObjectArray[5];
		
		Java06_ObjectArray j1 = new Java06_ObjectArray(1, "홍길동", (int)(Math.random() * 21 + 80), (int)(Math.random() * 21 + 80), (int)(Math.random() * 21 + 80));
//		j1.totAveCalc();
//		j1.gradeCalc();
//		j1.arrPrint();
		arr[0] = j1;

		Java06_ObjectArray j2 = new Java06_ObjectArray(2, "김길동", (int)(Math.random() * 21 + 80), (int)(Math.random() * 21 + 80), (int)(Math.random() * 21 + 80));
//		j2.totAveCalc();
//		j2.gradeCalc();
//		j2.arrPrint();
		arr[1] = j2;
		
		Java06_ObjectArray j3 = new Java06_ObjectArray(3, "이길동", (int)(Math.random() * 21 + 80), (int)(Math.random() * 21 + 80), (int)(Math.random() * 21 + 80));
//		j3.totAveCalc();
//		j3.gradeCalc();
//		j3.arrPrint();
		arr[2] = j3;
		
		Java06_ObjectArray j4 = new Java06_ObjectArray(4, "박길동", (int)(Math.random()* 51 + 50), (int)(Math.random()* 51 + 50), (int)(Math.random()* 51 + 50));
//		j4.totAveCalc();
//		j4.gradeCalc();
//		j4.arrPrint();
		arr[3] = j4;
		
		Java06_ObjectArray j5 = new Java06_ObjectArray(5, "정길동", (int)(Math.random()* 61 + 40), (int)(Math.random()* 61 + 40), (int)(Math.random()* 61 + 40));
//		j5.totAveCalc();
//		j5.gradeCalc();
//		j5.arrPrint();
		arr[4] = j5;
		
//		for(int i = 0; i < arr.length; i++) {
//			arr[i].totAveCalc();
//			arr[i].gradeCalc();
//			arr[i].arrPrint();
//		}
		
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t학점\t석차");
		System.out.println("=====================================================================");
		
		for(Java06_ObjectArray a : arr) {
			a.totAveCalc();
			a.gradeCalc();
		}
		//totAveCalc(), gradeCalc(), arrPrint() 메서드가
		//객체를 생성할 때 마다 반복해서 만들어진다. 이것을 해결하는 것을
		//Bank 설계도를 만들어서 처리해 보도록 한다
		
		Java06_ObjectArray.rankProcess(arr);
		
		for(Java06_ObjectArray a : arr) {
			a.arrPrint();
		}
	}

}
