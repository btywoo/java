package day18.homework.myself;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import program.Program;

public class CalanderManager implements Program{
	
	private List<Calander> list = new ArrayList<Calander>();
	private Scanner scan = new Scanner(System.in);
	
	private final int INSERT = 1;
	private final int UPDATE = 2;
	private final int DELETE = 3;
	private final int SEARCH = 4;
	private final int EXIT = 5;

	@Override
	public void printMenu() {
		
		System.out.println("=========================");
		System.out.print("일정 메뉴\r\n"
				+ "1. 일정 추가\r\n"
				+ "2. 일정 수정\r\n"
				+ "3. 일정 삭제\r\n"
				+ "4. 일정 확인\r\n"
				+ "5. 이전으로\r\n"
				+ "메뉴 선택 : ");
		
	}
	
	@Override
	public void run() {
		
		String fileName = "src/day18/homework/customerSchedule.txt";
		
		load(fileName);
		
		int menu = INSERT;
		do {
			printMenu();
			try {
				menu = scan.nextInt();
				runMenu(menu);
			}
			catch(InputMismatchException e) {
				System.out.println("올바른 타입을 입력하세요.");
				scan.nextLine();
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}while(menu != EXIT);
		
		save(fileName);
		
	}

	@Override
	public void runMenu(int menu) throws Exception {
		
		switch(menu) {
		case INSERT:
			insert();
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
			break;
		default:
			System.out.println("=========================");
			System.out.println("잘못된 메뉴입니다. 올바른 메뉴를 선택하세요.");
		}
		
	}

	private void insert() {
		
		System.out.println("=========================");
		System.out.print("날짜 입력(yyyy-MM-dd hh:mm) : ");
		scan.nextLine();
		String date = scan.nextLine();
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm");
		
		try {
			format.parse(date);
		} 
		catch (ParseException e) {
			System.out.println("잘못된 날짜 형식입니다");
		}	
		
		System.out.print("일정 : ");
		String schedule = scan.nextLine();
		System.out.print("상세 : ");
		String details = scan.nextLine();
		
		
		Calander c = new Calander(date, schedule, details);
		list.add(c);
		
		System.out.println("=========================");
		System.out.println("일정이 추가 되었습니다");
		
	}

	private void update() {
		
		System.out.println("=========================");
		System.out.print("날짜 입력(yyyy-MM-dd) : ");
		scan.nextLine();
		String date = scan.nextLine();
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			format.parse(date);
		} catch (ParseException e) {
			System.out.println("잘못된 날짜 형식입니다");
		}	
		
		List<Calander> tmps = 
				list.stream().filter(c->c.getDate().contains(date))
							 .collect(Collectors.toList());
		
		if(tmps.size() == 0) {
			System.out.println("해당 날짜의 일정이 없습니다.");
			return;
		}
		
		for(int i = 0; i<tmps.size(); i++) {
			System.out.println(i+1+". " + tmps.get(i));
		}
		
		System.out.print("수정할 일정 : ");
		int index = scan.nextInt() - 1;
		
		if(index < 0 || index >= tmps.size()) {
			System.out.println("해당 번호가 없습니다.");
			return;
		}
		
		Calander tmp = tmps.get(index);
		
		System.out.println("=========================");
		System.out.print("날짜 입력(yyyy-MM-dd hh:mm) : ");
		scan.nextLine();
		String newDate = scan.nextLine();
		
		SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd hh:mm");
		
		try {
			format2.parse(newDate);
		} catch (ParseException e) {
			System.out.println("잘못된 날짜 형식입니다");
		}	
		
		
		System.out.print("일정 : ");
		String newSchedule = scan.nextLine();
		System.out.print("상세 : ");
		String newDetails = scan.nextLine();
		
		list.remove(tmp);
		
		Calander newC = new Calander(newDate, newSchedule, newDetails);
		list.add(newC);
		
		System.out.println("=========================");
		System.out.println("수정이 완료되었습니다");
		
	}

	private void delete() {
		
		System.out.println("=========================");
		System.out.print("날짜 입력(yyyy-MM-dd) : ");
		scan.nextLine();
		String date = scan.nextLine();
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			format.parse(date);
		} catch (ParseException e) {
			System.out.println("잘못된 날짜 형식입니다");
		}	
		
		
		List<Calander> tmps = 
				list.stream().filter(c->c.getDate().contains(date))
							 .collect(Collectors.toList());
		
		if(tmps.size() == 0) {
			System.out.println("해당 날짜의 일정이 없습니다.");
			return;
		}
		
		for(int i = 0; i<tmps.size(); i++) {
			System.out.println(i+1+". " + tmps.get(i));
		}
		
		System.out.print("삭제할 일정 : ");
		int index = scan.nextInt() - 1;
		
		if(index < 0 || index >= tmps.size()) {
			System.out.println("해당 번호가 없습니다.");
			return;
		}
		
		Calander tmp = tmps.get(index);
		
		list.remove(tmp);
		
		System.out.println("=========================");
		System.out.println("일정이 삭제되었습니다");
		
	}

	private void search() {
		
		System.out.println("=========================");
		System.out.print("날짜(yyyy-MM-dd) (전체 일정을 보시려면 엔터를 눌러주세요): ");
		scan.nextLine();
		String date = scan.nextLine();
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			
			List<Calander> tmps;
			
			if(!date.isBlank()) {
				format.parse(date);
				
				tmps = list.stream().filter(c->c.getDate().contains(date))
									.collect(Collectors.toList());
				
				if(tmps.size() == 0) {
					System.out.println("일치하는 일정이 없습니다.");
					return;
				}
			}
			else {
				tmps = list.stream().filter(c->c.getDate().contains(date))
									.collect(Collectors.toList());
			}
			
			for(int i = 0; i<tmps.size(); i++) {
				System.out.println(i+1+". " + tmps.get(i));
			}
		} 
		catch (ParseException e) {
			System.out.println("잘못된 날짜 형식입니다");
		}	
		
		
		System.out.println("=========================");
		System.out.println("메뉴로 가시려면 엔터를 입력하세요");
		scan.nextLine();
		
		
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public void load(String fileName) {
		
		try(FileInputStream fis = new FileInputStream(fileName);
				ObjectInputStream ois = new ObjectInputStream(fis)){
			list = (List<Calander>)ois.readObject();
		} 
		catch (Exception e) {
			System.out.println("불러오기에 실패했습니다.");
		} 
		
	}
	
	@Override
	public void save(String fileName) {
		
		try(FileOutputStream fos = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(list);
		} 
		catch (Exception e) {
			System.out.println("저장에 실패했습니다.");
		}
		
	}
	
}
