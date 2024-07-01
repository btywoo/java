package day24;

import program.Program;

public class Ex15 {

	public static void main(String[] args) {
		
		TestProgram tp = new TestProgram();
		
		tp.run();
		
	}

}

class TestProgram implements Program {

	@Override
	public void printMenu() {
		
	}

	@Override
	public void runMenu(int menu) throws Exception {
		
	}

	@Override
	public void run() {
		System.out.println("프로그램을 실행했습니다");
	}
	
}