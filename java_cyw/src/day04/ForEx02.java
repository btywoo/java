package day04;

public class ForEx02 {

	public static void main(String[] args) {

		// 구구단 2단을 출력하는 코드를 for문으로 작성하시오

		int i;
		int num = 1;

		for(i = 2; num < 10; num++) {
			System.out.println(i + "X" + num + "=" + (i*num));
		}

	}

}