package studyjava.middle;

import java.util.HashMap;
import java.util.Set;

public class Java28_HashMap {

	public static void main(String[] args) {
		// HashMap<String, String> : 이름 -> 전화번호
		HashMap<String, String> phone = new HashMap<String, String>();
		
		//HashMap -> put() 추가
		phone.put("홍길동", "010-1111-1111");
		phone.put("김길동", "010-2222-2222");
		phone.put("최길동", "010-3333-3333");
		phone.put("박길동", "010-4444-4444");
		
		//key 값은 오직 유일해야 한다
		
		//연락처 수 확인 - size()
		System.out.println("총 연락처 : " + phone.size());
		
		//특정 번호 조회 - get() : get() 메서드 안에 key 값을 적어준다
		//key값을 호출하면 value 값을 가져온다
		System.out.println("홍길동 번호 : " + phone.get("홍길동"));
		
		//연란처 존재 확인 - containsKey()
		System.out.println("최길동 존재 여부 : " + phone.containsKey("최길동"));
		
		//기존 번호 수정 - put()
		phone.put("홍길동", "010-7777-7777");	
		System.out.println("홍길동 변경후: " + phone.get("홍길동"));
		
		//전체 이름 목록 - keySet()
		System.out.println("===========전화번호부===========");
		Set<String> names = phone.keySet();
		//keySet() 메서드는 key 값의 목록을 가져온다
		//key값은 String 타입 이므로 Set<String> 데이터 타입으로 받는다
		//Set 인터페이스 역할은 중복되지 않는 데이터를 저장한다
		//Set은 중복 데이터 제거, 유일한 값 관리할 때 사용한다
		for(String name : names) {
			System.out.println(name + ", " + phone.get(name));
			//get(ket값)을 호출하면 value 값을 가져온다
		}
		
		//연락처 삭제 - remove()
		phone.remove("홍길동");
		System.out.println("=======삭제 후 출력=============");
		for(String name : names) {
			System.out.println(name + ", " + phone.get(name));
		}
		
		//없는 키 조회시 기본 값 반환 - getOrDefault()
		String num = phone.getOrDefault("이순신", "번호없음!");
		System.out.println("없는 사람 번호 : " + num);
		
		//특정번호 존재 여부 - containValue()
		boolean hasNum = phone.containsValue("010-2222-2222");
		System.out.println("010-2222-2222 존재 여부 : " + hasNum);
		
		//키와 값을 동시 순회 - entrySet()
		System.out.println("\n ====전체 연락처");
		for(var entry : phone.entrySet()) {
			//entrySet() 키와 값의 객체 집합
			//키와 값을 저장하는 변수 선언은 var 로 한다
			System.out.println(entry.getKey() + ", " + entry.getValue());
		}
		
		
		
		
		
	}

}
