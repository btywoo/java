package day08.homework;

import java.util.Arrays;

public class MethodEx03_01 {

	public static void main(String[] args) {
		
		
		int[] list = new int[9];
		int count = 0;
		int min = 1, max = 9;
		int random, i;

		while(count < 9) {
			random = (int)(Math.random() * (max - min + 1) + min); 
			for(i = 0; i < count; i++) { 
				if(list[i] == random) { 
					break; 
				}
			}

			if(i == count) { 
				list[count] = random;
				count++;
			}

			System.out.println(random);
		}

		System.out.println(Arrays.toString(list));

	}
	

}
