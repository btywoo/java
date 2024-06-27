package day22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex03 {

	
	public static void main(String[] args) {
		
		// 리스트에 숫자들을 저장하고, 저장된 숫자들을 정렬하는 코드를 작성하시오
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(4);
		list.add(7);
		list.add(2);
		list.add(6);
		
		Collections.sort(list);
		System.out.println(list);
		
		// Collections.reverse(list);
		Collections.sort(list, (i1,i2) -> i2 -i1);
		System.out.println(list);

	}

}
