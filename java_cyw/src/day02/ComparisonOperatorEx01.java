package day02;

public class ComparisonOperatorEx01 {

	public static void main(String[] args) {

		//비교 연산자 예제

		int num1 = 10, num2 = 20;

		System.out.println("" + num1 + "<" + num2 + " : " + (num1<num2));
		System.out.println("" + num1 + ">" + num2 + " : " + (num1>num2));
		System.out.println("" + num1 + "<=" + num2 + " : " + (num1<=num2));
		System.out.println("" + num1 + ">=" + num2 + " : " + (num1>=num2));
		System.out.println("" + num1 + "==" + num2 + " : " + (num1==num2));
		System.out.println("" + num1 + "!=" + num2 + " : " + (num1!=num2));

		// int - 숫자의 경우 
		// 리터럴을 직접 저장하기 때문에 단순히 리터럴의 크기를 비교함

		String str1 = "abc", str2 = "abc", str3 = new String("abc");

		System.out.println("str1 == str2 : " + (str1 == str2)); 
		// 같은 리터럴을 저장하기 때문에 주소가 같다
		System.out.println("str1 == str3 : " + (str1 == str3));
		//str3은 리터럴이 아닌 객체로 저장하기 때문에 주소가 다름
		System.out.println("str2 == str3 : " + (str2 == str3));

		// String - 문자의 경우
		// 리터럴을 가지고 있는 주소를 저장하고 있기 때문에 주소가 동일한지 비교함
		// 따라서 문자열이 같아도 다르다고 판별할 수 있음

		System.out.println("str1 == str2 : " + (str1.equals(str2)));
		System.out.println("str1 == str3 : " + (str1.equals(str3)));
		System.out.println("str2 == str3 : " + (str2.equals(str3)));

		//문자열은 equals 메소드를 사용해서 비교해야 함

	}

}