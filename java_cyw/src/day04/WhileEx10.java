package day04;

import java.util.Scanner;

public class WhileEx10 {

	public static void main(String[] args) {

		// 반복문을 이용하여 문자를 입력 받고 입력 받은 문자가 y면 반복문을 종료하는 코드를 작성하시오

		/*
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("문자를 입력하세요 : ");
		
		char ch = scan.next().charAt(0);
		
		while(ch <= 'y') {
			System.out.print(ch++ + " ");
		}
		
		*/

		char ch = 'n';

		Scanner scan = new Scanner(System.in);

		while(ch != 'y') {
			System.out.println("문자를 입력하세요 : ");
			ch = scan.next().charAt(0);
		}


	}

}