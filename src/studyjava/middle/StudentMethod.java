package studyjava.middle;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StudentMethod {

	Scanner scanner = new Scanner(System.in);
	
	public void insert(List<Map<String, Object>> list) {
		
		System.out.print("학번 입력: ");
		int idx = scanner.nextInt();
		
		System.out.print("이름 입력: ");
		String name = scanner.next();
		
		System.out.print("점수 입력: ");
		int score = scanner.nextInt();
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("idx", idx);
		map.put("name", name);
		map.put("score", score);
		map.put("rank", 1);
		list.add(map);
	}
	
	public void printMap(List<Map<String, Object>> list) {
		System.out.println("======list 안에 Map 데이터 출력 ======");
		for(int i = 0; i < list.size(); i++) {
			Map<String, Object> m = list.get(i);
			//list.get(i); map 객체 불러온다
			System.out.print(m.get("idx") + " ");
			//m.get("idx) map 안에 키("idx") 값을 호출해서 value 를 불러온다
			System.out.print(m.get("name") + " ");
			System.out.print(m.get("score") + " ");
			System.out.println(m.get("rank") + " ");
		}
	}
	
	public void printMapWithRank(List<Map<String, Object>> list) {
		System.out.println("======list 안에 Map 데이터 출력 등수 까지 출력======");
		for(Map<String, Object> m : list) {
			m.put("rank", 1);
			for(Map<String, Object> mm : list) {
				if((int)m.get("score") < (int)mm.get("score")) {
					//컬렉션프레임워크는 모든 데이터를 객체 형탠로 저장
					//숫자 객체 Integer -> int 다운 캐스팅 해야 관계 연산을 할 수 있기 때문에 (int) 변환
					m.put("rank", (int)m.get("rank") + 1);
				}
			}
			System.out.print(m.get("idx") + " ");
			System.out.print(m.get("name") + " ");
			System.out.print(m.get("score") + " ");
			System.out.println(m.get("rank") + " ");
		}
	}
	
	public void printLambda(List<Map<String, Object>> list) {
		System.out.println("======list 안에 Map 데이터 출력 :: 람다식 ======");
		list.forEach(m -> {
			m.put("rank", 1);
			list.forEach(mm -> {
				int s1 = (int)m.get("score");
				int s2 = (int)mm.get("score");
				
				if(s1 < s2) {
					m.put("rank", (int)m.get("rank") + 1);
				}
			}); // { }
			System.out.print(m.get("idx") + " ");
			System.out.print(m.get("name") + " ");
			System.out.print(m.get("score") + " ");
			System.out.println(m.get("rank") + " ");
		}); // { }
	}
	
}
