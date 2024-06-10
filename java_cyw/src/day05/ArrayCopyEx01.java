package day05;

public class ArrayCopyEx01 {

	public static void main(String[] args) {

		int [] arr = new int[] {5,4,3,2,1};

		//반복문을 이용한 배열 복사
		int [] arr2 = new int[arr.length];
		for(int i = 0; i<arr.length; i++) {
			arr2[i] = arr[i];
		}

		//반복문을 이용하여 결과 확인
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr2[i] + " ");
		}

		System.out.println();

		// System.arraycopy를 이용한 배열 복사

		// src : 복사할 배열 / srcPos : 복사할 배열의 시작 번지
		// dest : 복사될 배열 / destPos : 복사될 배열의 시작 번지
		// length : 복사할 개수

		int [] arr3 = new int[arr.length];
		System.arraycopy(arr, 0, arr3, 0, arr.length);

		//반복문을 이용하여 결과 확인
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr3[i] + " ");
			}

	}

}