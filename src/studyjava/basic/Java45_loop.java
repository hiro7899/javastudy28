package studyjava.basic;

public class Java45_loop {

	public static void main(String[] args) {
		//	  *
		//	 ***
		//	*****
		// *******
		//*********
		
		for(int x = 1; x <= 5; x++) {
			for(int y = 1; y <= 5 - x  ;y++) {
				System.out.print(" ");
			}
			for(int z = 1; z <= x * 2 - 1; z++) {
			    System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
