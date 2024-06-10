package day07;

import java.util.Scanner;

public class ScannerEx01 {

	public static void main(String[] args) {

		// Scanner를 이용해 next()와 nextLine()의 차이를 살펴보는 예제

		// next()
		// 문자열 
		// 공백을 제외한 연속된 문자열
		// 문자열을 입력하기 전 입력 버퍼에 엔터가 있으면 버림
		// abc 공백 def 공백 xyz 엔터 >> str1 : abc / str2 : def / str3 : xyz
		// nextLine()
		// 문자열 
		// 공백을 포함한 한 줄의 문자열
		// 문자열을 입력하기 전 입력 버퍼에 엔터가 있으면 가져와서 실행
		// 문자열을 입력한 마지막에 입력한 엔터를 가져가고, 가져간 엔터를 버림
		// nextLine 앞에 nextLine을 제외한 모든 next 함수가 오는 경우 
		// scan.nextLine();을 입력해 초기화 해야한다.
		// abc 공백 def 공백 xyz 엔터 >> str1 : abc 공백 def 공백 xyz

		Scanner scan = new Scanner(System.in);

		// next()는 여러번 연속으로 나와도 문제가 없다
		System.out.print("문자열 입력(next) : ");
		String str1 = scan.next();
		System.out.print("문자열 입력(next) : ");
		String str2 = scan.next();
		System.out.print("문자열 입력(next) : ");
		String str3 = scan.next();

		scan.nextLine(); // nextLine 초기화용

		System.out.print("문자열 입력(next) : ");
		String str4 = scan.nextLine();
		System.out.print("문자열 입력(next) : ");
		String str5 = scan.nextLine();
		System.out.print("문자열 입력(next) : ");
		String str6 = scan.nextLine();


	}

}