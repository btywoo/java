package day04;

public class NestedForEx02 {

	public static void main(String[] args) {

		// num이 소수인지 아닌지 판별하는 코드를 이용하여 
		// 100 이하의 소수를 출력하는 코드를 작성하시오

		// 소수면 num을 출력, 아니면 아무 것도 안 함

		int num;
		int i;
		int count;

		for(num = 1; num <= 100; num++) {
			for(i = 1, count = 0; i <= 100; i++) {
				if(num % i == 0) {
					count++;
				}
			}
			if(count == 2) {
				System.out.print(num + " ");
			}
		}


	}

}