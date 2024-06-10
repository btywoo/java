package day06;

import java.util.Scanner;

public class ArrayEx09 {

	public static void main(String[] args) {

		String [] list = {"dog", "cat", "java", "cup", "conputer"};

		// 문자열을 입력받아 입력받은 문자열이 있는지 없는지 알려주는 코드를 작성하시오

		Scanner scan = new Scanner(System.in);
		System.out.print("문자열 입력 : ");

		String word = scan.next();

		for(String arr : list) {
			if(arr.equals(word)) {
				System.out.println(word + "은 있습니다");
				break;
			}
			else {
				System.out.println(word + "은 없습니다");
				break;
			}


		}
		
/*
		
		
		boolean result = false;
		
		for(String arr : list) {
			if(word.equals(list)) {
				result = true;
				break;
			}
		}
		
		if(result) {
			System.out.println(word + "은 있습니다");
		}
		
		else {
			System.out.println(word + "은 없습니다");
		}
		
		*/

	}


}

