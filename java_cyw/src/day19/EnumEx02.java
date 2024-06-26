package day19;

import java.util.Scanner;

public class EnumEx02 {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("계절을 입력하세요 : ");
		System.out.print("봄 : SPRING, 여름 : SUMMER, 가을 : FALL, 겨울 : WINTER");
		
		int num = scan.nextInt();
		Season2 s = Season2.fromValue(num);
		
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


enum Season2 {
	
	SPRING(1),
	SUMMER(2),
	FALL(3),
	WINTER(4);
	
	private final int value; // 1,2,3,4로 했기 때문에 정수인 int
	
	private Season2(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	// 정수를 이용해 열거형 객체를 선택하는 클래스(정적) 메소드
	

	public static Season2 fromValue(int value) {
		for(Season2 tmp : Season2.values()) {
			if(tmp.getValue() == value) {
				return tmp;
			}
		}
		
		throw new IllegalArgumentException("잘못된 계절입니다");
	}
	
}


