package day04;

import java.util.Scanner;

public class BreakEx01 {

	public static void main(String[] args) {

		//y를 입력하면 중지하는 코드를 작성하시오

		char ch;

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		while(true) {
			System.out.println("문자를 입력하세요 : ");
			ch = scan.next().charAt(0);
			if(ch == 'y') {
				break;
			}
		}

	}

}