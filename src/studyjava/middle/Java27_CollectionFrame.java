package studyjava.middle;

import java.util.ArrayList;
import java.util.Collections;

public class Java27_CollectionFrame {

	public static void main(String[] args) {
		// 컬렉션 프레임워크(Collections Framework)
		// 다수의 객체를 다루기 위한 표준화된 프로그램 방식
		// 컬렉션이란 여러 데이터를 편리하게 저장/ 관리하는 자료구조 모음이다
		// 객체배열의 단점(크기조정, 기능부족)을 해결한 동적 자료구조이다
		
		// 배열 : 크기고정, 추가/삭제 불편
		// 컬렉션 : 크기 자동조절, 추가/삭제/ 검색 편리하다

		// 컬렉션 프레임워크의 핵심 인터페이스
		// list : 순서가 있는 데이터. 데이터 중복 허용한다
		// 예) 대기자 명단
		// 구현클래스 : ArrayList, LinkedList, Stack, Vector 등
		
		// Set : 순서가 없는 데이터. 데이터 중복 허용하지 않는다
		// 예) 양의 정수 집합, 소수의 집합
		// 구현 클래스: HashSet, TreeSet
		
		// Map : 키와 값(Key, Value) 의 쌍으로 이루어진 데이터 집합
		// 순서가 없다. 키는 유일하다. 값은 중복 허용한다.
		// 예) 우편번호, 지역번호
		// 구현 클래스 : HashMap, TreeMap, HashTable, Properties 등
		
		// 컬렉션과 제네릭
		// 컬렉션은 제네릭 기법으로 구현된다
		// 컬렉션의 요소는 객체만 가능하다
		
		ArrayList<String> students = new ArrayList<String>();
		
		students.add("홍길동");
		students.add("김길동");
		students.add("최길동");
		
		//size()
		System.out.println("총 학생수 : " + students.size()); //크기 출력
		//get() - 학생조회
		System.out.println("1번 학생 : " + students.get(0)); //0번 인덱스 조회
		//contains() - 학생 존재여부 확인
		System.out.println("홍길동 포함 : " + students.contains("홍길동"));
		//전체 학생 출력
		for(String name : students) {
			System.out.println("-" + name);
		}
		
		//특정 위치에 삽입 -add(index, value)
		students.add(2, "강감찬");
		System.out.println("강감찬 삽입 후 : " + students);
		
		//set() - 학생이름 변경
		students.set(0, "홍길순");
		System.out.println("0번 변경 후 : " + students);
		
		//remove() - 삭제
		students.remove("홍길순");
		students.remove(0);
		System.out.println("삭제 후 : " + students);
		
		//Collections.sort() - 정렬
		Collections.sort(students); //오름차순 정렬
		System.out.println("정렬 후 : " + students);
		
		//Collections.reverse(); - 역순 정렬
		Collections.reverse(students);
		System.out.println("역순 후 : " + students);
		
		//indexOf() - 특정위치 학생 찾기
		int idx = students.indexOf("강감찬");
		System.out.println("강감찬 위치 : " + idx);
		
		//clear - 전체삭제
		students.clear();
		System.out.println("삭제 후 비어있나 : " + students.isEmpty());
		
		//상품 클래스 Item 을 만들어 실전 연습 해보자
		
	}

}
