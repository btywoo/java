package day12;

public class InheritanceEx01 {

	public static void main(String[] args) {
		
		Child c = new Child();
		run(c);

		
	}
	
	// main 메소드에서 호출할 run 메소드를 만드는데
	// 누가 어떻게 구현할지 모르는 상황
	public static void run(Parent parent) {
		if(parent != null) {
			parent.run();
		}
	}

}


// 개발자들이 자주 쓰는 클래스로 가정 > 다른 패키지에 있다고 가정
// 이 클래스에 run이라는 메소드가 있다고 가정
class Parent {
	
	public void run() {
		System.out.println("실행합니다.");
	}
}

class Child extends Parent {

	@Override
	public void run() {
		System.out.println("오버라이드하여 실행합니다. \n(내가 원하는 구현 가능)");
	}
	
	
	
}