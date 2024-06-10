package day05;

public class StarEx03 {

	public static void main(String[] args) {

		// *을 하나씩 출력해서 다음과 같이 출력되도록 중첩 반복문을 이용하여 작성하세요

		//     *                 > i = 1, 공백 = 4, num = 1
		//    **                 > i = 2, 공백 = 3, num = 2
		//   ***                 > i = 3, 공백 = 2, num = 3
		//  ****                 > i = 4, 공백 = 1, num = 4
		// *****                 > i = 5, 공백 = 0, num = 5

		int n = 30;

		for(int i = 1; i <= n ; i++)  { // *의 줄 개수
			for(int num = 1; num <= n-i; num++) { // num + 공백이 i이기 때문에 n-i로 표기
				System.out.print(" ");
			}
			for(int num = 1; num <= i; num++) { 
				System.out.print("*");
			}
			System.out.println();
		}
	}

}