package day24;

import lombok.Data;

public class Ex13 {

	public static void main(String[] args) {
		
		PointC [] pts = new PointC[3];
		
		// (1,1) / (2,2) / (3,3)
		
		for(int i = 0; i < pts.length; i++) {
			pts[i] = new PointC(i+1, i+1);
			pts[i].print();
		}

	}

}

@Data
class PointC {
	
	private int x, y;
	
	public PointC(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void print() {
		System.out.println(x + "," + y);
	}
	
	
}