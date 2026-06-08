package quiz.jsl;

public class Exclude {

	public void arrayData(int[] scores) {
		int max = scores[0];
		int min = scores[0];

		int total = scores[0];

		System.out.print("Data : ");
		for (int score : scores) {
			if (max <= score) {
				max = score;
			}else if (min >= score) {
				min = score;
			}

			total += score;
			System.out.print(score + " ");
		}
		System.out.println();

		System.out.println("최대: " + max);
		System.out.println("최소: " + min);
		System.out.println("최대: " + (total - max - min));
	}

}
