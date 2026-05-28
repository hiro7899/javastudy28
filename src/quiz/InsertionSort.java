package quiz;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// {30, 355, 24, 12, 98, 72, 5, 76, 60, 35, 54, 62, 2, 12, 35｝
		//の数値配列を昇順にソートするプログラムを作りなさい。
		//ソート方法は挿入ソートを使いなさい。
		
		int[] arr = {30, 355, 24, 12, 98, 72, 5, 76, 60, 35, 54, 62, 2, 12, 35};
		
		
		for(int i = 1; i < arr.length; i++) {
			for(int j = i; j > 0; j--) {
				if(arr[j] < arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}else {
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		
	}

}
