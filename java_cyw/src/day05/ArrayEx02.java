package day05;

import java.util.Scanner;

public class ArrayEx02 {

	public static void main(String[] args) {

		// 학생 3명의 성적을 저장하는 배열을 생성하고
		// 3명의 성적을 콘솔을 통해 입력 받고
		// 출력하는 코드를 작성하시오


		int stsc[] = new int[3]; 

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		int sum = 0;

		// sum = sum + stsc[0];
		// sum = sum + stsc[1];
		// sum = sum + stsc[2];
		// sum = 총점

		for(int i = 0; i < stsc.length; i++) {
			System.out.print("학생 " + (i+1) + "의 성적 : ");
			stsc[i]= scan.nextInt();
			sum += stsc[i]; 
		}

		for(int i = 0; i < stsc.length; i++) {
			System.out.println("학생" + (i+1) + "의 성적은 " + stsc[i] + "점 입니다");
		}

		// 학생 3명의 성적을 저장하는 배열을 생성하고
		// 3명의 성적을 콘솔을 통해 입력 받고
		// 입력 받은 성적의 평균을 구하는 코드를 작성하시오

		System.out.println("평균 점수는 " + ((double) sum / stsc.length) + "점 입니다");




	}

}