package day14;

import java.util.InputMismatchException;
import java.util.Scanner;

import program.Program;

public class PhoneManager implements Program {

	private Contact [] list;
	private int count;
	private Scanner scan = new Scanner(System.in);
	
	private final int INSERT = 1;
	private final int UPDATE = 2;
	private final int DELETE = 3;
	private final int SEARCH = 4;
	private final int EXIT = 5;
	
	@Override
	public void printMenu() {
		
		System.out.println("메뉴");
		System.out.println("1. 연락처 추가");
		System.out.println("2. 연락처 수정");
		System.out.println("3. 연락처 삭제");
		System.out.println("4. 연락처 검색");
		System.out.println("5. 프로그램 정료");
		System.out.print("메뉴 선택 : ");
	}

	@Override
	public void runMenu(int menu) throws Exception {
		switch(menu) {
		
		case INSERT:
			insert();
			expand();
			break;
			
		case UPDATE:
			update();
			break;
			
		case DELETE:
			delete();
			break;
			
		case SEARCH:
			search();
			break;
			
		case EXIT:
			System.out.println("프로그램을 종료합니다.");
			break;
			
		default:
			System.out.println("잘못된 메뉴입니다.");
		}
	}

	private void expand() {
		
		if(list.length > count) {
			return;
		}

		Contact[] tmp = new Contact[list.length + 10];
		System.arraycopy(list, 0, tmp, 0, list.length);
		list = tmp;
	}

	private void search() {
		
		System.out.print("검색할 이름을 작성하세요(전체 검색 : 엔터) : ");
		scan.nextLine();
		String name = scan.nextLine();
		printContact(name);
		
	}

	private void delete() {
		
		System.out.print("이름 : ");
		scan.nextLine();
		String name = scan.nextLine();
		
		if(!printContact(name)) {
			return;
		}
		
		int index = scan.nextInt() - 1;
		
		if(!checkContact(name, index)) {
			System.out.println("잘못 선택했습니다.");
			return;
		}
		
		
		count--;
		if(index != count) {
			Contact [] tmp = new Contact[list.length];
			System.arraycopy(tmp, index + 1, list, index, count - index );
		}
		
		list[count] = null;
		System.out.println("연락처를 삭제했습니다.");
		
	}

	private void update() throws Exception {
		
		scan.nextLine();
		System.out.print("이름 : ");
		String name = scan.nextLine();
		if(!printContact(name)) {
			return;
		}
		
		System.out.print("번호 선택 : ");
		int index = scan.nextInt() - 1;
		boolean res = checkContact(name, index);
		if(!res) {
			System.out.println("잘못 선택했습니다.");
			return;
		}
		
		scan.nextLine();
		System.out.print("이름 : ");
		String newName = scan.nextLine();
		System.out.print("번호 : ");
		String newNumber = scan.nextLine();
		
		Contact contact = new Contact(newName, newNumber);
		
		
		if(indexOf(index,contact) >= 0) {
			System.out.println("이미 등록된 번호입니다.");
			return;
		}
		list[index] = contact;
		
	}

	private boolean checkContact(String name, int index) {
		
		if(list == null || count == 0) {
			return false;
		}
		if(index < 0 || index >= count) {
			return false;
		}
		return list[index].getName().contains(name);
	}

	private boolean printContact(String name) {
		
		if(list == null || count == 0) {
			System.out.println("등록된 연락처가 없습니다.");
			return false;
		}
		
		int sameCount = 0;
		for(int i = 0; i<count; i++) {
			if(list[i].getName().contains(name)) {
				System.out.println(i+1+". "+list[i].toString());
				sameCount++;
			}
		}
		
		if(sameCount == 0) {
			System.out.println("일치하는 연락처가 없습니다.");
			return false;
		}
		
		return true;
	}

	private void insert() throws Exception {
		
		scan.nextLine();
		System.out.print("이름 : ");
		String name = scan.nextLine();
		System.out.print("번호 : ");
		String number = scan.nextLine();
		
		Contact contact = new Contact(name, number);
		
		int index = indexOf(contact);
		
		if(index >= 0) {
			System.out.println("이미 등록된 번호입니다.");
			return;
		}
		
		list[count] = contact;
		count++;
		
		System.out.println("등록이 완료되었습니다.");		
	}

	private int indexOf(Contact contact) {
		return indexOf(-1, contact);
	}

	private int indexOf(int index, Contact contact) {
		if(list == null || count == 0) {
			return -1;
		}
		for(int i = 0 ; i < count; i++) {
			if(i == index) {
				continue;
			}
			if(list[i].equals(contact)) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public void run() {
		
		String fileName = null;

		load(fileName);
		int menu = EXIT + 1;
		do {
			printMenu();
			
			try {
				menu = scan.nextInt();
				runMenu(menu);
			}
			catch(InputMismatchException e) {
				System.out.println("메뉴를 잘못 입력 했습니다.");
				scan.next();
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}while(menu != EXIT);
		
		//저장하기
		//save(fileName);
	}
	
	@Override
	public void load(String fileName) {
		if(fileName == null) {
			System.out.println("불러올 파일이 없습니다.");
			list = new Contact[10];
			return;
		}
		//추구 파일 입력출력을 배우면 불러오는 기능을 구현
	}
}