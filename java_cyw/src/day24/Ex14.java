package day24;

import java.util.ArrayList;
import java.util.List;

public class Ex14 {

	public static void main(String[] args) {
		
		List<PointD> list = new ArrayList<PointD>();
		
		list.add(new PointD(1,1));
		list.add(new PointD(1,10));
		
		list.add(new PointD(1,1));
		
		list.add(new PointD(1,0));
		
		System.out.println(list.toString());
		
	}

}


class PointD {
	
	int x, y;
	
	public PointD(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return x + "," + y;
	}
	
	
	
}