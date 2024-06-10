package day08.homework;

import java.util.Arrays;
import java.util.Scanner;

public class MethodEx01_Test {
	
	public static void main(String[] args) {
		
		// 정수 입력 (배열의 크기)
		
		System.out.println("배열 크기 입력 :");
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		// 입력 받은 정수를 이용하여 정수 배열을 생성
		int [] arr = createArray(size);
		System.out.println(Arrays.toString(arr));

	}
	
	
	/**	기능 : 배열의 크기가 주어지면 주어진 배열 크기의 정수 배열을 생성해서 알려주는 메서드
	 * 	매개변수 : 배열 크기  > int size
	 * 	리턴타입 : 생성된 정수 배열 > int []
	 * 	메서드명 : createArray
	 */
	
	public static int [] createArray(int size) {
		if(size < 0) {
			return null;
		}
		
		int [] arr = new int[size];
		return arr;
		
		// return new int[size];
	}

}

	