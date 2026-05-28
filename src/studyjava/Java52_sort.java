package studyjava;

import java.util.Arrays;

public class Java52_sort {

	public static void main(String[] args) {
		// 버블정렬
		// 왼쪽과 오른쪽 값을 비교하여 위치를 바꾸어 나가는 방식
		
		int[] a = {5, 1, 3, 8, 2, 7, 6};
		int tmp; //교환하는 값을 임시 저장하는 변수
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length - i - 1; j++) {
				if(a[j] > a[j+1]) {
					tmp = a[j];
					a[j] = a[j+1];
					a[j+1] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		

	}

}
