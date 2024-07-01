package account.mine;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import program.Program;

public class HouseholdManager implements Program{
	
	private List<Income> income = new ArrayList<Income>();
	private List<Spend> spend = new ArrayList<Spend>();
	private List<String> icmlist = new ArrayList<String>();
	private List<String> spdlist = new ArrayList<String>();
	
	private Scanner scan = new Scanner(System.in);
	
	private String fileName ="src/account/household.txt";

	@Override
	public void printMenu() {
		
		System.out.print(
				  "메뉴\n"
				+ "1. 내역 입력\n"
				+ "2. 내역 수정\n"
				+ "3. 내역 삭제\n"
				+ "4. 내역 조회\n"
				+ "5. 종료\n"
				+ "메뉴 선택 : ");
		
	}

	@Override
	public void run() {
		
		int menu;
				
		load(fileName);
		
		do {
			printMenu();
			menu = scan.nextInt();
			try {
				runMenu(menu);
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		while(menu != 5);
		
		save(fileName);
	}
	
	@Override
	public void save(String fileName) {
		
		try(FileOutputStream fos = new FileOutputStream(fileName);
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			
			oos.writeObject(income);
			oos.writeObject(spend);
			oos.writeObject(icmlist);
			oos.writeObject(spdlist);
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void load(String fileName) {
		
		try(FileInputStream fis = new FileInputStream(fileName);
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			
			income = (List<Income>) ois.readObject();
			spend = (List<Spend>) ois.readObject();
			icmlist = (List<String>) ois.readObject();
			spdlist = (List<String>) ois.readObject();
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		} 
		
	}
	
	@Override
	public void runMenu(int menu) throws Exception {
		
		switch(menu) {
		
			case 1 :
				insert();
				break;
			case 2 :
				update();
				break;
			case 3 :
				delete();
				break;
			case 4 :
				search();
				break;
			case 5 :
				exit();
				break;
			default :
				defaultPrint();
		
		}
		
	}
	

	private void insert() {
		
		String date = insertDate();
		
		if(date == null) {
			System.out.println("잘못된 날짜 형식입니다");
			return;
		}
		
		System.out.println("수입 / 지출 : ");
		String str = scan.nextLine();
		
		switch(str) {
		
		case "수입" : 
			
			Income icm = income();
			
			if(income.contains(icm)) {
				System.out.println("이미 등록된 내역입니다");
			}
			
			income.add(icm);
			
			System.out.println("내역이 등록되었습니다");
			
			break;
			
		case "지출" : 
			
			Spend spd = spend();
			
			if(spend.contains(spd)) {
				System.out.println("이미 등록된 내역입니다");
			}
			
			spend.add(spd);
			
			System.out.println("내역이 등록되었습니다");
			
			break;
			
		default : 
			defaultPrint();
		
		}
		
	}
	
	private String insertDate() {
		
		System.out.println("=========================");
		System.out.print("날짜(yyyy-MM-dd) : ");
		scan.nextLine();
		String date = scan.nextLine();
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			format.parse(date);
		} 
		catch (ParseException e) {
			return null;
		}	
		
		return date;
		
	}
	
	private void printIncome() {
		
		String option1 = "월급";
		String option2 = "용돈";
		String option3 = "부수입";
		
		icmlist.add(option1);
		icmlist.add(option2);
		icmlist.add(option3);
		
		System.out.println("분류 목록");
		System.out.println(option1);
		System.out.println(option2);
		System.out.println(option3);
		System.out.print("분류 : ");
		
	}
	
	private void printSpend() {
		
		String option1 = "식비";
		String option2 = "교통비";
		String option3 = "기타";
		
		spdlist.add(option1);
		spdlist.add(option2);
		spdlist.add(option3);
		
		System.out.println("분류 목록");
		System.out.println(option1);
		System.out.println(option2);
		System.out.println(option3);
		System.out.print("분류 : ");
		
	}
	
	private Income income() {
		
		String date = null;
		
		printIncome();
		String option = scan.nextLine();
		
		if(!icmlist.contains(option)) {
			System.out.println("분류에 없는 목록입니다");
			return null;
		}
		
		System.out.print("금액 : ");
		int money = scan.nextInt();
		
		System.out.print("내용 : ");
		scan.nextLine();
		String account = scan.nextLine();
		
		return new Income(date, option, money, account);
		
	}

	private Spend spend() {
		
		String date = null;
		
		printSpend();
		String option = scan.nextLine();
		
		if(!spdlist.contains(option)) {
			System.out.println("분류에 없는 목록입니다");
			return null;
		}
		
		System.out.print("금액 : ");
		int money = scan.nextInt();
		
		System.out.print("내용 : ");
		scan.nextLine();
		String account = scan.nextLine();
		
		return new Spend(date, option, money, account);
		
	}
	
	
	private void update() {
		
	}

	private void delete() {
		
	}

	private void search() {
		
	}

	private void exit() {
		System.out.println("프로그램을 종료합니다");
	}

	private void defaultPrint() {
		System.out.println("잘못된 입력입니다");
	}
	
}
