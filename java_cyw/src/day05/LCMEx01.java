package day05;

import java.util.Scanner;

public class LCMEx01 {

	public static void main(String[] args) {

		// 두 정수의 최소 공배수를 구하는 코드를 작성하시오

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num1 = scan.nextInt();

		System.out.print("정수 입력 : ");
		int num2 = scan.nextInt();

		int i = 1; 

		/*
		
		for(i=1; ; i++) {
			if((i % num1 == 0) && (i % num2 == 0)) {
			System.out.println(num1 + "과 " + num2 + "의 최소 공배수 : " + i);
				break;
			}
		}
		
		*/

		while((i % num1 != 0) || (i % num2 != 0)) {
			i++;
		}

		System.out.println(num1 + "과 " + num2 + "의 최소 공배수 : " + i);


		/*
		
		
		// num1이 num2보다 작으면 num1과 num2를 바꾸는 코드
		// (두 수를 바꾸는 코드로 자주 사용)
		// num1이 111이고, num2가 30000이면 num1을 30000으로, num2를 111로 수정하는 코드
		
		
		int tmp;
		
		if(num1 < num2) {
		
			tmp = num1;
			num1 = num2;
			num2 = tmp;
		
		}
		
		 for(i = num1; ; i += num1) {
			if(i % num2 == 0) {
			System.out.println(num1 + "과 " + num2 + "의 최소 공배수 : " + i);
				break;
			}
			
		*/

	}

}