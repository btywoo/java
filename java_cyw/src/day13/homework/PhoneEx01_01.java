package day13.homework;

import java.util.Scanner;

public class PhoneEx01_01 {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int menu = 0;
		final int NUMBER_MAX = 10;
		phoneNumber [] list = new phoneNumber[NUMBER_MAX];
		int numberCount = 0;
		
		do {
			
			printMenu();
			menu = scan.nextInt();
			
			switch(menu) {
			
			case 1:	
				System.out.println("연락처를 등록합니다");	
				insertNumber(list, numberCount);
				break;
				
			case 2:	
				break;
				
			case 3:	
				break;
				
			case 4:	
				break;
				
			case 5 :
				System.out.println("프로그램을 종료합니다");
				break;
				
			default :
				System.out.println("잘못된 메뉴입니다");
				
				}
			
		}
		while(menu != 5);
		

	}
	
	
	public static void printMenu() {
		
		System.out.println("메뉴");
		System.out.println("1. 연락처 추가");
		System.out.println("2. 연락처 수정");
		System.out.println("3. 연락처 삭제");
		System.out.println("4. 연락처 검색");
		System.out.println("5. 프로그램 종료");
		System.out.print("메뉴 선택 : ");
		
	}

	public static void runMenu(int num) {
		
		int menu = 0;
		
		switch(menu) {
		
		case 1:	
			
			break;
			
		case 2:	
			break;
			
		case 3:	
			break;
			
		case 4:	
			break;
			
		case 5 :
			System.out.println("프로그램을 종료합니다");
			break;
			
		default :
			System.out.println("잘못된 메뉴입니다");
			
			}
		
	}
	
	public static phoneNumber inputNumber() {
		
		System.out.println("===================");
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.print("번호 : ");
		String number = scan.next();
		System.out.println("===================");
		
		phoneNumber tmp = new phoneNumber(name,number);
		
		return tmp;
	}
	
	public static void insertNumber(phoneNumber [] list, int numberCount) {
		
		phoneNumber tmp = inputNumber();
		
		list[numberCount] = tmp; 
		
		int count = 0;
		
		for(int i = 0; i < numberCount; i++) {
			if(list[i].getNumber().equals(tmp)) {
				System.out.println("===================");
				System.out.print("이미 등록된 번호입니다");
				System.out.println("===================");
				count++;
			}
		}
		
		if(count == 0) {
			System.out.println("===================");
			System.out.print("등록이 완료되었습니다");
			System.out.println("===================");
			return;
		}
		
	}
		
		
	
	
}






class phoneNumber{
	
	private String number, name;
	
	public phoneNumber(String name, String number) {
		super();
		this.name = name;
		this.number = number;
	}
	
	public void print() {
		System.out.println("========================");
		System.out.println(name + number);
		System.out.println("========================");
	}

	
	
	
	
	
	
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}