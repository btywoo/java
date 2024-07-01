package day06;

import java.util.Scanner;

public class ArrayEx04 {

	public static void main(String[] args) {

		// 4자리 정수를 입력받아 입력받은 정수를 역순으로 배열에 저장하고, 출력하는 코드를 작성하시오

		// 1234 > 0번지에 4, 1번지에 3, 2번지에 2, 3번지에 1 저장
		// 4자리 정수가 아니면 잘못 입력되었다고 출력
		// 4자리 정수이면 저장 후 순차적으로 출력

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.print("정수 입력 : ");

		int j = 0;
		int i = scan.nextInt(); // i는 입력 받는 수로 고정

		int arr[] = new int[4];

		if(i < 1000 || i > 9999) {
			System.out.println("4자리 정수가 아닙니다");
		}
		else {
			while(i != 0) { // i가 0이 아닌 경우 계속
				arr[j] = i % 10;
				i = i / 10;
				j++;
				}
			System.out.print("정수 역순 : ");
			for(int num : arr) {
				System.out.print(num);

			}
		}
	}
}