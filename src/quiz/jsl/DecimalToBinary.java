package quiz.jsl;

public class DecimalToBinary {
	
	
	public void ProcessBinary(int val) {
		int dec = 0;
		String bin = "";
		System.out.println("10진수 입력 : " + val);
		System.out.print("2진수 : ");
		
		if (val == 0) {
            System.out.println("0");
            return;
        }
		
		while(val > 0) {
			dec = val % 2;
			
			bin = dec + bin;
 			
			val /= 2;
		}
		
		System.out.println(bin);
		
	}
	
}
