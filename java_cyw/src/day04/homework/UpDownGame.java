package day04.homework;
import java.util.Scanner;
public class UpDownGame {
	public static void main(String[] args) {
		
		// 숫자를 업다운하여 맞추는 게임
		// 1 ~ 100 사이의 랜덤한 수를 생성하여 해당 숫자를 맞추는 게임을 작성하시오
		
		// ex) 랜덤한 수가 30
		// 정수 입력 : 50
		// > Down
		// 정수 입력 : 20
		// > UP
		// 정수 입력 : 25
		// > UP
		// 정수 입력 : 30
		// 정답입니다
		
		
		
		// 랜덤 코드
		
		int min = 1 , max = 100;
		int random = (int)(Math.random() * (max - min + 1) + min);

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.print("정수 입력 : ");

		/*
		
		while(true) {
			int i = scan.nextInt(); 
			if(i == random) {
				break;
			}
			
			System.out.println(i < random ? "UP" : "DOWN");
		}
		
		System.out.println("정답입니다");
		
		*/
		
		int i;
		
		do {
			
			i = scan.nextInt(); 
			
			if(i<random) {
				System.out.println("UP");
			}
			else if(i>random) {
				System.out.println("DOWN");
			}
			// else {
			//	System.out.println("정답입니다");
			//}
		}
		while(i != random); // 조건식과 참인 경우 do 실행문 반복, 불일치시 종료

		System.out.println("정답입니다"); // else로 만들어도 상관 없음


		/*
		
		for(i = scan.nextInt(); i!=random; i = scan.nextInt()) {
			if(i<random) {
				System.out.println("UP");
			}
			else if(i>random) {
				System.out.println("DOWN");
			}
			
		}
		
		System.out.println("정답입니다");
		
		*/



		/*
		 
		i = scan.nextInt(); 
		
		while(i != random) {
			
			if(i<random) {
				System.out.println("UP");
				}
			else if(i>random) {
				System.out.println("DOWN");
			}
			
			i = scan.nextInt(); 
			
		}
			System.out.println("정답입니다");
			
			*/
	}
}