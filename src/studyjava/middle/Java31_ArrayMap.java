package studyjava.middle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Java31_ArrayMap {

	public static void main(String[] args) {
		// Map 안에 List 저장하는 방법
		
		List<Student> list = new ArrayList<Student>();
		Map<String, Object> map = new HashMap<String, Object>();
		//Object는 모든 클래스의 조상이다
		//어땐 객체이든 참조할 수 있다
		
		Student stu1 = new Student();
		stu1.setIdx(1);
		stu1.setName("aaa");
		stu1.setScore(100);
		stu1.setRank(1);
		
		Student stu2 = new Student();
		stu2.setIdx(2);
		stu2.setName("bbb");
		stu2.setScore(80);
		stu2.setRank(1);
		
		Student stu3 = new Student();
		stu3.setIdx(3);
		stu3.setName("ccc");
		stu3.setScore(70);
		stu3.setRank(1);
		
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		
		map.put("maplist", list); //map 에 추가
		@SuppressWarnings("unchecked")
		List<Student> slist = (ArrayList<Student>) map.get("maplist");
		//get("maplist") 키를 호출하면 list 값을 가져오게 된다
		//(ArrayList<Student>) 형 변환하여 출력문을 작성하면 된다
		for(Student s : slist) {
			for(Student ss : slist) {
				if(s.getScore() < ss.getScore()) {
					s.setRank(s.getRank()+ 1);
				}
			}
		}
		
		for(Student s : slist) {
			System.out.println(s.getIdx() + " " + s.getName() + " " + s.getScore() + 
					s.getScore() + " " + s.getRank());
		}
		
		
	}

}
