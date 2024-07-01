package day03;

public class SwitchEx01 {

	public static void main(String[] args) {

		// switch문을 이용한 홀짝 예제

		int num = 3;

		switch(num % 2) {
		case 0 :
			System.out.println("짝수");
			break;
		default :
			System.out.println("홀수");
		}

	}

}