package day04;

public class WhileEx08 {
	
	public static void main(String[] args) {
		
		// 두 정수 8과 12의 최대 공약수를 구하는 코드를 작성하시오

		int i = 1; 

		int num1 = 8, num2 = 12;
		int gcd = 0;

		while(i <= num1 && i <= num2) {
			if(num1 % i == 0 || num2 % i == 0) {
				gcd = i;
			}
				i++;
		}
		System.out.print(gcd);
	}
}