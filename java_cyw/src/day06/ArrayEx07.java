package day06;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx07 {

	public static void main(String[] args) {

		// UpDown 게임에 다음 기능을 추가하시오
		// 기록은 최대 5개까지

		// 메뉴
		// 1. 플레이
		// 2. 기록 확인
		// 3. 종료
		// 메뉴 선택 : 1
		// (랜덤이 35라고 가정)
		// 정수 입력 : 50
		// DOWN
		// 정수 입력 : 30
		// UP
		// 정수 입력 : 35
		// 정답입니다
		// 맞힌 횟수는 3회입니다
		// 기록이 등록됩니다
		// 메뉴
		// 1. 플레이
		// 2. 기록 확인
		// 3. 종료
		// 메뉴 선택 : 2
		// 기록 확인
		// 1. 3회
		// 메뉴
		// 1. 플레이
		// 2. 기록 확인
		// 3. 종료
		// 메뉴 선택 : 3
		// 프로그램을 종료합니다

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		int menu, random, min = 1, max = 100, i, count = 0;
		// menu = 메뉴 선택 창 넘버
		// random, min = 1, max = 100 > 랜덤 만드는 코드 사용
		// i > 1번 플레이 정수 입력 받는 변수
		// count > 현재 등록되어 있는 점수의 개수
		int [] score = new int[5];

		do {
			System.out.println("메뉴");
			System.out.println("1. 플레이");
			System.out.println("2. 기록 확인");
			System.out.println("3. 종료");
			System.out.print("메뉴 선택 : ");
			menu = scan.nextInt();

			if(menu < 1 || menu > 3) {
				System.out.print("없는 메뉴입니다");
				}

			switch(menu) {
			case 1 :
				random = (int)(Math.random() * (max - min + 1) + min);
				int num = 0; // 초기화 // 1번 플레이 하면서 맞추기 위해 시도한 횟수

				do {
					System.out.print("정수 입력 : ");
					i = scan.nextInt(); 
					num++;

					if(i<random) {
						System.out.println("UP");
					}
					else if(i>random) {
						System.out.println("DOWN");
					}
				}
				while(i != random); 

				System.out.println("정답입니다");
				System.out.println("입력한 횟수는 " + num + "회 입니다");
				System.out.println("기록이 등록됩니다");

				if(count < score.length) {
					score[count] = num;
					count++;
				}
				else if(num < score[count - 1]){
					score[count - 1] = num;
				}
				Arrays.sort(score, 0, count);
				// score 배열의 0(시작 위치) count(끝위치)

				break;

			case 2 :

				if(count == 0) {
					System.out.println("등록된 기록이 없습니다");
					break;
				}

				for(i = 0; i < count; i++) {
					System.out.println(i+1 + ". " + score[i] + "회");
				}

				break;

			case 3 :
				System.out.println("프로그램을 종료합니다");
				break;
			}
		}
		while(menu != 3);

	}
}


