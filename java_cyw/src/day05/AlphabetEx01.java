package day05;

public class AlphabetEx01 {

	public static void main(String[] args) {

		// a					> num = 0 > num0
		// ab					> num = 1 > num0 + 1
		// abc					> num = 2 > num1 + 1
		// abcd					> num = 3 > num2 + 1
		// abcde				> num = 4 > num3 + 1
		// abcdef				> num = 5 > num4 + 1
		// abcdefg...xyz		> num = 26 > num25 + 1


		int n = 26;

		for(int i = 0; i < n ; i++)  { // *의 줄 개수 / 부여된 알파벳 없음
			for(int num = 0; num <= i; num++) { // 알파벳의 개수 / a~z
				System.out.print((char)('a'+ i)); 
				// i > 숫자 부여 : 'a'+i가 되기 때문에 'a'+i의 값이 num만큼 출력된다
				// num > 알파벳 부여 : 'a'+'a+1'을 부여한다. 출력 이후 num의 값이 'a'+1로 고정이 되기 때문에
				// 'a'+'a+1'의 값으로 출력된다
			}
		System.out.println();
		}

		// 위와 동일 예제 / 변수의 개수 차이

		// ch1은 'a'부터 'z'까지 1씩 증가
		// ch2는 'a'부터 ch1까지 출력

		//	for(char ch1 = 'a'; ch1 <= 'z'; ch1++) { 
		//		for(char ch2 = 'a'; ch2 <= ch1; ch2++) {
		//			System.out.print(ch2);
		//			}
		//		System.out.println();
		//		}




	}

}