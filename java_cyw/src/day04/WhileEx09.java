package day04;

public class WhileEx09 {

	public static void main(String[] args) {

		// a부터 z까지 출력하는 코드를 작성하시오

		int i = 0;

		while(i <= 25) {
			System.out.print((char)('a' + i ) + " ");
			i++;
			}


		System.out.println(); // 한 줄 띄우기


		// ch는 'a'부터 'z'까지 1씩 증가

			char ch = 'a';

			while(ch <= 'z') {
				System.out.print(ch);
				ch++;
			}


		}



}