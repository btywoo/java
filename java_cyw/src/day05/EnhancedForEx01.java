package day05;

public class EnhancedForEx01 {

	public static void main(String[] args) {

		// 배열에 1,2,3,4,5를 저장한 후 향상된 for문을 이용하여 조회하는 예제

		int [] arr = new int[] {1,2,3,4,5};

		for(int i : arr) {					// for(자료형 변수명 : 배열명)
			System.out.print(i + " ");			// sysout(변수명);
		}

		System.out.println();

		for(int i = 0; i <arr.length; i++) {
			int num = arr[i];
			System.out.print(num + " ");
		}


	}

}