package day04;

public class WhileEx05 {

	public static void main(String[] args) {

		// 1부터 10까지 짝수 합을 구하는 코드를 작성하시오
		// WhileEx04 연장선 예제

		int i = 2; 
		int sum = 0;

		while(i <= 10) {
			sum = sum + i; // sum += i; 
			i += 2; // i = i + 2;
		}
		System.out.println(sum);

	}

}