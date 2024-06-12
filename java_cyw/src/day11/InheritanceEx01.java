package day11;

public class InheritanceEx01 {

	public static void main(String[] args) {
		
		// 상속 예제
		
		HighSchoolStudent std = new HighSchoolStudent();
		
		std.print();
		std.getSchoolName();
		std.getName();
		std.getAge();
		std.getBirthday();

	}

}


class HighSchoolStudent extends Student {
	
	public void test() {
		
		System.out.println(getSchoolName()); // 접근제어자: private 사용 X
		System.out.println(name);			 // 접근제어자: pro 자식 클래스 O
		System.out.println(age);			 // 접근제어자: 기본 같은 패키지 O
		System.out.println(birthday);		 // 접근제어자: public 자식 클래스 O
		
	}
}