package day13;

import java.text.MessageFormat;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		// 두 정수와 산술 연산자를 입력 받아 산술 연산 결과를 알려주는 메소드를 정의 및 구현하고
		// main 메소드에서 실행하는 코드를 작성하시오
		
		// 단 예외 발생 시, 예외처리하는 코드를 추가하시오
		
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("두 정수와 산술 연산자를 입력하시오. \nex) 1 / 0");
		
		double num1 = scan.nextDouble();
		char ch1 = scan.next().charAt(0);
		double num2 = scan.nextDouble();
		
		try {
			double res = calculate(num1, ch1, num2);
			String format = "{0} {1} {2} = {3}";
			System.out.println(MessageFormat.format(format, num1, ch1, num2, res));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		

	}
	
	public static double calculate(double num1, char operator, double num2) {
		
		double res;
		switch(operator) {
		
		case '+' :
			res = num1 + num2;
			break;
			
		case '-' :
			res = num1 - num2;
			break;
			
		case '*' :
			res = num1 * num2;
			break;
			
		case '/' :
			if(num2 == 0) {
				throw new ArithmeticException("0으로 나눌 수 없습니다");
			}
			res = num1 / num2;
			break;
			
		case '%' :
			if(num2 == 0) {
				throw new ArithmeticException("0으로 나눌 수 없습니다");
			}
			res = num1 % num2;
			break;
			
		default :
			throw new IllegalArgumentException("잘못된 연산자 : " + operator);
		
		}
		
		return res;
		
	}

}
