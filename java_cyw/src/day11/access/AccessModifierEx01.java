package day11.access;

import day11.Student;

public class AccessModifierEx01 {

	public static void main(String[] args) {
		
		A a = new A();
		a.test();

	}

}




class A {
	
	Student std = new Student();
	
	public void test() {
		
		// std.name = "abc"; 				// 접근제어자: protected 상속 X 사용 X
		std.birthday = "2000-01-01";	
		
		System.out.println(std.birthday);
		
	}

	
}