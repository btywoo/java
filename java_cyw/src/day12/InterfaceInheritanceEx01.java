package day12;

public class InterfaceInheritanceEx01 {

	public static void main(String[] args) {
		
		InterfaceInheritanceEx01 a = new InterfaceInheritanceEx01();

	}

}


interface InterfacePA {
	void print();
	void test1();
}

interface InterfacePB {
	void print();
	void test1();
}


interface InterfaceC extends InterfacePA, InterfacePB {
	// print() 메소드가 겹치는데 상속을 받으면 
	// 어차피 구현부가 없어서 하나로 합치면 되기 때문에 다중 상속이 가능 
	// (인터페이스는)
	
}

class ClassA {
	void print() {}
	void test1() {}
}

class ClassB {
	void print() {}
	void test1() {}
}

// class ClassC extends ClassA, ClassB {}