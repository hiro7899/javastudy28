package studyjava;

import java.util.Arrays;
// java.util 패키지 안에 있는 모든 클래스는 객체생성 없이 사용이 가능한 클래스이다

public class Java48_array {

	public static void main(String[] args) {
		// 정수형 배열에 n개의 데이터를 저장하시오
		
		int[] score = {89, 45, 78, 99, 100};
		
		//for문을 사용 안하고 배열의 값을 간단히 문자로 변환하여 출력하시오
		System.out.println("Array.toString() : " + Arrays.toString(score));

		//확장형 for문
		//for문으로 출력문을 작성하면 초기값, 조건식, 증가치 필요
		//이럴때 확장 for문을 쓰면 편리하다
		
		for(int a : score) {
			//자동으로 score[0] 번쨰 값을 가져와서 a 변수에 저장한다. 그 다음 자동으로 반복한다
			//a 변수명은 내 마음대로, 단. 데이터 타입은 반드시 배열 데이터형과 같아야 한다
			System.out.println("확장형 for : " + a);
		}
		
		//배열에 저장된 합계를 구해보자
		int sum = 0;
		for(int a : score) {
			sum += a;
		}
		double avg = (double)sum / score.length;
		System.out.println("배열의 합계 : " + sum);
		System.out.println("배열의 평균 : " + avg);
		
		//가장 큰 값, 가장 작은 값
		int max = score[0]; //Integer.MIN_VALUE;
		int min = score[0]; //Integer.MAX_VALUE;
		
		for(int b : score) {
			if(max < b) {
				max = b;
			}
			if(min > b){
				min = b;
			}
		}
		System.out.println("max : " + max);
		System.out.println("min : " + min);
		
		//위 배열애 저장된 값 중에서 평균에 가장 가까운 점수를 찾으시오
		int closeSet = score[0]; //가장 가까운 값을 저장하는 변수
		double minDiff = Math.abs(score[0] - avg); //첫번째 거리값 저장하는 변수
		for(int c : score) {
			//평균과의 차이 계산
			double diff = Math.abs(c - avg);
			//지금까지 차이보다 더 작으면 그 값을 저장
			if(diff < minDiff) {
				minDiff = diff; //가장 작은 거리값 저장
				closeSet = c; //가장 작은 배열값 저장
			}
		}
		System.out.println("평균에 가장 가까운 값 : " + closeSet);
		
		
		
	}

}
