package day24;

import lombok.Getter;
import lombok.Setter;

public class Ex10 {

	public static void main(String[] args) {
		
		PointB p1 = new PointB();
		
		p1.setX(100);
		
		p1.printC(10.5, 20.5);

	}

}

class PointB {
	
	@Getter
	@Setter
	private int x, y;
	
	public void printA() {
		System.out.println(x + "," + y);
	}
	
	public void printB(int x, int y) {
		System.out.println(x + "," + y);
	}
	
	public void printC(double x, double y) {
		System.out.println(x + "," + y);
	}
	
	
	public int printD() {
		System.out.println(x + "," + y);
		return x + y;
	}
	
	
}