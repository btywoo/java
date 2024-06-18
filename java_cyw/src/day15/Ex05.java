package day15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex05 {
	
	public static Scanner scan = new Scanner(System.in);

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		
		// 숫자 야구 게임을 구현하시오
		
		// S : 숫자가 있고 위치가 같은 경우
		// B : 숫자가 있고 위치가 다른 경우
		// O :  일치하는 숫자가 하나도 없는 경우
		
		// 중복되지 않은 1~9 사이의 3개의 숫자 생성
		
		// 사용자가 숫자 3개를 입력
		
		// 입력한 값과 랜덤 값을 이용하여 결과를 출력
		
		// 맞출 때까지 반복
		
		
		List<Integer> baseball = new ArrayList<Integer>();
		
		List<Integer> user = new ArrayList<Integer>();
		
		int min = 1, max = 9;
		
		while(baseball.size()<3) {
			
			int num = (int)(Math.random() * (max - min + 1) + min);
			
			if(baseball.contains(num)) {
				baseball.remove(num);
			}
			
			baseball.add(num);
		}
		
		System.out.println(baseball);
		
		do {
			
			while(user.size()<3) {
				System.out.print("번호 입력 : ");
				user.add(scan.nextInt());
			}
			
			int ball = 0;
			int strike = 0;
			
			for(int i = 0; i<3 ; i++) {
				for(int j = 0; j<3; j++) {
					if(baseball.get(i) == user.get(j) && i == j) {
						strike++;
					}
					else if(baseball.get(i) == user.get(j) && i != j) {
						ball++;
					}
				}
			}
			
			if(strike == 0 && ball == 0) {
				System.out.println("O");
				break;
			}
			
			System.out.print(strike + "S");
			System.out.print(ball + "B");
			
		}
		while(baseball.contains(user));
		
		System.out.println("프로그램을 종료합니다");
		

	}

}