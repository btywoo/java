package day08.homework;

public class MethodEx01_01 {
	
	
	public static int[] creatArray() {
		
		int temp[] = new int [4];
		for(int i = 0; i<temp.length;i++) {
			temp[i] = i;
		}
		
		return temp;
	}

	public static void main(String[] args) {
		
		// 정수 n을 입력받아 입력받은 n 크기를 가지는 배열을 생성하는 코드를 작성하세요.
		
		int intArray[];
		intArray = creatArray();
		
		for(int i = 0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		

	}

}

	