package day24;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Ex16 {
	
	
	public static void main(String[] args) {
		
		// 1. 이름과 나이를 저장하고 관리하는 클래스를 생성하세요
		// 2. 이름이 홍길동, 나이는 21인 객체를 생성하세요
		// 3. src/day24/ex16.txt에 2번에서 작성한 객체를 저장하시오
		
		
		Person p = new Person("홍길동", 21);
		
		try(ObjectOutputStream oos = 
				new ObjectOutputStream(new FileOutputStream
						("src/day24/ex16.txt"))) {
				oos.writeObject(p);
			} 
		catch (Exception e) {
			e.printStackTrace();
			}
		
		
		try(ObjectInputStream ois = 
				new ObjectInputStream(new FileInputStream
						("src/day24/ex16.txt"))){
				System.out.println((Person)ois.readObject());
			} 
		catch (Exception e) {
			e.printStackTrace();
			} 
			
		
	}

}

@Data
@AllArgsConstructor
class Person implements Serializable{
	
	private static final long serialVersionUID = -5525670082637815926L;
	
	private String name;
	private int age;
	
}