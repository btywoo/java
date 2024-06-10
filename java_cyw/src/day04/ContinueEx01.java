package day04;

public class ContinueEx01 {

	public static void main(String[] args) {

		// 1부터 10 사이의 짝수 출력 예제 (continue 사용)

		int i = 0;

		while(i < 10) {
			i++; 
			if(i % 2 != 0) { //홀수이면 i를 출력하기 않고 건너뜀
				continue; // while문에서는 조건식으로 건너뜀
			}
			System.out.println(i);
		}

	}

}