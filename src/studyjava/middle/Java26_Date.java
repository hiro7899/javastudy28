package studyjava.middle;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

class CalendarApi {
	public void prn(int year, int month) {
		Calendar cal = Calendar.getInstance();
		System.out.printf("\t\t%d년 %d월\n", year, month);
		System.out.printf("일\t월\t화\t수\t목\t금\t토\n");
		cal.set(year, month-1, 1); //0월 - 11월로 처리
		int start = cal.get(Calendar.DAY_OF_WEEK);
		//cal.gt(Calendar.DAY_OF_WEEK)는 현재 설정된 날짜의 요일 값을 숫자로 가져오는 것
		//1=일요일....7=토요일
		for(int i = 1; i < start; i++) {
			System.out.print("\t");
		}
		for(int i = 1; i <= cal.getActualMaximum(Calendar.DATE); i++) {
			System.out.printf("%d\t", i);
			if(start % 7 == 0) {
				System.out.println();
			}
			start++;
		}
		System.out.println();
	}
}

class LocalDateApi {
	public void prn(int year, int month) {
		
		System.out.printf("\t\t%d년 %d월\n", year, month);
		System.out.printf("일\t월\t화\t수\t목\t금\t토\n");
		
		LocalDate date = LocalDate.of(year, month, 1);
		int start = date.getDayOfWeek().getValue() + 1;
		//1=월요일....7=일요일
		for(int i = 1; i < start; i++) {
			System.out.print("\t");
		}
		int lastDay = date.lengthOfMonth();
		//해당 월 마지막 날짜
		for(int i = 1; i <= lastDay ; i++) {
			System.out.printf("%d\t", i);
			if(start % 7 == 0) {
				System.out.println();
			}
			start++;
		}
		System.out.println();
	}
}


public class Java26_Date {

	public static void main(String[] args) {
		// Date 클래스
		// 날짜를 표현하는 클래스
		// Date는 객체 간 날짜 정보를 주고 받을 때 매개 변수나 리턴 타입으로 주로 사용
		
		Date now = new Date();
		//원하는 날짜 형식의 문자열 얻으려면
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		String strNow = sdf.format(now);
		System.out.println(strNow);
		
		//Calender 클래스
		//추상 클래스 이므로 new 연산자 사용하여 인스턴스 생성 불가
		//getInstance() 메서드를 이용하여 현재 운영체제에 설정된 시간대 기준으로 한 calender 하위 객체를 얻을 수 있다
		
		Calendar cnow = Calendar.getInstance();
		int year = cnow.get(Calendar.YEAR);
		int month = cnow.get(Calendar.MONTH);
		int day = cnow.get(Calendar.DAY_OF_MONTH);
		int week = cnow.get(Calendar.DAY_OF_WEEK);
		
		String strWeek = null;
		switch (week) {
		case Calendar.MONDAY: {
			strWeek = "월";
			break;
		}
		case Calendar.TUESDAY: {
			strWeek = "화";
			break;
		}
		case Calendar.WEDNESDAY: {
			strWeek = "수";
			break;
		}
		case Calendar.THURSDAY: {
			strWeek = "목";
			break;
		}
		case Calendar.FRIDAY: {
			strWeek = "금";
			break;
		}
		case Calendar.SATURDAY: {
			strWeek = "토";
			break;
		}
		default:
			strWeek = "일";
		}
		int amPm = cnow.get(Calendar.AM_PM);
		String strAmPm = null;
		
		if(amPm == Calendar.AM) {
			strAmPm = "오전";
		}else {
			strAmPm = "오후";
		}
		
		int hour = cnow.get(Calendar.HOUR);
		int minute = cnow.get(Calendar.MINUTE);
		int second = cnow.get(Calendar.SECOND);
		
		System.out.print(year + "년 ");
		System.out.print(month + 1 + "월 ");
		System.out.print(day + "일 ");
		System.out.print(strWeek + "요일 ");
		System.out.print(strAmPm + " ");
		System.out.print(hour + "시 ");
		System.out.print(minute + "분 ");
		System.out.println(second + "초");
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("년도 입력 : ");
		int yyear = scanner.nextInt();
		System.out.print("월 입력: ");
		int mmonth = scanner.nextInt();
		
		CalendarApi api = new CalendarApi();
		LocalDateApi api2 = new LocalDateApi();
		api.prn(yyear, mmonth);
		System.out.println();
		api2.prn(yyear, mmonth);
		
		scanner.close();
	}

}
