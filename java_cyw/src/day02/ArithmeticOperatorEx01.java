package day02;

public class ArithmeticOperatorEx01 {

	public static void main(String[] args) {

		//산술 연산자 예제

		int num1 = 1, num2 = 2;
		System.out.println("" + num1 + '+' + num2 + "=" + (num1+num2));
		System.out.println("" + num1 + '-' + num2 + "=" + (num1-num2));
		System.out.println("" + num1 + '*' + num2 + "=" + (num1*num2));
		System.out.println("" + num1 + '/' + num2 + "=" + (num1/num2)); // 형변환 X
		System.out.println("" + num1 + '/' + num2 + "=" + ((double)num1/num2)); // 형변환 O
		System.out.println("" + num1 + '%' + num2 + "=" + (num1%num2));



	}

}