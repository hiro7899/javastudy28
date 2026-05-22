package studyjava;

public class Java42_loop {

	public static void main(String[] args) {
		// *
		// **
		// ***
		// ****
		// *****
		
		// i = 1, j = 1
		// i = 2, j = 1, 2
		// i = 3, j = 1, 2, 3
		// i = 4, j = 1, 2, 3, 4
		// i = 5, j = 1, 2, 3, 4, 5

		for(int i=1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
