package day05;

public class StarEx04 {

	public static void main(String[] args) {

		// *을 하나씩 출력해서 다음과 같이 출력되도록 중첩 반복문을 이용하여 작성하시오

		//	   *                 > n = 1, num(공백) = 4, num = 1, 추가된 * = 0
		//    ***                > n = 2, num = 3, num = 2, 추가된 * = 1
		//   *****               > n = 3, num = 2, num = 3, 추가된 * = 2
		//  *******              > n = 4, num = 1, num = 4, 추가된 * = 3
		// *********             > n = 5, num = 0, num = 5, 추가된 * = 4
		//						 > n = 줄, num = n-i, num = i, 추가된 * = 

		int n = 30;

		for(int i = 1; i <= n ; i++)  { // *의 줄 개수

			for(int num = 1; num <= n-i; num++) {
				System.out.print(" ");
			}

			for(int num = 1; num <= i; num++) { 
				System.out.print("*");
			}

			for(int num = 1; num <= i-1; num++) { 
				System.out.print("*");
			}
			System.out.println();
		}


	}

}