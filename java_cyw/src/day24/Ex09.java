package day24;

import lombok.Data;

public class Ex09 {

	public static void main(String[] args) {
		
		PointA p1 = new PointA(10, 20);
		
		p1.print();
		
		p1.setX(100);
		p1.setY(200);
		
		p1.print();
		
		
		PointA p2 = new PointA();
		
		p2.print();

	}

}

@Data
class PointA {
	
	private int x, y;
	
	public PointA(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public PointA() {}
	
	public void print() {
		System.out.println(x + "," + y);
	}
	
	
}