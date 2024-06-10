package day03;

import java.util.Scanner;

public class IfExam03 {
	
	public static void main(String[] args) {
		
		// 산술 연산자와 두 정수를 입력 받아 산술 연산자에 맞는
		// 연산 결과를 출력하는 코드를 작성하시오
		
		// ex) 두 정수와 산술 입력자를 입력하시오
		// ex) (예: 1 + 2) : 1 + 2 [엔터]
		// > 1 + 2 = 3
		
		int[] num = new int[2];
		Scanner scan = new Scanner(System.in);
		
		System.out.println("두 정수와 산술 입력자를 입력하시오. \n ex) 1 + 2 [엔터]");
		num[0] = scan.nextInt();
		char ch = scan.next().charAt(0);
		num[1] = scan.nextInt();

		if(ch == '+') {
			int result = num[0] + num[1];
			System.out.println(num[0] + " " + ch + " " + num[1] + " = " + result);
		}
		else if(ch == '-') {
			int result = num[0] - num[1];
			System.out.println(num[0] + " " + ch + " " + num[1] + " = " + result);
		}
		else if(ch == '*') {
			int result = num[0] * num[1];
			System.out.println(num[0] + " " + ch + " " + num[1] + " = " + result);
		}
		else if(ch == '/') {
			double result = (double) num[0] / num[1];
			System.out.println(num[0] + " " + ch + " " + num[1] + " = " + result);
		}
		else if(ch == '%') {
			int result = num[0] % num[1];
			System.out.println(num[0] + " " + ch + " " + num[1] + " = " + result);
		}
		else {
			System.out.println("잘못된 연산자입니다");
		}

	}

}