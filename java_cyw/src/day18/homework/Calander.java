package day18.homework;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Calander implements Serializable {

	private static final long serialVersionUID = 1234L;
	
	private String date;
	private String schedule;
	private String details;
	
	
	@Override
	public String toString() {
		return date + " " + schedule + " " + details;
	}
	

}
