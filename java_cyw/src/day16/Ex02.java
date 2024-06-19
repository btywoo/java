package day16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Ex02 {

	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// UP DOWN 게임에 기록을 저장하는 기능을 추가
		// 최대 5등까지 저장하며, 먼저 등록된 순으로 저장
		// 아이디를 입력 받아 저장
		
		// 메뉴
		// 1. 플레이
		// 2. 기록 확인
		// 3. 종료
		// 메뉴 선택 :
		
		
		int menu;
		
		List<Record> list = new ArrayList<Record>();
		
		do {
			
			printMenu();
			menu = scan.nextInt();
			runMenu(menu, list);
			
		}
		while(menu != 3);
	}
	

	public static void printMenu() {
		
		System.out.println(
				"메뉴\r\n"
				+ "1. 플레이\r\n"
				+ "2. 기록 확인\r\n"
				+ "3. 종료");
		
		System.out.print("메뉴 선택 : ");
		
	}
	
	private static void runMenu(int menu, List<Record> list) {
		
		switch(menu) {
		
		case 1 :
			int count = play();
			record(list, count);
			break;
		case 2 :
			printRecord(list);
			break;
		case 3 :
			System.out.println("프로그램을 종료합니다");
			break;
		default :
			System.out.println("잘못된 메뉴입니다");
		}
	}





	private static int play() {
		
		System.out.println("게임 플레이입니다");
		
		int min = 1, max = 100;
		int random = Ex01.random(min,max);
		
		System.out.println(random);
		
		int num, count = 0;
		do {
			System.out.print("입력 : ");
			num = scan.nextInt();
			Ex01.printResult(random, num);
			count++;
		}
		while(random != num);
		
		return count;
		
	}
	
	
	private static void record(List<Record> list, int count) {
	
		if(list.size() < 5) {
			System.out.println("아이디를 입력하세요 : ");
			String ID = scan.next();
			list.add(new Record(ID, count));
			Collections.sort(list);
			return;
		}
		
		final int MAX_RECORD_COUNT = 5;
		
		if(count < list.get(MAX_RECORD_COUNT - 1).getCount()) {
			System.out.println("아이디를 입력하세요 : ");
			String ID = scan.next();
			Record record = new Record(ID, count);
			list.set(MAX_RECORD_COUNT - 1, record);
			Collections.sort(list);
		}
	}

	
	private static void printRecord(List<Record> list) {
		
		if(list.size() == 0) {
			System.out.println("등록된 기록이 없습니다");
			return;
		}
		
		
		for(int i = 0; i<list.size(); i++) {
			Record tmp = list.get(i);
			System.out.println(i+1 + "등 : " + tmp.getID() + ", " + tmp.getCount() + "회");
		}
		
	}

}

@Data
@AllArgsConstructor
class Record implements Comparable<Record>{
	
	private String ID;
	private int count;
	
	
	@Override
	public int compareTo(Record o) {
		return count - o.count;
	}
	
	
	
}


