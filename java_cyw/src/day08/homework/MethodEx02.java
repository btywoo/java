package day08.homework;

public class MethodEx02 {
	
	/**기능 : 배열의 크기와 최소값과 최대값이 주어졌을 때, 랜덤한 배열을 만들어서 알려주는 메서드
	 * 매개변수 : 배열의 크기, 최소값과 최대값
	 * 리턴타입 : 랜덤한 정수가 들어가있는 배열
	 * 메서드명 : creatRandomArray
	 * */

	public static int[] createRandomArray(int num1, int num2, int num3) {
		
		int temp[] = new int[num1];
		for(int i = 0; i<temp.length; i++) {
			temp[i] = random(num2, num3);
		}
		
		return temp;
		
	}
	
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
	
	/* 1~9사이의 랜덤한 수를 배열에 저장하여 콘솔에 출력하는 코드를 작성하세요.
	 * 메서드 이용
	 * */
	
	public static void main(String[] args) {
		
		int list[];
		
		int num1 = 10;
		int num2 = 1;
		int num3 = 9;
		
		list = createRandomArray(num1, num2, num3);
		
		for(int i = 0; i<list.length; i++) {
			System.out.print(list[i] + ", ");
		}
		
	}

}