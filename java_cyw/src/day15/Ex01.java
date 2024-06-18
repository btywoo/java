package day15;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		// 전화번호를 5번 입력받아 리스트에 저장하는 코드를 작성하시오
		// 단, 전화번호는 올바르게 입력했다고 가정. (정규표현식 사용하지 않아도 됨)
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i = 0; i<5; i++) {
			
			System.out.print("전화번호를 입력하세요 : ");
			list.add(scan.nextLine());
			
			/*
			 * System.out.print("번호 : ");
			 * list.add(scan.next());
			 */
		}
		
		System.out.println(list);
		
		// 삭제할 전화 번호를 입력 받아 삭제하는 코드를 작성하세요
		
		System.out.print("삭제할 전화번호를 입력하세요 : ");
		
		if(list.remove(scan.nextLine())){
			System.out.println("번호를 삭제했습니다");
		}
		else {
			System.out.println("번호를 삭제하지 못했습니다");
		}
		
		System.out.println(list);

	}

}
