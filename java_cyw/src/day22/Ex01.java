package day22;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex01 {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		// 콘솔에서 한 문장(영어)을 입력하고 
		// 한 문장에 몇 개의 단어로 구성되어 있는지 확인하는 코드를 작성하시오
		
		System.out.print("영어 문장을 입력하세요 : ");
		String sentence = scan.nextLine();
		
		
		// 방법 1
		String [] array = sentence.split(" ");
		
		System.out.println("단어의 개수 : " + array.length);
		
		
		
		// 방법 2
		StringTokenizer sen = new StringTokenizer(sentence, " ");
		
		int count = 0;
		
		while(sen.hasMoreTokens()) {
			sen.nextToken();
			count++;
		}
		
		System.out.println("단어의 개수 : " + count);

	}

}
