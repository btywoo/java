package day09;

public class ThisEx01 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		Student3 std1 = new Student3();
		
		Student3 std2 = new Student3(1,2,2,"둘리");
		
		System.out.println(std1.schoolName);
		System.out.println(std2.schoolName);
		
		std1.schoolName = "KH중학교";
		
		System.out.println(std1.schoolName);
		System.out.println(std2.schoolName);
		
		System.out.println(Student3.schoolName);
		System.out.println(Math.PI); // Math에서 제공하는 static 값

	}

}

class Student3 {
	
	private int grade, classNum, num;
	private String name;
	public static String schoolName = "KH고등학교";
	
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
	
	
	public Student3(int grade, int classNum, int num, String name) {
		super();
		this.grade = grade;
		this.classNum = classNum;
		this.num = num;
		this.name = name;
	}
	
	
	public Student3() {
		
		// num = 1; 
		
		// this() 생성자 이용 시 첫번째 줄에 작성해야 한다. 
		// 그렇지 않으면 에러 발생
		
		this(1,1,1,"홍길동");
		
	}
	
	
}