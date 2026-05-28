package studyjava;

import java.util.Arrays;

public class Java51_sort {

	public static void main(String[] args) {
		// 정렬 : 
		// 오름차순(작은 값 -> 큰 값 순으로 출력) : Ascending
		// 내림차순(큰 값 -> 작은 값 순으로 출력) : Descending
		
		int[] data = {7, 5, 1, 9};
		
		//쉽게 정렬하는 방법 1 
//		Arrays.sort(data);
//		System.out.println(Arrays.toString(data));
		
		//선택정렬 알고리즘
		for(int i = 0; i < data.length; i++) {
			for(int j = i + 1; j < data.length; j++) {
				if(data[i] > data[j]) {
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(data));
		
//		for(int i = 0; i < data.length - 1; i++) {
//			int minIdx = i;
//			
//			for(int j = i + 1; j < data.length; j++) {
//				if(data[minIdx] > data[j]) {
//					minIdx = j;
//				}
//			}
//			
//			int temp = data[minIdx];
//			data[minIdx] = data[i];
//			data[i] = temp;
//		}
//		System.out.println(Arrays.toString(data));
		

	}

}
