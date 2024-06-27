package student;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import lombok.Data;

@Data
public class Student {
	
	private int grade, classNum, num;
	private String name;
	
	private int score;
	
	private List<Subject> subject = new ArrayList<Subject>();

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return classNum == other.classNum && grade == other.grade && num == other.num;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(classNum, grade, num);
	}
	
	
	
	public Student(int grade, int classNum, int num, String name) {
		
		this.grade = grade;
		this.classNum = classNum;
		this.num = num;
		this.name = name;
	}


	public void print() {
		
		System.out.println(grade + "학년 " + classNum + "반 " + num +"번 - " + name);
		
		System.out.println("과목 성적");
		
		if(subject.size() == 0) {
			System.out.println("등록된 과목이 없습니다");
			return;
		}
		
		for(Subject tmp : subject) {
			System.out.println(tmp);
		}
		
	}



}
