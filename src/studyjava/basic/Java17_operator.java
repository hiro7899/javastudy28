package studyjava.basic;

public class Java17_operator {
	public static void main(String[] args) {
		//비트 연산자(~(not), &(and), |(or), ^(xor), <<(왼쪽이동), >>(오른쪽이동)
		//피연산자를 비트(bit)단위로 논리연산 또는 이동연산을 하는 것
		//10진수 : 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16...
		//8진수 : 0 1 2 3 4 5 6 7 10 11 12 13 14 15 16 17 20...
		//16진수: 0 1 2 3 4 5 6 7 8 9 A B C D E F 10 11 12 13...
		//2진수: 숫자 1개를 4bit로 표현한다(8 4 2 1) -> 더해지는 숫자는 1로, 아니면 0
		
		System.out.println("7 & 5: " + (7&5)); //5
		System.out.println("7 | 5: " + (7|5)); //7
		System.out.println("7 ^ 5: " + (7^5)); //2
		System.out.println("2 << 3: " + (2<<3)); //16
		System.out.println("16 >> 2: " + (16>>2)); //4
		
		//10진수를 2진수로 변환 Integer.toBinaryString()
		
		int a=13, b= 8;
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
		int s = a & b;
		System.out.println(Integer.toBinaryString(s));
	}
}
