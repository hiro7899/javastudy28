package quiz;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
//		｛5, 10, 7, 8, 3, 1, 9, 2｝の数値配列を昇順にソートするプログラムを作りなさい。
//		ソート方法はクイックソートを使いなさい。
		int[] arr = {5, 10, 7, 8, 3, 1, 9, 2};
		//피벗을 정한 뒤 앞에서 부터 낮은 숫자 뒤에서 부터 높은 숫자를 찾음
		
		for(int i = 0; i < arr.length; i++) {
			int pivot = i;
			
			for(int j = pivot; j < arr.length; j++) {
				if(arr[pivot] > arr[j]) {
					int temp = arr[pivot];
					arr[pivot] = arr[j];
					arr[j] = temp;
					
					break;
				}
			}
			
			for(int j = arr.length -1; j > pivot; j--) {
				if(arr[pivot] < arr[j]) {
					int temp = arr[pivot];
					arr[pivot] = arr[j];
					arr[j] = temp;
					
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
