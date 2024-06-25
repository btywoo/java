package day18.homework.myself;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Customer implements Serializable {

	private static final long serialVersionUID = 1234L;
	
	private String ID;
	private String name;
	
	
	@Override
	public String toString() {
		return ID + " : " + name;
	}
	
}
