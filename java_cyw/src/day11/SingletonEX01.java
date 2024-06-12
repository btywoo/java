package day11;

public class SingletonEX01 {

	public static void main(String[] args) {
		
		Singleton s1 = Singleton.getInstance();
		s1.message();
		
		Singleton s2 = Singleton.getInstance();
		s2.message();
		
		System.out.println(s1);
		System.out.println(s2);
		
		A a1 = new A();
		A a2 = new A();
		
		System.out.println(a1);
		System.out.println(a2);
		
		a1 = a2;
		
	}

}


class A {}

class Singleton {
	
	private static Singleton instance = new Singleton();
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		return instance;
	}
	
	public void message() {
		System.out.println("싱글톤입니다.");
	}
	
}