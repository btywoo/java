package day06;

public class ArrayEx01 {

	public static void main(String[] args) {

		// 배열 선언 방법에 따른 차이점을 보여주는 예제

		int [] arr1, arr2;
		int arr3[], arr4;

		arr1 = new int[3]; // 배열
		arr2 = new int[3]; // 배열
		arr3 = new int[3]; // 배열
		// arr4 = new int[3]; // 배열 X

		arr4 = 10; // 변수
		
		for(int i = 0; i<arr1.length; i++) {
			System.out.println(arr2[i]);
			System.out.println(arr3[i] + arr4);
		}

	}

}