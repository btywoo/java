package day07.homework;

import java.util.Scanner;

public class BaseballGameEx {

	public static void main(String[] args) {

		int min = 1, max = 9;

		int numArr[] = new int[3];  // 랜덤으로 뽑은 숫자를 넣기 위한 배열
		int inputArr[] = new int[3]; // 유저가 입력한 숫자를 넣기 위한 배열

		int strike = 0; // 스트라이크 변수
		int ball = 0; // 볼 변수



		// 랜덤 수 정하기

		for(int i = 0; i<numArr.length; i++) {
			numArr[i] = (int)(Math.random() * (max - min + 1) + min);
			for(int j = 0; j<i; j++) {
				if(numArr[j] == numArr[i]) {
					i--;
					break;
				}
			}
		}

		for(int x : numArr) {
			System.out.print(x + " ");
		}


		///

		Scanner scan = new Scanner(System.in);

		while(true) {
			for(int i = 0; i<inputArr.length; i++) {
				System.out.println("정수 입력 : ");
				inputArr[i] = scan.nextInt();
			}

			for(int i = 0; i<numArr.length; i++) {
				for(int j = 0; j<inputArr.length; j++) {
					if(numArr[i] == inputArr[j] && i == j) {
						strike++;
					}
					else if(numArr[i] == inputArr[j] && i != j) {
						ball++;
					}
				}
			}

			System.out.println(strike + "스트라이크" + ball + "볼");

			if(strike == 3) {
				System.out.println("정답");
			}

			strike = 0;
			ball = 0;

		}

	}

}