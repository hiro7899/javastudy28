package studyjava;

public class Java46_loop {

	public static void main(String[] args) {
		//*********
		// *******
		//  *****
		//   ***
		//    *
		
		for(int x = 1; x <= 5; x++) {
			for(int y = 1; y <= x  ;y++) {
				System.out.print(" ");
			}
			for(int z = 1; z <= (6 - x) * 2 - 1; z++) {
			    System.out.print("*");
			}
			System.out.println();
		}
		
		for(int x = 5; x >= 1; x--) {
			for(int y = 1; y <= 6 - x  ;y++) {
				System.out.print(" ");
			}
			for(int z = 1; z <= (2 * x - 1); z++) {
			    System.out.print("*");
			}
			System.out.println();
		}
	}

}
