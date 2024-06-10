package day03;

import java.util.Scanner;

public class SwitchEx02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("월 입력 : ");

		int input = scan.nextInt();

		if(input < 1 || input > 12) {
			System.out.println("잘못된 월입니다");
			return;
		}

		switch((input + 3) / 3) {

		case 4 :
			System.out.println("봄");
			break;
		case 5 :
			System.out.println("여름");
			break;
		case 6 :
			System.out.println("가을");
			break;
		default :
			System.out.println("겨울");
		}







		Scanner year = new Scanner(System.in);

		System.out.print("월 입력 : ");

		int mon = year.nextInt();

		switch(mon = year.nextInt()) {
			case 3,4,5 :
				System.out.println("봄");
				break;
			case 6,7,8 :
				System.out.println("봄");
				break;
			case 9,10,11 :
				System.out.println("봄");
				break;
			case 12,1,2 :
				System.out.println("봄");
				break;
			default :
			System.out.println("잘못된 월입니다");
		}

	}

}