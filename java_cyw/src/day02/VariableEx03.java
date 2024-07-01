package day02;

public class VariableEx03 {

	public static void main(String[] args) {

		int num = 0;
		int NUM = 0, Num = 0 , nUm = 0, nuM = 0; // 대소문자 구별로 사용 가능 (변수 4개 생성)

		// int char, class, public; // 예약어 사용 불가

		int _num = 0, n_num = 0, $num = 0;
		// int n um, #num; > 특수 문자는 _와 $만 가능

		int num1 = 0;
		// int 1num; > 숫자는 앞에 올 수 없음

		// int num; > 중복

		
		
		
		for(int i = 0; i<10; i++) {
			System.out.println(num + NUM + Num + nUm + nuM);
		}
		for(int i = 0; i<10; i++) {
			System.out.println(_num + n_num + $num);
		}
		System.out.println(num1);

	}

}