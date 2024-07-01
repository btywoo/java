package day07.homework;

import java.util.Scanner;

public class BaseballGame {

	public static void main(String[] args) {

		// 숫자 야구 게임을 구현하세요
		// 규칙
		// 중복되지 않은 1 ~ 9 사이의 랜덤한 수를 생성
		// 이 세 수를 맞추는 게임

		// 스트라이크 : 해당 숫자가 있고, 위치도 같은 경우
		// 볼 : 해당 숫자가 있지만, 위치가 다른 경우
		// 아웃 : 일치하는 숫자가 하나도 없는 경우

		// 예시
		// 3 9 7 
		// 입력 : 1 2 3 
		// 1B
		// 입력 : 5 6 7
		// 1S
		// 입력 : 4 5 6
		// OUT
		// 입력 : 3 7 9
		// 1S 2B
		// 입력 : 3 9 7 
		// 3S
		// 정답입니다

		int[] list = new int[3]; // 랜덤 수
		int[] num = new int[3]; // 입력 수
		int count = 0; // 저장된 숫자의 개수
		int min = 1, max = 9;
		int i = 0;
		int j = 0;
		int countS = 0;
		int countB = 0;
		int random;

		Scanner scan = new Scanner(System.in);
		
		while(count < 3) {
			random = (int)(Math.random() * (max - min + 1) + min);
			for(i = 0; i < count; i++) {
				if(list[i] == random) {
					break; // i는 count보다 작음 / i++이 되지 않음
				}
			}
			
			if(i == count) {
				list[count] = random;
				count++;
				
			}
			
			System.out.println(random);
			
		}

		// 랜덤 지정 완료


		while(true) {	

			System.out.println("입력 : ");

			num[0] = scan.nextInt();
			num[1] = scan.nextInt();
			num[2] = scan.nextInt();

			for(i = 0; i<list.length; i++) {
				for(j = 0; j < list.length; j++) {
					if(num[i] == list[j] && i == j) {
						countS++;
					}
					else if(num[i] == list[j] && i != j) {
						countB++;
					}
					
				}

			}
			
			if(countS == 0 && countB == 0) {
				System.out.println("OUT");
			}
			else if(countS == 3){
				System.out.println("정답입니다");
				break;
			}
			else {
				System.out.println(countS + "S" + countB + "B");
			}

			countS = 0;
			countB = 0;
			
		}
		
	}
	
}

