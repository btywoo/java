package day05;

public class ArrayEx03 {

	public static void main(String[] args) {

		// 1~10 사이의 랜덤한 수 3개를 저장하고 출력하는 코드를 작성하시오


		// int num[] = new int[3];

		// for(int i = 0; i < num.length; i++) {

		//	int min = 1, max = 10;
		//	int random = (int)(Math.random() * (max - min + 1) + min);
		//	num[i]= random;

		//	System.out.print(num[i] + " ");
		// }


		// 위의 코드와 같지만 저장과 출력을 분리했다

		int num[] = new int[3];

		for(int i = 0; i < num.length; i++) {
			int min = 1, max = 10;
			int random = (int)(Math.random() * (max - min + 1) + min);
			num[i] = random;
		}

		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");

		}

	}

}