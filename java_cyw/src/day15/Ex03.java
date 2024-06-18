package day15;

import java.util.HashSet;

public class Ex03 {

	public static void main(String[] args) {
		
		// 1~10 사이의 랜덤한 수 6개를 중복되지 않게 생성해서 저장하고 출력하는 코드를 작성하시오
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		int min = 1, max = 10;
		
		while(set.size()<6) {
			set.add((int)(Math.random() * (max - min + 1) + min));
		}
		
		System.out.println(set);

	}

}
