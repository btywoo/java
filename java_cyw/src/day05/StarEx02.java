package day05;

public class StarEx02 {

	public static void main(String[] args) {

		// *을 하나씩 출력해서 다음과 같이 출력되도록 중첩 반복문을 이용하여 작성하시오

		// *                     > i = 1, num = 1
		// **                    > i = 2, num = 2
		// ***                   > i = 3, num = 3
		// ****                  > i = 4, num = 4
		// *****                 > i = 5, num = 5

		int n = 8;

			for(int i = 1; i <= n ; i++)  { // *의 줄 개수
				for(int num = 1; num <= i; num++) { 
					// num > *
					// i와 num의 수가 같기 때문에 i = num이라고 말할 수 있다
					System.out.print("*");
				}
				System.out.println();
			}
		}



}