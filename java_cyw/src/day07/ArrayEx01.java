package day07;

import java.security.DrbgParameters.NextBytes;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx01 {

	public static void main(String[] args) {

		// 3명의 학생의 국어, 영어, 수학 성적을 입력받고
		// 각 학생의 평균을 구하는 코드를 작성하시오

		// 학생 1의 성적을 입력하세요(국어, 영어, 수학 순)
		// 학생 1의 성적을 입력하세요(국어, 영어, 수학 순)
		// 학생 1의 성적을 입력하세요(국어, 영어, 수학 순)
		// 학생 1의 평균 : 
		// 학생 2의 평균 : 
		// 학생 3의 평균 : 

		/*
		
		int [] kor, eng, math;
		int student = 3, i, j, sum = 0, sum1 = 0, sum2 = 0, sum3 = 0;
		double avg = 0, avg1 = 0, avg2 = 0, avg3 = 0;
		
		
		kor = new int[student];
		eng = new int[student];
		math = new int[student];
		
		*/



		String[] student = new String[3];
		String[] subject = new String[3];
		String[] subname = new String[3];
		int[][] score = new int[3][3];

		int i, j = 0, sum = 0, sum1 = 0;
		double avg = 0, avg1 = 0;


		Scanner scan = new Scanner(System.in);


		/*
		
		for(i = 0; i < student; i++) {
			System.out.println("학생" + (i+1) + "의 성적을 입력하시오. (국어, 영어, 수학 순)");
			kor[i] = scan.nextInt();
			eng[i] = scan.nextInt();
			math[i] = scan.nextInt();
		}
		
		for(i = 0; i < student; i++) {
			sum = kor[i] + eng[i] + math[i];
			avg = ((double) sum / student);
			System.out.println("학생" + (i+1) + "의 평균 : " + avg);
		}
		
		for(i = 0; i < student; i++) {
			sum1 += kor[i]; 
			sum2 += eng[i];
			sum3 += math[i];
			avg1 = ((double) sum1 / student);
			avg2 = ((double) sum2 / student);
			avg3 = ((double) sum3 / student);
		}
		
		System.out.println();
		
		System.out.println("국어의 평균 : " + avg1);
		System.out.println("영어의 평균 : " + avg2);
		System.out.println("수학의 평균 : " + avg3);
		
		*/


		for(i = 0; i < student.length; i++) {
			System.out.println((i+1) + "번 학생의 이름을 입력하세요");
			student[i] = scan.next();
		}

		scan.nextLine();

		for(i = 0; i < subject.length; i++) {
			System.out.println("과목 이름을 입력하세요");
			subname[i] = scan.nextLine();
		}


		for(i = 0; i < student.length; i++) {
			System.out.println(student[i] + "의 성적을 입력하시오.");
			System.out.println(subname[0]);
			score[i][0] = scan.nextInt();
			System.out.println(subname[1]);
			score[i][1] = scan.nextInt();
			System.out.println(subname[2]);
			score[i][2] = scan.nextInt();

		}


		for(i = 0; i < student.length; i++) {
			sum = (score[i][0] + score[i][1] + score[i][2]);
			avg = ((double) sum / student.length);
			System.out.println(student[i] + " 평균 : " + avg);
		}

		System.out.println();

		for(i = 0; i < student.length; i++) {
			sum = (score[0][i] + score[1][i] + score[2][i]);
			avg = ((double) sum / student.length);
			System.out.println(subname[i] + " 평균 : " + avg);
		}


	}

}