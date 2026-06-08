package quiz.jsl;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		DecimalToBinary toBinary = new DecimalToBinary();
		Scanner scanner = new Scanner(System.in);
		System.out.print("10진수 입력: ");
		int dec = scanner.nextInt();
		
		toBinary.ProcessBinary(dec);
		scanner.close();
	}

}
