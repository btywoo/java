package day04;

public class BreakEx02 {

	public static void main(String[] args) {

		// 최대 공약수 예제를 break문을 이용하여 구현하는 예제
		// num1 = 8 / num2 = 12

		int num1 = 8, num2 = 12;
		int i = num1;

		while(i >= 1) {
			if(num1 % i == 0 && num2 % i == 0) {
				System.out.println(i);
				break;
			}
			i--;
		}

	}

}