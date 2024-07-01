package day04;

import java.util.Scanner;

public class DoWhileEx02 {

	public static void main(String[] args) {

		// 다음과 같이 메뉴를 출력하고 종료 메뉴를 선택하면 프로그램이 종료되는 코드를 작성하시오

		// 1. 프로그램 실행
		// 2. 프로그램 저장
		// 3. 프로그램 불러오기
		// 4. 프로그램 종료

		// 메뉴 선택 : 

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		int i;

		do {
			System.out.println("메뉴 \n1. 프로그램 실행 \n2. 프로그램 저장 \n3. 프로그램 불러오기 \n4. 프로그램 종료");
			System.out.println("메뉴 선택 : ");
			i = scan.nextInt();
			if(i != 4) {
				System.out.println();
			}
		}
		while(i != 4);

		System.out.println("프로그램을 종료합니다");



	}

}