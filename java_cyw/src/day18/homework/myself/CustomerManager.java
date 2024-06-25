package day18.homework.myself;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import program.Program;

public class CustomerManager implements Program{
	
	private List<Customer> list = new ArrayList<Customer>();
	private Scanner scan = new Scanner(System.in);
	
	private final int CUSTOMER = 1;
	private final int SEARCH = 2;
	private final int EXIT = 3;
	
	@Override
	public void run() {
		
		String fileName = "src/day18/homework/customer.txt";
		
		load(fileName);
		
		int mainmenu = CUSTOMER;
		do {
			printMainMenu();
			try {
				mainmenu = scan.nextInt();
				runMainMenu(mainmenu);
			}
			catch(InputMismatchException e) {
				System.out.println("올바른 타입을 입력하세요.");
				scan.nextLine();
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}while(mainmenu != EXIT);
		
		save(fileName);
		
	}

	public void printMainMenu() {
		
		System.out.println("=========================");
		System.out.print("메인 메뉴\r\n"
				+ "1. 회원 관리\r\n"
				+ "2. 일정 관리 \r\n"
				+ "3. 프로그램 종료 \r\n"
				+ "메뉴 선택 : ");
	}
	
	@Override
	public void printMenu() {
		
		System.out.println("=========================");
		System.out.println("회원 메뉴");
		System.out.print(
				  "1. 회원 추가\r\n"
				+ "2. 회원 수정\r\n"
				+ "3. 회원 삭제\r\n"
				+ "4. 회원 검색\r\n"
				+ "5. 이전으로\r\n"
				+ "메뉴 선택 : ");
		
	}
	
	
	public void runMainMenu(int menu) throws Exception {
		
		switch(menu) {
		
		case CUSTOMER:
			customer();
			break;
		case SEARCH:
			schedule();
			break;
		case EXIT:
			System.out.println("=========================");
			System.out.println("프로그램을 종료합니다.");
			break;
		default:
			System.out.println("=========================");
			System.out.println("잘못된 메뉴입니다. 올바른 메뉴를 선택하세요.");
		}
		
	}
	
	
	private void customer() {
		
		int menu = 0;
		
		do {
			printMenu();
			try {
				menu = scan.nextInt();
				runMenu(menu);
			}
			catch(InputMismatchException e) {
				System.out.println("=========================");
				System.out.println("올바른 타입을 입력하세요.");
				scan.nextLine();
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}while(menu != 5);
		
	}
	
	
	private void schedule() {
		
		System.out.println("=========================");
		System.out.print("ID를 입력하세요 : ");
		scan.nextLine();
		String id = scan.nextLine();
		List<Customer> tmps = 
				list.stream().filter(c->c.getID().contains(id))
				.collect(Collectors.toList());
		
		if(tmps.size() == 0) {
			System.out.println("등록되지 않은 회원입니다");
			return;
		}
		
		CalanderManager cm = new CalanderManager();
		cm.run();
		
	}

	@Override
	public void runMenu(int menu) throws Exception {
		
		switch(menu) {
		
		case 1:
			insert();
			break;
		case 2:
			update();
			break;
		case 3:
			delete();
			break;
		case 4:
			search();
			break;
		case 5:
			break;
		default:
			System.out.println("잘못된 메뉴입니다. 올바른 메뉴를 선택하세요.");
		}
		
	}
	
	

	private void insert() {
		
		System.out.println("=========================");
		System.out.println("추가할 회원 정보를 입력하세요");
		System.out.print("ID : ");
		scan.nextLine();
		String id = scan.nextLine();
		System.out.print("이름 : ");
		String name = scan.nextLine();
		
		long count = list.stream().filter(c->c.getID().equals(id)).count();
		
		if(count > 0 ) {
			System.out.println("=========================");
			System.out.println("이미 등록된 ID가 있습니다.");
			return;
		}
		
		Customer c = new Customer(id, name);
		
		list.add(c);
		
		System.out.println("=========================");
		System.out.println("회원이 추가됐습니다");
		
	}

	private void update() {
		
		System.out.println("=========================");
		System.out.print("ID를 입력하세요 : ");
		scan.nextLine();
		String id = scan.nextLine();
		
		List<Customer> tmps = 
				list.stream().filter(c->c.getID().equals(id))
							 .collect(Collectors.toList());
		
		if(tmps.size() == 0) {
			System.out.println("=========================");
			System.out.println("일치하는 회원이 없습니다.");
			return;
		}
		System.out.println("=========================");
		System.out.print("수정할 이름을 입력해주세요 : ");
		String newName = scan.nextLine();
		
		list.remove(tmps.get(0));
		
		Customer newC = new Customer(id, newName);
		
		list.add(newC);
		
		System.out.println("=========================");
		System.out.println("회원 정보를 수정했습니다");
		
	}

	private void delete() {
		
		System.out.print("ID를 입력하세요 : ");
		scan.nextLine();
		String id = scan.nextLine();
		
		List<Customer> tmps = 
				list.stream().filter(c->c.getID().equals(id))
							 .collect(Collectors.toList());
		
		if(tmps.size() == 0) {
			System.out.println("=========================");
			System.out.println("일치하는 회원이 없습니다.");
			return;
		}
		
		for(int i = 0; i<tmps.size(); i++) {
			System.out.println(i+1+". " + tmps.get(i));
		}
		//번호를 선택
		System.out.print("번호 : ");
		int index = scan.nextInt() - 1;
		
		//번호가 0미만이고 A.size()보다 크거나 같으면 안내문구 출력후 종료
		if(index < 0 || index >= tmps.size()) {
			System.out.println("잘못된 번호를 선택했습니다.");
			return;
		}
		//아니면 해당 객체를 가져옴
		Customer tmp = tmps.get(index);
		//리스트에서 해당 객체와 같은 객체를 제거
		list.remove(tmp);
		
		System.out.println("=========================");
		System.out.println("회원 정보를 삭제했습니다");
		
	}
	
	
	private void search() {
		
		System.out.println("=========================");
		System.out.print("검색(전체 목록을 보시려면 엔터를 눌러주세요) : ");
		scan.nextLine();
		String search = scan.nextLine();
		
		long count = list.stream().filter(c->c.getName().contains(search))
								  .count();
		if(count == 0) {
			System.out.println("일치하는 회원이 없습니다.");
			return;
		}
		
		list.stream().filter(c->c.getName().contains(search))
					 .forEach(c->System.out.println(c));
	
	
	}
	

	@SuppressWarnings("unchecked")
	@Override
	public void load(String fileName) {
		
		try(FileInputStream fis = new FileInputStream(fileName);
			ObjectInputStream ois = new ObjectInputStream(fis)){
			list = (List<Customer>)ois.readObject();
		} catch (Exception e) {
			System.out.println("불러오기에 실패했습니다.");
		} 
		
	}
	
	@Override
	public void save(String fileName) {
		
		try(FileOutputStream fos = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(list);
		} catch (Exception e) {
			System.out.println("저장에 실패했습니다.");
		}
		
	}

}
