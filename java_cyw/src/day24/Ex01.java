package day24;

public class Ex01 {

	public static void main(String[] args) {
		
		int num1 = 4;
		double num2 = num1;
		
		/*
		 * 원인 : num2, num3 유형이 다름
		 * 해결 방법 : (int)num2
		 * 형변환
		 */
		
		int num3 = (int)num2;
		
		System.out.println(num3);

	}

}
