package day02;

public class Exam02 {

	public static void main(String[] args) {

		int num1 = 1, num2 = 2;
		char ch = '+';

		//num1, num2, ch를 이용해 1+2가 출력되도록 코드 작성

		System.out.println("" + num1 + ch + num2);
		// "" 사용하지 않을 경우 ch를 정수로 인식해 46으로 결과 값이 나옴
		// "" > 문자열에 더하는 연산을 먼저 해서 산술적 연산이 아닌 붙이는 연산으로 작용됨

		System.out.printf("%d%c%d", num1 , ch, num2);
		// printf 함수가 문자 형식, 변수를 받기 때문에 문자열이 꼭 들어가야 함

	}

}