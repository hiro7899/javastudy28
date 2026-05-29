package studyjava.basic;

public class Java13_String {

	public static void main(String[] args) {
		//String : 문자열을 다루는 참조(주소) 자료형
		
		String str1 = "java"; //만약 101번지에 java문자열이 저장되어 있으면 str1은 101번지를 참조한다
		String str2 = "java"; //"java"문자열이 101번지에 저장되어 있으니까 str2도 101번지를 참조한다
		
		System.out.println(str1==str2);
		//그러므로 str1과 str2 번지가 같냐 라고 물어보는 것이지
		//그래서 주소가 같으니깐 true 출력된다
		//"java"문자열이 같냐고 물어 보는 것이 아니다.
		
		//String 데이터 타입은 원래 객체 생성해야 사용해야한다
		String str3 = new String("java"); 
		System.out.println(str1 == str3); 
		//새로운 객체 생성이 됐기 때문에 주소가 다르다.
		
		//문자열이 같은지, 다른지를 비교할떄
		System.out.println(str1.equals(str3));
		System.out.println(str2.equals(str3));
		
		//불변성
		str1 = str1 + "Programming";
		//기존 "java"가 바뀌는게 아니라 "javaPrograming"이라는 새 객체가 생성된다.
		System.out.println(str1);
		
		//메서드 몇개 알아보자
		
		System.out.println(str1.equals(str3));
		System.out.println("str1 : " +str1);
		System.out.println("문자열 길이 : " +str1.length()); //문자열의 길이
		System.out.println("문자발췌 : " + str1.substring(0, 4)); //0번째부터 4번 "앞"까지
		System.out.println("문자가 위치한 인덱스 번호 : " + str1.indexOf("P"));
		System.out.println("javaProgramming에서 글자 1개 발췌 : " + str1.charAt(2));
		
	}

}
