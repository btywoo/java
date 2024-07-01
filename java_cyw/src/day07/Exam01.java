package day07;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {

		// 다음 메뉴를 출력하고 메뉴를 선택하면 안내 문구를 출력하는 코드를 작성하시오

		/*
		
		메뉴
		1. 추가
		2. 검색
		3. 종료
		메뉴 선택 : 1
		-----------
		추가했습니다.
		-----------
		메뉴
		1. 추가
		2. 검색
		3. 종료
		메뉴 선택 : 1
		-----------
		검색했습니다.
		-----------
		메뉴
		1. 추가
		2. 검색
		3. 종료
		메뉴 선택 : 0
		-----------
		잘못된 메뉴입니다
		-----------
		메뉴
		1. 추가
		2. 검색
		3. 종료
		메뉴 선택 : 3
		-----------
		프로그램을 종료합니다
		-----------
		
		*/

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		int menu;

		do {
			System.out.println("메뉴");
			System.out.println("1. 추가");
			System.out.println("2. 검색");
			System.out.println("3. 종료");
			System.out.print("메뉴 선택 : ");
			menu = scan.nextInt();

			if(menu < 1 || menu > 3) {
				System.out.println("---------------------");
				System.out.println("잘못된 메뉴입니다");
				System.out.println("---------------------");
				}

			switch(menu) {
			case 1 :
				System.out.println("---------------------");
				System.out.println("추가했습니다.");
				System.out.println("---------------------");
				break;

			case 2 :
				System.out.println("---------------------");
				System.out.println("검색했습니다.");
				System.out.println("---------------------");
				break;

			case 3 :
				System.out.println("---------------------");
				System.out.println("프로그램을 종료합니다");
				System.out.println("---------------------");
				break;
			}
		}
		while(menu != 3);

	}

}