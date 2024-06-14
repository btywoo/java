package day13;

import java.util.Calendar;

public class CalendarEx01 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		System.out.println(cal);
		
		int year = cal.get(Calendar.YEAR); 			// 연도 추출
		int month = cal.get(Calendar.MONTH);	 	// 월 추출. 0~11
		int day = cal.get(Calendar.DAY_OF_MONTH);	// 일 추출
		
		System.out.println(year + "-" + (month+1) + "-" + day);
		

	}

}
