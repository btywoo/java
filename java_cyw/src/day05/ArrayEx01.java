package day05;

public class ArrayEx01 {

	public static void main(String[] args) {


		// 5명의 학생 성적을 저장하기 위한 변수를 선언하시오

		int sc1 = 0, sc2 = 0, sc3 = 0, sc4 = 0, sc5 = 0;
		// 지역 변수
		// 자동으로 초기화되지 않음



		// 5명의 학생 성적을 저장하기 위한 배열 생성

		int[] scores = new int[5];
		int scores2 [] = new int[5];
		// 5개짜리 배열을 만들어 1,2,3,4,5 순서대로 초기화

		int scores3 [] = new int[] {1,2,3,4,5};
		// 자동으로 자료형에 맞는 초기화가 된다
		// 배열은 참조형변수. 



		// scores[0] = 1;
		// scores[1] = 2;
		// scores[2] = 3;
		// scores[3] = 4;
		// scores[4] = 5;


		for(int i = 0; i < 5 ; i++) {
			scores[i] = i + 1;
			System.out.println(i); // i 출력 > scores에 저장된 0,1,2,3,4 출력
			}

		for(int i = 0; i < 5; i++) {
			System.out.println(scores[i]); // scores[i] 출력 > i + 1의 값 출력
		}


		// System.out.println(scores[0]);
		// System.out.println(scores[1]);
		// System.out.println(scores[2]);
		// System.out.println(scores[3]);
		// System.out.println(scores[4]);
		
		System.out.println(sc1 + sc2 + sc3 + sc4 + sc5);
		
		for(int i = 0; i<scores3.length; i++) {
			System.out.print(scores2[i] + " ");
		}
		
		System.out.println();
		
		for(int i = 0; i<scores3.length; i++) {
			System.out.print(scores3[i] + " ");
		}
	}

}