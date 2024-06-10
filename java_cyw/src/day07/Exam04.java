package day07;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {

		// Exam 01 ~ 03 기능을 합해서 다음 기능을 구현하세요

		/*
		메뉴
		1. 추가
		2. 검색
		3. 종료
		메뉴 선택 : 1
		-----------
		단어 입력 ( 종료 : -1 ) : abc
		단어를 추가했습니다. /  단어를 추가하지 못했습니다.
		단어 입력 ( 종료 : -1 ) : -1
		메뉴로 돌아갑니다.
		-----------
		메뉴
		1. 추가
		2. 검색
		3. 종료
		메뉴 선택 : 2
		-----------
		단어 입력 ( 종료 : -1 ) : abc
		있는 단어입니다. / 없는 단어입니다.
		단어 입력 ( 종료 : -1 ) : -1
		메뉴로 돌아갑니다.
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



		Scanner scan = new Scanner(System.in);

		String[] list = new String[2];
		String tmp, word;


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

				int i = 0;

				while(true){
					System.out.println("단어입력 (종료:-1) : ");
					tmp = scan.next();

					if(tmp.equals("-1")) {
						System.out.println("메뉴로 돌아갑니다");
						break;
					}

					if(i == list.length) {
						System.out.println("단어를 추가하지 못했습니다");
					}
					else {
						list[i++] = tmp;
						System.out.println("단어를 추가했습니다");
					}
				}
				System.out.println("---------------------");

				break;

			case 2 :
				System.out.println("---------------------");

				while(true){
					System.out.println("단어입력 (종료:-1) : ");

					word = scan.next();

					if(word.equals("-1")) {
						System.out.println("메뉴로 돌아갑니다");
						break;
					}

					boolean result = false;

					for(String arr: list) {
						if(word.equals(arr)) {
							result = true;
						}
					}

					if(result) {
						System.out.println("있는 단어입니다");
					}
					else {
						System.out.println("없는 단어입니다");
					}

				}
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