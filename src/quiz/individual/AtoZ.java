package quiz.individual;

public class AtoZ {
	//A~ Z 까지 출력하는 반복문
	public static void main(String[] args) {
		char letter;
		boolean isA = false;
		for(int i = 0; i <= 100; i ++) {
			letter = (char)i;
			if(letter == 'A')
				isA = true;
			if(isA) {
				System.out.print(letter + " ");
			}
			if(letter=='Z') {
				break;
			}
		}
	}
	
	
}
