package day19;

import java.util.Scanner;

public class EnumEx01 {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("계절을 입력하세요 : ");
		System.out.print("봄 : SPRING, 여름 : SUMMER, 가을 : FALL, 겨울 : WINTER");
		
		String season = scan.next();
		Season s = Season.valueOf(season);
		
		switch(s) {
		
		case SPRING :
			System.out.println("봄입니다");
			break;
			
		case SUMMER :
			System.out.println("여름입니다");
			break;
		
		case FALL :
			System.out.println("가을입니다");
			break;
		case WINTER :
			System.out.println("겨울입니다");
			break;
		
		}
		
		System.out.println("계절을 입력하세요 : ");
		System.out.print("봄 : 1, 여름 : 2, 가을 : 3, 겨울 : 4");
		
		int num = scan.nextInt();
		s = null;
		for(Season tmp : Season.values()) {
			if(num == tmp.ordinal() + 1) {
				s = tmp;
			}
		}
		
		// 열거형.values() : 열거형 객체 안에 있는 모든 상수들을 배열로 변환
		// 열거형.ordinal() : 열거형 객체의 순서로 0부터 시작
		
		switch(s) {
		
		case SPRING :
			System.out.println("봄입니다");
			break;
			
		case SUMMER :
			System.out.println("여름입니다");
			break;
		
		case FALL :
			System.out.println("가을입니다");
			break;
		case WINTER :
			System.out.println("겨울입니다");
			break;
		
		}
		

	}

}

enum Season {
	
	SPRING,
	SUMMER,
	FALL,
	WINTER
	
}


