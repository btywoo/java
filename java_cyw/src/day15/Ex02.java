package day15;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02 {
	
	public static Scanner scan = new Scanner(System.in);
	static ArrayList<String> list = new ArrayList<String>();

	public static void main(String[] args) {
		
		// 다음 기능을 가진 프로그램을 작성하세요
		
		// 메뉴
		// 1. 번호 추가
		// 2. 번호 삭제
		// 3. 번호 조회 (sysout(list))로 대체
		// 4. 종료
		// 메뉴 선택 :
		
		int menu = 0 ;
		
		
		do {
			printMenu();
			
			menu = scan.nextInt();
			
			System.out.println("======================");
			runMenu(menu);
			System.out.println("======================");
			
		}while(menu != 4);
		
		
	}
	
	public static void printMenu() {
		
		System.out.println("메뉴");
		System.out.println("1. 번호 추가");
		System.out.println("2. 번호 삭제");
		System.out.println("3. 번호 조회");
		System.out.println("4. 종료");
		System.out.print("메뉴 선택 : ");
		
	}
	
	public static void runMenu(int menu) {
	
		switch(menu) {
		
		case 1:
			insert();
			break;
		case 2:
			delete();
			break;
		case 3:
			System.out.println(list);
			break;
		case 4:
			System.out.println("프로그램을 종료합니다");
			break;
		default:
			System.out.println("잘못된 메뉴입니다");
		}
		
	}

	public static void insert() {
		
		scan.nextLine();
		System.out.print("전화번호를 입력하세요 : ");
		String num1 = scan.nextLine();
		
		if(list.contains(num1)) {
			System.out.println("이미 등록된 번호입니다");
		}
		else {
			list.add(num1);
			System.out.println("등록이 완료되었습니다");
		}

	}
	
	public static void delete() {
		
		scan.nextLine();
		System.out.print("삭제할 전화번호를 입력하세요 : ");
		String num1 = scan.nextLine();
		
		if(list.contains(num1)) {
			list.remove(num1);
			System.out.println("삭제가 완료되었습니다");
		}
		else {
			System.out.println("없는 번호입니다");
		}
		
	}

}
