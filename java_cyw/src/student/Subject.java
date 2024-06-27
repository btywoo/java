package student;

import java.util.Objects;

import lombok.Data;

@Data
public class Subject {

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
	
	

}
