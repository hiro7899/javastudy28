package studyjava.middle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Java32_MapArray {

	public static void main(String[] args) {
		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("idx", 1);
		map.put("name", "aaa");
		map.put("score", 90);
		map.put("rank", 1);
		list.add(map);
		
		Map<String, Object> map1 = new HashMap<String, Object>();
		map1.put("idx", 2);
		map1.put("name", "bbb");
		map1.put("score", 100);
		map1.put("rank", 1);
		list.add(map1);
		
		Map<String, Object> map2 = new HashMap<String, Object>();
		map2.put("idx", 3);
		map2.put("name", "ccc");
		map2.put("score", 80);
		map2.put("rank", 1);
		list.add(map2);
		
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
