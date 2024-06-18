package day15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class ListSortEx01 {

	public static void main(String[] args) {
		
		// 리스트를 이용하여 정렬하는 방법
		
		List<String> list = new ArrayList<String>();
		
		list.add("홍길동");
		list.add("고길동");
		list.add("둘리");
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
		
		
		Collections.sort(list, new Comparator<String>() {
		// Collections.sort(리스트, Comparator 객체)
		// Comparator 객체 : Comparator 인터페이스를 구현한 구현 클래스의 객체가 필요
		//	String 클래스는 라이브러리에서 제공하는 클래스이기 때문에 수정할 수 없음
		// 	익명 클래스(이름이 없는 1회용 클래스)를 만들어 해당 클래스의 객체를 이용
		// 	Comparator 인터페이스의 compare 추상 메소드를 오버라이딩 해야하고
		// 	오버라이딩한 코드에 따라 정렬 방식이 바뀐다

			@Override
			public int compare(String o1, String o2) {
				return -o1.compareTo(o2);
			}
			
		});
		
		System.out.println(list);
		
		
		List<Student> stds = new ArrayList<Student>();
		
		stds.add(new Student("2024160001", "홍길동"));
		stds.add(new Student("2024160002", "고길동"));
		stds.add(new Student("2021109018", "둘리"));
		
		System.out.println(stds);
		
		Collections.sort(stds, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.number.compareTo(o2.number);
			}
			
		});
		
		
		// Collections.sort(stds, (o1,o2) -> o1.number.compareTo(o2.number));
		// 람다식 사용. 위 코드와 동일한 코드

	}

}


class Student {
	
	public String number; // 학번
	public String name; // 이름
	
	
	public Student(String number, String name) {
		this.number = number;
		this.name = name;
	}


	@Override
	public String toString() {
		return "학번 : " + number + " - 이름 : " + name;
	}


	@Override
	public int hashCode() {
		return Objects.hash(number);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(number, other.number);
	}
	
}