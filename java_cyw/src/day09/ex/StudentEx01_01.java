package day09.ex;

import java.util.Scanner;

public class StudentEx01_01 {
	
	// 학생 성적을 관리하기 위한 프로그램 예제 : 국어, 영어, 수학

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		int menu;
		int studentCount = 0;
		
		Student list[] = new Student[10];
		
		int grade = 0, classNum = 0, num = 0;
		String name = null;
		
		do {
			printMenu();
			menu = scan.nextInt();
			runMenu(menu);
		}
		while(menu != 4);
		
	}
	
	public static void printMenu() {
	
		System.out.println("메뉴");
		System.out.println("1. 학생 등록");
		System.out.println("2. 성적 수정");
		System.out.println("3. 성적 확인");
		System.out.println("4. 종료");
		System.out.print("메뉴 선택 : ");
	
	}
	
	public static void runMenu(int menu) {
		
		Scanner scan = new Scanner(System.in);
		int studentCount = 0;
		Student list[] = new Student[10];
		
		switch(menu) {
		
		case 1 : 
			System.out.println("학생 등록입니다");
			studentCount = insertStudent(list, scan, studentCount);
			break;
			
		case 2 :
			System.out.println("성적 수정입니다");
			updateStudent(list, scan, studentCount);
			break;
			
		case 3 :
			System.out.println("성적 확인입니다");
			printStudent(list, scan, studentCount);
			break;
			
		case 4 :
			System.out.println("프로그램을 종료합니다");
			break;
			
		default :
			System.out.println("잘못된 메뉴입니다");
			
			}
			
		
	}
		
	public static Student inputStudent(Scanner scan) {
		
		System.out.print("학년 입력 : ");
		int grade = scan.nextInt();
		
		System.out.print("반 입력 : ");
		int classNum = scan.nextInt();
		
		System.out.print("번호 입력 : ");
		int num = scan.nextInt();
		
		return new Student(grade, classNum, num, "");
	}
	
	public static int checkStudent(Student list [] , int studentCount, Student std) {
		
		if(list == null) {
			System.out.println("저장된 학생이 없습니다");
		}
		
		for(int i = 0; i < studentCount; i++) {
			
			if(list[i].getGrade() != std.getGrade()) {
				continue;
			}
			if(list[i].getGrade() != std.getGrade()) {
				continue;
			}
			if(list[i].getGrade() != std.getGrade()) {
				continue;
			}
			return i;
			
		}
		
		return -1;
	}
	
	public static int insertStudent(Student list[], Scanner scan, int studentCount) {
		
		if(studentCount == list.length) {
			System.out.println("입력란이 다 찼습니다");
			return studentCount;
		}
		
		Student std = inputStudent(scan);
		System.out.print("이름 입력 : ");
		String name = scan.next();
		std.setName(name);
		
		int check = checkStudent(list, studentCount, std);
		if(check != -1) {
			System.out.println("이미 등록된 학생입니다");
			return studentCount;
		}
		
		list[studentCount] = std;
		
		return studentCount + 1;
	}
	
	public static void updateStudent(Student list[], Scanner scan, int studentCount) {
		
		Student std = inputStudent(scan);
		int check = checkStudent(list, studentCount, std);
		
		if(check == -1) {
			System.out.println("일치하는 학생이 없습니다");
			}
		
		System.out.print("국어 성적 입력 : ");
		int korScore = scan.nextInt();
		
		System.out.print("영어 성적 입력 : ");
		int engScore = scan.nextInt();
		
		System.out.print("수학 성적 입력 : ");
		int mathScore = scan.nextInt();
		
		list[check].updateScore(korScore, engScore, mathScore);
				
	}

	public static void printStudent(Student list[], Scanner scan, int studentCount) {
		
		Student std = inputStudent(scan);
		
		int check = checkStudent(list, studentCount, std);
		
		if(check == -1) {
			System.out.println("일치하는 학생이 없습니다");
			}
				
		list[check].printScore();
	}





}

class Student10{
	
	private int grade, classNum, num;
	private String name;
	private int kor, eng, math;
	
	public Student10(int grade, int classNum, int num, String name) {
		this.grade = grade;
		this.classNum = classNum;
		this.num = num;
		this.name = name;
	}
	
	
	public void print() {
		System.out.println(grade + "학년 " + classNum + "반 " + num + "번 " + name);
	}
	
	public Student10() {}
	
	public void updateScore(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public void printScore() {
		System.out.println("국어 점수 : " + kor + "\n영어 점수 : " + eng + "\n수학 점수 : " + math);
	}
	
	
	
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassNum() {
		return classNum;
	}
	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
}

	