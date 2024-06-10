package day07;

import java.util.Arrays;

public class ArrayEx02 {

	public static void main(String[] args) {

		// 1 ~ 9 사이의 랜덤한 수 3개를 배열에 저장하는데
		// 중복되지 않게 저장하는 코드를 작성하시오

		int[] list = new int[3];
		int count = 0; // 저장된 숫자의 개수
		int min = 1, max = 9;
		int random, i;

		while(count < 3) {
			random = (int)(Math.random() * (max - min + 1) + min); // 랜덤에 값 지정
			for(i = 0; i < count; i++) { // 배열에 저장되어 있는 숫자들 중 랜덤값과 동일한 값이 있는가?
				if(list[i] == random) { // 있다면 break > i++이 실행되지 않는다
					break; // i는 count보다 작음 / i++이 되지 않음
				}
			}

			if(i == count) { 
				// i++이 실행되지 않는다면 i의 값은 count보다 작다
				// 배열에서 중복이 발생하지 않았다면 i의 값은 count와 동일함
				list[count] = random; // 배열에 랜덤값을 집어넣고 count의 값을 1 증가시킨다
				count++;
			}

			System.out.println(random);
		}

		System.out.println(Arrays.toString(list));
	}

}