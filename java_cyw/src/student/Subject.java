package student;

import java.io.Serializable;
import java.util.Objects;

import lombok.Data;

@Data
public class Subject implements Serializable{

	private static final long serialVersionUID = 5678L;

	private int grade, semester, midterm, finalExam, perAss;
	
	private String name;

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Subject other = (Subject) obj;
		return grade == other.grade && midterm == other.midterm && Objects.equals(name, other.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(grade, midterm, name);
	}

	public Subject(String name, int grade, int semester, int midterm, int finalExam, int perAss) {
		
		this.grade = grade;
		this.semester = semester;
		this.midterm = midterm;
		this.finalExam = finalExam;
		this.perAss = perAss;
		this.name = name;
		
	}

	@Override
	public String toString() {
		return "과목 : " + name + "\n" + grade + "학년 " + semester + "학기\n중간 시험 : " + midterm + 
				"\n기말 시험 : " + finalExam + "\n수행 평가 : " + perAss + "\n총점 : " + total();
	}

	private double total() {
		return midterm * 0.4 + finalExam * 0.4 + perAss * 0.2;
	}
	
	


}
