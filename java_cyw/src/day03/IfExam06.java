package day03;

import java.util.Scanner;

public class IfExam06 {

	public static void main(String[] args) {

		//성적을 입력 받아 성적에 맞는 학점을 출력하는 코드를 작성하시오

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.print("점수 입력 : ");

		int score = scan.nextInt();


		if(score > 100 || score < 0) {
			System.out.println("잘못된 성적입니다");
		}
		else if(score >= 90) {
			System.out.println("A"); 
		}
		else if(score >= 80) {
			System.out.println("B");
		}
		else if(score >= 70) {
			System.out.println("C");
		}
		else if(score >= 60) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}


	}

}