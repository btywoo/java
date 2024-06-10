package day08.homework;

import java.util.Scanner;

public class MethodEx01 {
	
	
	public static int[] createArray(int num) {
		
		int temp[] = new int[num];
		
		for(int i = 0; i<temp.length; i++) {
			temp[i] = i;
		}
		
		return temp;
		
	}
	
	/* 정수 n을 입력받아 입력받은 n 크기를 가지는 배열을 생성하는 코드를 작성하세요.
	 * 메서드를 이용 */
	
	/**기능 : 배열의 크기가 주어지면 / 주어진 배열 크기의 정수 배열을 생성해서 / 알려주는 메서드
	 * 매개변수 : 배열 크기 > int num
	 * 리턴타입 : 생성된 정수 배열 > int []
	 * 메서드명 : createArray
	 * */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = scan.nextInt();
		
		int list[];
		list = createArray(num);
		
		for(int i = 0; i<list.length; i++) {
			System.out.print(list[i] + ", ");
		}
		
	}
	
}
		

