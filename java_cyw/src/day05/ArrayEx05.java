package day05;

import java.util.Scanner;

public class ArrayEx05 {

	public static void main(String[] args) {

		// 1 ~ 10 사이의 랜덤한 수 3개를 저장하고 출력하는 예제

		// 숫자를 입력해서 입력한 숫자가 랜덤한 수에 있는지 확인 하는 예제

		int arr[] = new int[3];

		for(int i = 0; i < arr.length; i++) {
			int min = 1, max = 10;
			int random = (int)(Math.random() * (max - min + 1) + min);
			arr[i] = random;
		}

		Scanner scan = new Scanner(System.in);

		System.out.print("정수 입력 : ");

		// 정수 3개가 있는데 내가 찾으려는 정수의 위치가 어딘지 확인
		// 중간에 찾았으면 1~3사이에 위치할 것이고, 없으면 3보다 크다
		// >> 중간에 찾았으면 0~2번지 사이에 있을 것이고, 없으면 번지가 3이다

		int i;
		int num = scan.nextInt();

		for(i = 0; i<arr.length; i++) {
			if(num == arr[i]) {
				break;
				}
		}

		if(i<arr.length) {
			System.out.println(num + "은 있습니다");
		}
		else {
			System.out.println(num + "은 없습니다");
		}


		// 

		boolean result = false;
		for(int tmp : arr) {
			if(tmp == num) {
				result = true;
				break;
			}
		}

		if(result) {
			System.out.println(num + "은 있습니다");
		}
		else {
			System.out.println(num + "은 없습니다");

		}
	}
}
