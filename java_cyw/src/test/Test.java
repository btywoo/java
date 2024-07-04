package test;

import test.person.Person;

public class Test {

	public static void main(String[] args) {
		
		Person[] pArr = new Person[3];
		
		Person p1 = new Person();
		p1.setName("홍길동");
		
		pArr[0] = p1;
		
		Person p2 = new Person();
		p2.setName("임꺽정");
		
		pArr[1] = p2;
		
		Person p3 = new Person();
		p3.setName("유관순");
		
		pArr[2] = p3;
		
		for(int i = 0; i<pArr.length; i++) {
			System.out.println(pArr[i].getName());
		}
	}

}
