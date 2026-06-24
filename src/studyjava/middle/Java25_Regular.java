package studyjava.middle;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Java25_Regular {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// 정규 표현식
		// 정규식이란 텍스트 데이터중에서 원하는 조건과 일치하는 문자열을 찾아 내기위해 사용하는것
		
		// ^ : 시작
		// [a-z] : 첫글자가 영문 소문자
		// [a-z0-9] : 첫글자가 영문 소문자 또는 숫자
		// {4,11} : 앞글자를 제외 4-11
		// $ : 끝
		
		
		String[] data = {"bat", "baby", "bonus", "cA", "co", "c", "c0", "car", "combat", "coount", "date", "disc"};
	
		Pattern p = Pattern.compile("c[a-z]*"); //c로 시작하는 소문자 영단어

		for(int i = 0; i < data.length; i++) {
			Matcher m = p.matcher(data[i]); //배열에 저장된 문자열을 가져와서 Pattern에 맞는지 검사
			if(m.matches()) { //Pattern 규칙에 맞으면
				System.out.println(data[i] + ", ");
			}
		}
		
		String regex = "^[a-z][a-z0-9_]{4,11}$";
		String regex1 = "^[a-z][a-z0-9_]{4,11}$";
		//.{2} 앞의 아무 문자 2개
		//[a-z0-9] 3번째 글자는 영문 또는 숫자
		// .* 뒤는 아무거나
		String id = "java1234";
		if(id.matches(regex)) {
			System.out.println("사용가능한 아이디");
		}else {
			System.out.println("아이디 형식 오류");
		}
		
	}
	
}
