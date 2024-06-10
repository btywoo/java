package day09.access2;

import day09.access.Student;

public class AccessModifierEx02 {

	// 접근 제어자 예제	
	
	public static void main(String[] args) {
		
		Student std1 = new Student();
		
		// Student의 자료 > access에 있음 / 다른 패키지
		
		std1.grade = 1; // 접근제어자 : public
		// std1.classNum = 1; // 접근제어자 : protected (같은 패키지 / 하위 클래스 사용 가능)
		// std1.num = 1; // 접근제어자 : default (같은 패키지 사용 가능)
		// std1.name = "홍길동"; // 접근제어자 : private

	}

}
