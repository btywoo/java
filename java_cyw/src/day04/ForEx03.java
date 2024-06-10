package day04;

import java.util.Scanner;

public class ForEx03 {

	public static void main(String[] args) {

		// 문자를 입력 받고, 입력 받은 문자가 y면 종료하는 코드를 작성하시오 (For문 사용)

		Scanner scan = new Scanner(System.in);

		char ch;

		for(ch = 'n'; ch != 'y'; ch = scan.next().charAt(0)) {
			System.out.println("문자를 입력하세요 : ");
		}

	}

}