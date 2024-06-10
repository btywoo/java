package day04;

public class WhileEx06 {

	public static void main(String[] args) {

		// 12의 약수를 출력하는 코드를 작성하시오

		int i = 1; 
		int num = 12;

		System.out.println(num + "의 약수 : ");

		while(i <= num) {
			if(num % i == 0) {
				System.out.print(i + (i != num ? ", " : "\n"));
			}
			i++;
		}


	}

}