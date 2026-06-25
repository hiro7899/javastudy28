package studyjava.middle;

import java.util.HashMap;

public class Java29_HashMap {

	public static void main(String[] args) {
		// 이름, 점수 -> 학생 성적표
		
		HashMap<String, Integer> scores = new HashMap<String, Integer>();
		
		scores.put("홍길동", 85);
		scores.put("김길동", 100);
		scores.put("춘향이", 45);
		scores.put("이도령", 95);
		scores.put("향단이", 78);
		
		for(var entry : scores.entrySet()) {
			//var entry 예전방식 -> Map.Entry<String, Integer> 타입
			int score = entry.getValue(); //자동 unboxing
			
			String grade = 
					score >= 90 ? "A" : 
					score >= 80 ? "B" : 
					score >= 70 ? "C" : 
					score >= 60 ? "D" : "F";
			
			System.out.println(entry.getKey() + ", " + entry.getValue() + ", " + grade);
		}
		
		// 전체총점
		int total = 0;
		for(int score : scores.values()) {
			total += score;
		}
		System.out.println("전체 총점 : " + total);
		
		//평균
		double avg = (double)total / scores.size();
		System.out.println("전체평균 : " + avg);
		
		//최고, 최저 점수찾기
		String topName = "";
		String lowName = "";
		int maxScore = 0;
		int minScore = 999;
		
		for(var entry : scores.entrySet()) {
			if(maxScore < entry.getValue()) {
				topName = entry.getKey();
				maxScore = entry.getValue();
			}
			if(minScore > entry.getValue()) {
				lowName = entry.getKey();
				minScore = entry.getValue();
			}
		}
		System.out.println("최고 학생 이름 : " + topName);
		System.out.println("최고점수 : " + maxScore);
		System.out.println("최저 학생 이름 : " + lowName);
		System.out.println("최저점수 : " + minScore);
		
		//수정
		scores.put("홍길동", 90);
		System.out.println("홍길동 수정 : " + scores.get("홍길동"));
		
		//80이상 우수 학생 목록
		System.out.println("=======우수학생 목록");
		for(var entry : scores.entrySet()) {
			if(entry.getValue() >= 80) {
				System.out.println(entry.getKey() + ", " + entry.getValue());
			}
		}
		
		//ArrayList을 이용한 CRUD 작업처리를 연습해 보자
	}

}
