package student;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import program.Program;

public class StudentManager implements Program {
	
	private List<Student> list = new ArrayList<Student>();
	private List<String> subjectList = new ArrayList<String>();
	private Scanner scan = new Scanner(System.in);
	
	private String fileName ="src/student/student.txt";
	
	@Override
	public void printMenu() {
		
		System.out.print(
				  "메뉴\n"
				+ "1. 학생 관리\n"
				+ "2. 과목 관리\n"
				+ "3. 종료\n"
				+ "메뉴 선택 : ");
	} 


	@Override
	public void run() {
		
		int menu;
		
		load(fileName);
		
		do {
			
			printMenu();
			
			menu = nextInt();
			
			try {
				runMenu(menu);
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
			
			
		}
		while(menu != 3);
		
		save(fileName);
		
	}
	
	@Override
	public void save(String fileName) {
		
		try(FileOutputStream fos = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			
				oos.writeObject(list);
				oos.writeObject(subjectList);
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
			
			list = (List<Student>) ois.readObject();
			subjectList = (List<String>) ois.readObject();
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		} 
	}


	public int nextInt() {
		
		try {
			return scan.nextInt();
		}
		catch(InputMismatchException e) {
			scan.nextLine(); 			// 잘못 입력한 값을 입력 버퍼에 비워줌
			return Integer.MIN_VALUE;	// int의 가장 작은 수를 리턴
		}
		
	}

	@Override
	public void runMenu(int menu) throws Exception {
		
		switch(menu) {
		
		case 1 :
			student();
			break;
		case 2 :
			subject();
			break;
		case 3 :
			exit();
			break;
		default :
		
		}
	}


	
	
	private void student() {
		
		int menu;
		
		do {
			printStudentMenu();
			menu = nextInt();
			runStudentMenu(menu);
		}
		while(menu != 5);
	}


	private void printStudentMenu() {
		
		System.out.print(
				  "학생 관리 메뉴\n"
				+ "1. 학생 추가\n"
				+ "2. 학생 수정\n"
				+ "3. 학생 삭제\n"
				+ "4. 학생 조회\n"
				+ "5. 이전으로\n"
				+ "메뉴 선택 : ");
		
	}


	private void runStudentMenu(int menu) {
		
		switch(menu) {
		
			case 1 :
				studentInsert();
				break;
			case 2 :
				studentUpdate();
				break;
			case 3 :
				studentDelete();
				break;
			case 4 :
				studentSearch();
				break;
			case 5 :
				prev();
				break;
			default :
				defaultPrint();
				
		}
		
		
	}




	private void studentInsert() {
		
		Student std = inputStudentExpand();
		
		if(list.contains(std)) {
			System.out.println("이미 등록된 학생이 있습니다");
			return;
		}
		
		list.add(std);
		
		System.out.println("학생이 추가되었습니다");
	}
	
	public Student inputStudent() {
		
		System.out.println("학생 정보를 입력하세요");
		
		System.out.print("학년 : ");
		int grade = scan.nextInt();
		
		System.out.print("반 : ");
		int classNum = scan.nextInt();
		
		System.out.print("번호 : ");
		int num = scan.nextInt();
	
		return new Student(grade, classNum, num, " ");
		
	}
	
	public Student inputStudentExpand() {
		
		Student std = inputStudent();
		
		System.out.print("이름 : ");
		scan.nextLine();
		String name = scan.nextLine();
		
		std.setName(name);
		
		return std;
	}


	private void studentUpdate() {
		
		int menu;
		
		do {
			printStudentUpdateMenu();
			menu = scan.nextInt();
			runStudentUpdateMenu(menu);
		}
		while(menu != 5);
	}


	private void printStudentUpdateMenu() {
		
		System.out.print(
				  "학생 수정 메뉴\n"
				+ "1. 학생 정보 수정\n"
				+ "2. 성적 추가\n"
				+ "3. 성적 수정\n"
				+ "4. 성적 삭제\n"
				+ "5. 이전으로"
				+ "메뉴 선택 : ");
	}


	private void runStudentUpdateMenu(int menu) {
		
		switch(menu) {
		
		case 1 :
			studentInfoUpdate();
			break;
		case 2 :
			scoreInsert();
			break;
		case 3 :
			scoreUpdate();
			break;
		case 4 :
			scoreDelete();
			break;
		case 5 :
			prev();
			break;
		default :
			defaultPrint();
		}
	
		
	}


	private void studentInfoUpdate() {
		
		Student std = inputStudent();
		
		int index = list.indexOf(std);
		
		if(index < 0) {
			std = null;
		}
		else {
			std = list.get(index);
		}
		
		if(std == null) {
			System.out.println("일치하는 학생이 없습니다");
			return;
		}
		
		Student newStd = inputStudentExpand();
		
		std = list.remove(index);
		
		if(list.contains(newStd)) {
			System.out.println("이미 등록된 학생 정보로 수정할 수 없습니다");
			list.add(std);
			return;
		}
		
		std.update(newStd);
		list.add(std);
		
	}


	private void scoreInsert() {
		
		if(subjectList.size() == 0) {
			System.out.println("등록된 과목이 없어 성적을 추가할 수 없습니다\n과목을 등록해주세요");
			return;
		}
		
		Student std = inputStudent();
		
		int index = list.indexOf(std);
		
		if(index < 0) {
			System.out.println("등록되지 않은 학생입니다");
		}
		
		std = list.get(index);
		
		subSearch();
		
		Subject sub = inputScore();
		
		if(!subjectList.contains(sub.getName())) {
			System.out.println("등록되지 않은 과목이라 성적을 추가할 수 없습니다");
			return;
		}
		
		List<Subject> subList = std.getSubject();
		
		if(subList.contains(sub)) {
			System.out.println("과목 성적이 이미 등록되어 있습니다");
			return;
		}
		
		subList.add(sub);
		
		System.out.println("학생 성적을 등록했습니다");
		
	}


	private Subject inputScore() {
		
		System.out.println("학생 정보를 입력하세요");
		
		Subject sub = inputScoreBase();
		
		System.out.print("중간 시험 점수 : ");
		int midterm = scan.nextInt();
		
		System.out.print("기말 시험 점수 : ");
		int finalExam = scan.nextInt();
		
		System.out.print("수행평가 점수 : ");
		int perAss = scan.nextInt();
		
		sub.setMidterm(midterm);
		sub.setFinalExam(finalExam);
		sub.setPerAss(perAss);
	
		return sub;
	}
	
	private Subject inputScoreBase() {
		
		System.out.print("과목명 : ");
		scan.nextLine();
		String name = scan.nextLine();
		
		System.out.print("학년 : ");
		int grade = scan.nextInt();
		
		System.out.print("학기 : ");
		int semester = scan.nextInt();
		
		return new Subject(name, grade, semester, 0, 0, 0);
	}
	
	private void scoreUpdate() {
		
		if(subjectList.size() == 0) {
			System.out.println("등록된 과목이 없어 성적을 수정할 수 없습니다\n과목을 등록해주세요");
			return;
		}
		
		Student std = inputStudent();
		
		int index = list.indexOf(std);
		
		if(index < 0) {
			System.out.println("등록되지 않은 학생입니다");
		}
		
		std = list.get(index);
		
		List<Subject> subject = std.getSubject();
		
		System.out.println("수정할 성적을 입력해주세요");
		
		Subject sub = inputScoreBase();
		
		if(!subjectList.contains(sub.getName())) {
			System.out.println("등록되지 않은 과목이라 성적을 수정할 수 없습니다");
			return;
		}
		
		if(!subject.contains(sub)) {
			System.out.println("성적이 등록되지 않았습니다");
			return;
		}
		
		subject.remove(sub);
		
		System.out.print("수정된 중간 시험 점수 : ");
		int midterm = scan.nextInt();
		
		System.out.print("수정된 기말 시험 점수 : ");
		int finalExam = scan.nextInt();
		
		System.out.print("수정된 수행평가 점수 : ");
		int perAss = scan.nextInt();
		
		sub.setMidterm(midterm);
		sub.setFinalExam(finalExam);
		sub.setPerAss(perAss);
		
		subject.add(sub);
		
		System.out.println("성적을 수정하였습니다");
		
	}


	private void scoreDelete() {
		
		if(subjectList.size() == 0) {
			System.out.println("등록된 과목이 없어 성적을 삭제할 수 없습니다\n과목을 등록해주세요");
			return;
		}
		
		Student std = inputStudent();
		
		int index = list.indexOf(std);
		
		if(index < 0) {
			System.out.println("등록되지 않은 학생입니다");
		}
		
		std = list.get(index);
		
		List<Subject> subject = std.getSubject();
		
		System.out.println("삭제할 성적을 입력해주세요");
		
		Subject sub = inputScoreBase();
		
		if(!subjectList.contains(sub.getName())) {
			System.out.println("등록되지 않은 성적이라 성적을 삭제할 수 없습니다");
			return;
		}
		
		if(subject.remove(sub)) {
			System.out.println("성적을 삭제하였습니다");
			return;
		}
		
		System.out.println("일치하는 성적이 없습니다");
		
	}


	private void studentDelete() {
		
		Student std = inputStudent();
		
		if(list.remove(std)) {
			System.out.println("삭제가 완료되었습니다");
			System.out.println(list);
			return;
		}
		
		System.out.println("일치하는 학생이 없습니다");
		
	}


	private void studentSearch() {
		
		Student std = inputStudent();
		
		int index = list.indexOf(std);
		
		if(index < 0) {
			std = null;
		}
		else {
			std = list.get(index);
		}
		
		if(std == null) {
			System.out.println("일치하는 학생이 없습니다");
			return;
		}
		
		std.print();
		
	}


	private void prev() {
		System.out.println("이전으로 돌아갑니다");
	}

	private void defaultPrint() {
		System.out.println("올바른 메뉴를 선택하세요");
	}

	private void subject() {
		
		int menu;
		
		do {
			printSubjectMenu();
			menu = scan.nextInt();
			runSubjectMenu(menu);
		}
		while(menu != 5);
		
	}


	private void printSubjectMenu() {
		
		System.out.println(
				  "과목 관리 메뉴\n"
				+ "1. 과목 추가\n"
				+ "2. 과목 수정\n"
				+ "3. 과목 삭제\n"
				+ "4. 과목 확인\n"
				+ "5. 이전으로\n"
				+ "메뉴 선택 : ");
		
	}


	private void runSubjectMenu(int menu) {
		
		switch(menu) {
		
			case 1 :
				subInsert();
				break;
			case 2 :
				subUpdate();
				break;
			case 3 :
				subDelete();
				break;
			case 4 :
				subSearch();
				break;
			case 5 :
				prev();
				break;
			default :
				defaultPrint();
				
			}
		
	}


	private void subInsert() {
		
		System.out.print("과목 명을 입력하세요 : ");
		scan.nextLine();
		String sub = scan.nextLine();
		
		if(subjectList.contains(sub)) {
			System.out.println("이미 등록된 과목입니다");
			return;
		}
		
		subjectList.add(sub);
		
		System.out.println("과목을 추가했습니다");
	}


	private void subUpdate() {
		
		System.out.print("수정할 과목 명을 입력하세요 : ");
		scan.nextLine();
		String sub = scan.nextLine();
		
		if(!subjectList.contains(sub)) {
			System.out.println("등록되지 않은 과목입니다");
			return;
		}
		
		System.out.print("새로운 과목 명을 입력하세요 : ");
		String newSub = scan.nextLine();
		
		if(subjectList.contains(newSub)) {
			System.out.println("등록된 과목으로 수정할 수 없습니다");
			return;
		}
		
		subjectList.remove(sub);
		subjectList.add(newSub);
		
		System.out.println("과목을 수정했습니다");
		
	}


	private void subDelete() {
		
		System.out.print("과목 명을 입력하세요 : ");
		scan.nextLine();
		String sub = scan.nextLine();
		
		if(subjectList.remove(sub)) {
			System.out.println("삭제가 완료되었습니다");
			return;
		}
		
		System.out.println("등록되지 않은 과목입니다");
		
	}


	private void subSearch() {
		
		System.out.println("과목 목록");
		
		for(String sub : subjectList) {
			System.out.println(sub);
		}
		
	}


	private void exit() {
		System.out.println("프로그램을 종료합니다");
	}
	
}
