package day04;

public class WhileEx04 {

	public static void main(String[] args) {

		// 1부터 10까지 합을 구하는 코드를 작성하시오

		// > 1(n)부터 10(n+9)까지 합을 구하는 코드를 작성하시오
		// >> n > i
		// >>> (1부터 10까지 더한 값) sum
		// >>> = i + i++ + (i++)++ + (i++++)++ + .... + (i++++++++++++)++;

		int i = 1; // 1부터 10까지의 합에서 1 ~ 10 부분
		int sum = 0; //초기화

		while(i <= 10) { // n이 1에서 10까지 될 때

			sum = sum + i;
			// sum += i;
			i++;

			/*
			sum += i++; // sum에 i++을 저장한다
			// > sum = sum + i; / i++;
			// >> sum += i; / i++;
			// >>> sum += i++;
			 * 
			 * 
			 */
		}
		System.out.println(sum);

	}

}