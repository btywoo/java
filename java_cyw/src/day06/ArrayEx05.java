package day06;

public class ArrayEx05 {

	public static void main(String[] args) {

		// 100 이하의 소수를 찾는 예제 : 에라토스테네스의 체

		// 1 2 3 4 5 6 7 8 9 10

		// i = A X B >> A
		// j = A X B >> B

		int [] arr = new int [101]; // x : 1, o : 0

		arr[1] = 1;

		for(int i = 2; i < arr.length; i++) { 
			if(arr[i] == 1) {
				continue;
			}
			for(int j = 2 * i; j<arr.length; j += i) { 
				// 배수를 찾는 코드
				// i > 3인 경우 
				// j = 2 * 3; 101 이전까지; (((2*3)+3)+3)+3)...
				// j = j + 3 > j += 3
					arr[j] = 1;
				}
			}
		for(int i = 2; i<arr.length; i++) {
			if(arr[i] == 0) {
				System.out.print(i + " ");
			}


		}


	}

}