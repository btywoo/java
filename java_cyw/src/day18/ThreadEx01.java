package day18;

public class ThreadEx01 {

	public static void main(String[] args) {
		
		// Thread 클래스 상속을 이용한 스레드 생성 예제
		
		MyThread1 thread = new MyThread1();
		
		thread.start();
		
		for(int i = 0; i<10000; i++) {
			System.out.print("|");
		}

	}

}


class MyThread1 extends Thread {
	
	@Override
	public void run() {
		for(int i = 0; i<10000; i++) {
			System.out.print("-");
		}
	}
	
	
	
	
}