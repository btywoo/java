package day08.homework;

import java.util.Arrays;

public class MethodEx03 {
	
	/**기능 : 최소값과 최대값 사이의 랜덤한 정수를 생성해서 알려주는 메서드
	 * 매개변수 : 최소값과 최대값
	 * 리턴타입 : 랜덤한 정수
	 * 메서드명 : random
	 * */
	
	public static int random(int num1, int num2) {
		
		int min = num1;
		int max = num2;
		
		int random = (int)(Math.random() * (max - min + 1) + min);
		
		return random;
		
	}
	
	/**기능 : 배열에 0번지부터 count-1번지까지 확인하려는 정수가 있는지 확인해서 있는지 없는지를 알려주는 메서드 
	 * 매개변수 : 배열, 확인할 갯수 count, 확인하려는 정수 =>
	 * 리턴타입 : 있는지 없는지 => 
	 * 메서드명 : contains
	 * */
	
	public static boolean contains(int []arr, int count, int num) {
		
		if(arr == null) {
			return false;
		}
		
		for(int tmp : arr) {
			if(tmp == num) {
				return true;
				}
			
			}
			
		return false;
		
	}
	
	/**기능 : 배열의 크기와 최소값과 최대값이 주어졌을 때, 중복되지 않은 랜덤한 배열을 만들어서 알려주는 메서드 
	 * 매개변수 : 배열의 크기, 최소값과 최대값 => 
	 * 리턴타입 : 중복되지 않은 랜덤한 정수가 들어있는 배열 => 
	 * 메서드명 : createRandomArray
	 */
	
	public static int[] createRandomArray(int num1, int num2, int num3) {
		
		int temp[] = new int[num1];
		int count = 0; // 저장된 숫자의 개수
		
		while(count < num1) {
			int i = random(num2,num3);
			if(!contains(temp,count,i)) {
				temp[count] = i;
				count++;
				}
			}

		return temp;
		
	}
		
	
	/* 배열에 랜덤으로 1~9사이의 중복되지 않은 배열을 생성하고 콘솔에 출력하는 코드를 작성하세요.
	 * 단 메서드 이용
	 * day08.homework.MethodEx01, day08.homework.MethodEx02, day08.MethodEx05를 합친 예제
	 * */
	
	public static void main(String[] args) {
		
		int list[];
		
		int num1 = 9; // 배열의 개수
		int num2 = 1; // 최소값
		int num3 = 100; // 최대값
		
		list = createRandomArray(num1, num2, num3);

		System.out.println(Arrays.toString(list));
		
		
		
	}
	
}