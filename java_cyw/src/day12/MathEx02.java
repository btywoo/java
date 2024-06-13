package day12;

public class MathEx02 {

	public static void main(String[] args) {
		
		// 3.14를 소수점 2번째 자리에서 올림하는 코드를 작성하시오
		
		double num = 3.14;
		
		num = num * 10;
		
		num = Math.ceil(num);
		
		num = num / 10;
		
		System.out.println(num);

	}

}
