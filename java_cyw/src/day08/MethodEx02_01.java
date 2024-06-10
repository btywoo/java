package day08;

public class MethodEx02_01 {

	public static void main(String[] args) {
		
		// 두 수의 최대 공약수와 최소 공배수를 구하는 코드를 작성하시오
		// 단 메서드 사용
		
		int num1 = 8, num2 = 12;
		
		int result = gcd(num1, num2);
		int result2 = count(num1, num2);
		
		System.out.println(num1 + "과" + num2 + "의 최대공약수 : " + result);
		
		System.out.println(num1 + "과" + num2 + "의 최소공배수 : " + result2);
	}


	public static int gcd(int num1, int num2) {
		int gcd = 0;
		for(int i = 1; i <= num1 && i <= num2; i++) {
			if(num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
		}
		
		return gcd;
	}
	
	public static int count(int num1, int num2) {
		int count = 0;
		
		for(int i = 1; i <= num1 * num2; i++) {
			if(i % num1 == 0 && i % num2 == 0) {
				count = i;
				break;
			}
		}
		
		return count;
		
	}
	
}