package day07;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {

		// 최대 단어 2개를 저장할 수 있는 배열을 이용하여
		// 원하는 단어를 입력하면 단어를 배열에 추가하는 코드를 작성하시오

		// 단어입력 (종료:-1) : cat
		// 단어를 추가했습니다

		// 단어입력 (종료:-1) : dog
		// 단어를 추가했습니다

		// 단어입력 (종료:-1) : good
		// 단어를 추가하지 못했습니다

		// 단어입력 (종료:-1) : -1

		// 종료합니다

		String[] list = new String[2];

		Scanner scan = new Scanner(System.in);
		String tmp;

		int i = 0;

		while(true){
			System.out.println("단어입력 (종료:-1) : ");
			tmp = scan.next();

			if(tmp.equals("-1")) {
				System.out.println("종료합니다");
				break;
			}

			if(i == list.length) {
				System.out.println("단어를 추가하지 못했습니다");
			}
			else {
				list[i++] = tmp;
				System.out.println("단어를 추가했습니다");

			}


		}


	}

}