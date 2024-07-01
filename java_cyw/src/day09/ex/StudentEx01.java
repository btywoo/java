package day09.ex;

import java.util.Scanner;

public class StudentEx01 {
	
	// 학생 성적을 관리하기 위한 프로그램 예제 : 국어, 영어, 수학

	public static void main(String[] args) {
		
		// 다음 메뉴가 출력되도록 코드를 작성하시오
		
		// 메뉴
		// 1. 학생 등록
		// 2. 성적 수정
		// 3. 성적 확인
		// 4. 종료
		// 메뉴 선택 :
		
		// 메뉴를 출력하고 메뉴를 콘솔창에서 입력 받는 코드를 작성하시오
		// 단, 입력 받은 메뉴가 4가 아니면 반복하도록 작성하시오
		
		// 입력한 메뉴가 1이면 학생 등록입니다.
		// 입력한 메뉴가 2면 성적 수정입니다.
		// 입력한 메뉴가 3이면 성적 확긴입니다.
		// 4면 프로그램 종료입니다.
		// 라고 출력하도록 코드를 작성하시오
		
		// 프로그램 관리를 위한 Student 클래스를 추가하시오
		// 학년, 반, 번호, 이름, 국어, 영어, 수학
		// 멤버 변수는 private로 하고 getter / setter 추가
		// 기본 생성자와 학년, 반, 번호, 이름을 이용한 생성자를 추가
		// 국어, 영어, 수학 성적을 변경하는 기능 추가
		
		// 학생 등록 기능을 구현하시오
		// 학년, 반, 번호, 이름을 입력 받아 학생을 추가하세요.
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		int menu;
		int count = 0;
		
		Student list[] = new Student[10];
		
		do {
			printMenu();
			menu = scan.nextInt();
			// runMenu(menu);
			
			switch(menu) {
			
			case 1 : 
				
				if(count == list.length) {
					System.out.println("입력란이 다 찼습니다");
				}
				// 학년, 반, 번호, 이름을 입력 받고
				// 입력 받은 정보를 이용하여 학생 개체를 생성
				// 배열이 꽉 차지 않으면 생성한 학생 객체를 배열에 저장하고
				// 저장된 학생 수를 1 증가
				System.out.println("학생 등록입니다");
				
				System.out.print("학년 입력 : ");
				int grade = scan.nextInt();
				
				System.out.print("반 입력 : ");
				int classNum = scan.nextInt();
				
				System.out.print("번호 입력 : ");
				int num = scan.nextInt();
				
				System.out.print("이름 입력 : ");
				String name = scan.next();
				
				Student std = new Student(grade, classNum, num, name);
				
				list[count] = std;
				count++;
				
				break;
				
			case 2 :
				System.out.println("성적 수정입니다");
				
				System.out.print("학년 입력 : ");
				int grade1 = scan.nextInt();
				
				System.out.print("반 입력 : ");
				int classNum1 = scan.nextInt();
				
				System.out.print("번호 입력 : ");
				int num1 = scan.nextInt();
				
				
				if(list == null) {
					System.out.println("저장된 학생이 없습니다");
				}
				for(int i = 0; i < count; i++) {
					if(list[i].getGrade() != grade1 || list[i].getClassNum() != classNum1 || list[i].getNum() != num1) {
						System.out.println("일치하는 학생이 없습니다");
					}
					else {
						System.out.print("국어 성적 입력 : ");
						int korScore = scan.nextInt();
						
						System.out.print("영어 성적 입력 : ");
						int engScore = scan.nextInt();
						
						System.out.print("수학 성적 입력 : ");
						int mathScore = scan.nextInt();
						
						list[i].updateScore(korScore, engScore, mathScore);
						
					}
				
				}
				
				break;
				
			case 3 :
				System.out.println("성적 확인입니다");
				
				System.out.print("학년 입력 : ");
				int grade2 = scan.nextInt();
				
				System.out.print("반 입력 : ");
				int classNum2 = scan.nextInt();
				
				System.out.print("번호 입력 : ");
				int num2 = scan.nextInt();
				
				
				if(list == null) {
					System.out.println("저장된 학생이 없습니다");
				}
				for(int i = 0; i < count; i++) {
					if(list[i].getGrade() != grade2 || list[i].getClassNum() != classNum2 || list[i].getNum() != num2) {
						System.out.println("일치하는 학생이 없습니다");
					}
					else {
						
						list[i].printScore();
					}
					
				}
					
					
				break;
				
			case 4 :
				System.out.println("프로그램을 종료합니다");
				break;
				
			default :
				System.out.println("잘못된 메뉴입니다");
				
				}
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
		
		switch(menu) {
		
		case 1 : 
			System.out.println("학생 등록입니다");
			break;
			
		case 2 :
			System.out.println("성적 수정입니다");
			break;
			
		case 3 :
			System.out.println("성적 확인입니다");
			break;
			
		case 4 :
			System.out.println("프로그램을 종료합니다");
			break;
			
		default :
			System.out.println("잘못된 메뉴입니다");
			
			}
		
	}
		
	
}

class Student{
	
	
	private int grade, classNum, num;
	private String name;
	private int kor, eng, math;
	
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

	
	
	public Student(int grade, int classNum, int num, String name) {
		
		this.grade = grade;
		this.classNum = classNum;
		this.num = num;
		this.name = name;
		
	}
	
	public Student() {}
	
	public void updateScore(int kor, int eng, int math) {
		
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}
	
	public void printScore() {
		System.out.println(grade + "학년 " + classNum + "반 " + num + "번 " + name);
		System.out.println("국어 점수 : " + kor + "\n영어 점수 : " + eng + "\n수학 점수 : " + math);
	}
	
}
	
	