package studyjava.basic;

import java.util.Arrays;

public class Java53_sort {

	public static void main(String[] args) {
		// 삽입정렬
		// 2번째부터(인덱스 번호는 0부터 시작) 비교를 하는데
		// 1번비교: 1번째 0번째 비교
		// 2번비교: 2번째 1번째 비교, 1번째 0번째 비교
		// 3번비교: 3번쩨 2번째 비교, 2번째 1번째 비교, 1번째 0번째 비교
		
		int[] a = {5, 10, 8, 2};
		int tmp;
		
		for(int i = 0; i < a.length; i++) {
			for(int j = i; j > 0; j--) {
				if(a[j] < a[j-1]) {
					tmp = a[j];
					a[j] = a[j-1];
					a[j-1] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
