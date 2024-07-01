package day24;

public class Ex08 {

	public static void main(String[] args) {
		
		Point p1 = new Point(10,20);
		
		p1.print();
		
		Point p2 = new Point();
		
		p2.print();

	}

}

class Point {
	
	private int x, y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point() {}
	
	public void print() {
		System.out.println("(" + x + "," + y + ")");
	}
	
}