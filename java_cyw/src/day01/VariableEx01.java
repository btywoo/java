package day01;

public class VariableEx01 {

	public static void main(String[] args) {

		char ch1 = 'a'; // 문자형 변수 ch1 선언

		char ch2 = 'A';

		char ch3 = 0, ch4 = 0;

		char ch5 = '+', ch6 = '\\';

		System.out.println(ch2);
		System.out.println(ch5);
		System.out.println(ch6);

		System.out.println(ch1);
		System.out.println(ch3);
		System.out.println(ch4);
		

		long num1 = 1234567890123l; // 정수 값이 int로 표현되지 않으면 접미사를 붙여야 함

		System.out.println(num1);

		float num2 = 3.14f;

		boolean isEven = true;

		System.out.println(num2);
		System.out.println(isEven);

	}

}