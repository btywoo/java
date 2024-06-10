package day06;

import java.util.Scanner;

public class ArrayEx06 {
	
	public static void main(String[] args) {
		
		// 4과목의 성적을 입력 받아 배열에 저장하고
		// 과락(40점 미만)이 없고 평균이 60점 이상이면 PASS, 아니면 FAIL이라고 출력하시오
		
		
		/*
		
		Scanner scan = new Scanner(System.in);
		
		int arr[] = new int[4];
		int i;
		int sum = 0;
		
		for(i = 0; i<arr.length; i++) {
			System.out.print("점수 입력 : ");
			arr[i] = scan.nextInt();
			sum += arr[i];
		}
		
		if((sum / arr.length) < 60 || arr[i-1] < 40) {
			System.out.println("FAIL");
		}
		else {
			System.out.println("PASS");
		}
		
		*/
		

		Scanner scan = new Scanner(System.in);

		int arr[] = new int[4]; 

		for(int i = 0; i<arr.length; i++) {
			System.out.print("점수 입력 : ");
			arr[i] = scan.nextInt();
			
		}

		int sum = 0;
		for(int num : arr) {
			sum += num;
		}

		double avg = sum / (double)arr.length;

		boolean result = false;

		for(int num : arr) {
			if(num < 40) {
				result = true;
				break; // 없어도 무방
			}
		}

		if(!result && avg >= 60) {
			System.out.println("PASS");
			}
		else {
			System.out.println("FAIL");
		}
		 
		
	}
	
	
}
		
	
