package day02;

public class StringEx02 {

	public static void main(String[] args) {

		String str1 = 1 + "HI2";
		String str2 = "1HI" + 2;

		System.out.println(str1);
		System.out.println(str2);

		String str3 = 1 + 2 + "3";
		String str4 = "1" + 2 + 3;

		System.out.println(str3); 
		// 정수 1과 2가 더해진 후 문자열 3과 더해지기 때문에 3+"3"이 됨
		System.out.println(str4); 
		// 문자열 1과 정수 2가 더해진 후 정수 3이 더해지기 때문에 "12"+3이 됨

	}

}