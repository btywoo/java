package day09;

public class StaticEx01 {

	public static void main(String[] args) {
		
		Student4 std1 = new Student4(1, 1, 1, "홍길동");
		Student4 std2 = new Student4(1, 1, 2, "임꺽정");
		
		std1.print();
		std2.print();
		
		Student4.printSchoolName();

	}

}


class Student4 {
	
	public int grade, classNum, num;
	public String name;
	
	public static String schoolName = "KH 고등학교";
	
	public Student4(int grade, int classNum, int num, String name) {
		
		this.grade = grade;
		this.classNum = classNum;
		this.num = num;
		this.name = name;
		
	}

	public void print() {
		
		System.out.println(grade + "학년 " + classNum + "반 " + num + "번 " + name);
		
	}
	
	public static void printSchoolName() {
		
		System.out.println(schoolName);
		
	}
	
	public static void test1() { // 클래스 메소드
		
		// 클래스 메소드에서 클래스 변수를 호출할 수 있다
		System.out.println("학교명 : " + schoolName);
		// 클래스 메소드에서 객체 변수를 호출할 수 없다 > 객체를 생성한 후 호출
		// System.out.println("학년 : " + grade);
		Student4 std = new Student4(1,1,1,"둘리");
		System.out.println("학년 : " + std.grade);
		// 클래스 메소드에서 클래스 메소드를 호출할 수 있다
		printSchoolName();
		// 클래스 메소드에서 객체 메소드를 호출할 수 없다 > 객체 생성 후 호출
		// print();
		std.print();
		
	}
	
	public void test2() { // 객체 메소드
		
		// 객체 메소드에서 클래스 변수를 호출할 수 있다
		System.out.println("학교명 : " + schoolName);
		// 객체 메소드에서 객체 변수를 호출할 수 있다
		System.out.println("학년 : " + grade);
		// 객체 메소드에서 클래스 메소드를 호출할 수 있다
		printSchoolName();
		// 객체 메소드에서 객체 메소드를 호출할 수 있다
		print();
	}
	
}