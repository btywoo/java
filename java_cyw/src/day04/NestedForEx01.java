package day04;

public class NestedForEx01 {

	public static void main(String[] args) {

		// 구구단 2~9단을 출력하는 코드를 작성하시오

		int i; // 단
		int num; // 숫자

		for(i = 1; i <= 9; i++) {
			System.out.println(i + "단");
			for(num = 1; num <= 9; num++) {
				System.out.println(i + "X" + num + "=" + (i*num));
			}
		}

	}

}