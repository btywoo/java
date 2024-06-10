package day03;

import java.util.Scanner;

public class SwitchEx03 {

	public static void main(String[] args) {

		int[] num = new int[2];
		Scanner scan = new Scanner(System.in);

		System.out.println("두 정수와 산술 입력자를 입력하시오. \n ex) 1 + 2 [엔터]");
		num[0] = scan.nextInt();
		char ch = scan.next().charAt(0);
		num[1] = scan.nextInt();

		switch(ch) {

		case '+':
			int result1 = num[0] + num[1];
			System.out.println(num[0] + " " + ch + " " + num[1] + " = " + result1);
			break;
		case '-':
			int result2 = num[0] - num[1];
			System.out.println(num[0] + " " + ch + " " + num[1] + " = " + result2);
			break;
		case '*':
			int result3 = num[0] * num[1];
			System.out.println(num[0] + " " + ch + " " + num[1] + " = " + result3);
			break;
		case '/':
			double result4 = (double) num[0] / num[1];
			if(num[1] == 0) {
				System.out.println("0으로 나눌 수 없습니다");
				}
			else {
			System.out.println(num[0] + " " + ch + " " + num[1] + " = " + result4);
			}
			break;
		case '%' :
			int result5 = num[0] % num[1];
			if(num[1] == 0) {
				System.out.println("0으로 나눌 수 없습니다");
				}
			else {
			System.out.println(num[0] + " " + ch + " " + num[1] + " = " + result5);
			}
			break;
		default :
			System.out.println("잘못된 연산자입니다");

		}
	}
}