package day22;

import java.util.Scanner;

public class Ex02 {

	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// 콘솔에서 정수로 이루어진 문자열에서 각 정수들의 합을 구하는 코드를 작성하시오
		
		// 예
		// 1 23 45 3 9 7 5
		// 93
		
		System.out.print("더할 숫자를 입력하세요 : ");
		String sentence = scan.nextLine();
		sum(sentence);
		
	}
	
	public static void sum(String str) {
		
		String sen = str;
		
		int sum = 0;
		
		String [] array = sen.split(" ");
		
		for(String num : array) {
			int number = Integer.parseInt(num);
			sum += number;
		}
		
		System.out.println("합 : " + sum);
		
	}
	
}
