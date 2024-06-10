package day03;

import java.util.Scanner;

public class NestedIfEx02 {

	public static void main(String[] args) {

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
			if(num[1] != 0) {
				double result = (double) num[0] / num[1];
				System.out.println(num[0] + " " + ch + " " + num[1] + " = " + result);
				}
			else {
				System.out.println("0으로 나눌 수 없습니다");
			}
		}
		else if(ch == '%') {
			if(num[1] != 0) { 
				int result = num[0] % num[1];
			System.out.println(num[0] + " " + ch + " " + num[1] + " = " + result);
			}
			else {
				System.out.println("0으로 나눌 수 없습니다");
			}
		}
		else {
			System.out.println("산술자가 아닙니다");
		}


	}

}