package quiz;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// {30, 355, 24, 12, 98, 72, 5, 76, 60, 35, 54, 62, 2, 12, 35｝
		//の数値配列を昇順にソートするプログラムを作りなさい。
		//ソート方法は挿入ソートを使いなさい。
		
		int[] arr = {30, 355, 24, 12, 98, 72, 5, 76, 60, 35, 54, 62, 2, 12, 35};
		
		
		for(int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			int j = i - 1;
			
			while(j <= 0 && temp > arr[j]) {
				arr[j + 1] = arr[j];
				j++;
			}
		}
		
		
	}

}
