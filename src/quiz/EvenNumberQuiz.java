package quiz;

public class EvenNumberQuiz {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i];

            // 1. 숫자가 7 이상이면 반복문을 완전히 빠져나가는 코드 작성
            // 여기에 코드를 작성하세요.
            if(current >= 7) {
            	break;
            }

            // 2. 숫자가 3이면 아래 코드를 실행하지 않고 다음 반복으로 건너뛰는 코드 작성
            // 여기에 코드를 작성하세요.
            if(current == 3) {
            	continue;
            }

            // 3. 남은 숫자 중 '짝수'인 경우에만 sum에 더하는 코드 작성
            // 여기에 코드를 작성하세요.
            if(current % 2 == 0) {
            	sum += current;
            }
        }

        // 최종 결과 출력 (정답을 맞혀보세요!)
        System.out.println("조건을 만족하는 짝수의 합: " + sum);
    }
}
