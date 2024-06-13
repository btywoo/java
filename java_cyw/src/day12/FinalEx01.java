package day12;

public class FinalEx01 {

	public static void main(String[] args) {
		
		final int num; // final 변수는 상수로 값을 최초 한 번만 할당 할 수 있다
		num = 20; // 처음이라 가능
		// num = 30; // 처음이 아니라 불가
	}

}


class Parent1 {
	public final void print() {
		System.out.println("파이널 메소드입니다.");
	}
}

class Child1 extends Parent1 {
	
	/*
	
	@Override
	public final void print() { // final 메소드는 오버라이드 할 수 없다
		System.out.println("파이널 메소드를 수정하려고 합니다.");
	}
	
	*/
	
}


final class Parent2 {
	
	
}

// class Child2 extends Parent2 {} // final 클래스는 부모클래스가 될 수 없다
	
	
