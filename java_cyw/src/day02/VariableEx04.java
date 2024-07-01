package day02;

public class VariableEx04 {

	public static void main(String[] args) {

		int Num = 0, num = 0; 
		//Num보다 num 추천

		int totalcount = 0, totalCount = 0; 
		//totalcount보다 totalCount 추천 (카멜표기법)

		final int maxNum = 10, MAX_NUM = 10; 
		//상수는 대문자로 표현하는 걸 추천
		// int MAX_NUM = 20; // 상수는 값을 더 수정할 수 없다

		int age = 0, a = 0; 
		//나이를 의미하는 변수로 age 추천, 변수명은 의미 전달이 잘 되어야 한다
		
		System.out.println(Num + num + totalcount + totalCount + maxNum + MAX_NUM + age + a);

	}

}