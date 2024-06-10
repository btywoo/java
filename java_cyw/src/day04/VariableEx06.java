package day04;

public class VariableEx06 {

	public static void main(String[] args) {

		// 정수를 활용한 문자 출력 예제
		// 알파벳은 아스키코드에 의해 각 정수가 문자로 치환된다
		// 알파벳에 맞는 정수를 char 변수에 저장하면 해당 정수에 맞는 문자가 저장됨

		char ch = 'A';

		int i = 25;

		ch = (char)(ch + i);

		System.out.println(ch);

	}

}