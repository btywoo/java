package day24;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		boolean res = true;
		
		while(res) {
			System.out.println("문자열 입력 : ");
			String str = scan.next();
			if(str.equals("exit")) {
				break;
			}
			else {
				System.out.println(str);
			}
		}

	}

}
