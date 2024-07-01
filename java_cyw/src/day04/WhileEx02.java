package day04;

public class WhileEx02 {

	public static void main(String[] args) {

		// 1부터 5까지 출력하는 코드를 작성하시오

		/*
		int num;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 입력하세요 : ");
		
		num = scan.nextInt();
		
		if(num < 1 || num > 5) {
			System.out.println("잘못된 번호입니다");
			return;
		}
		
		while(num <= 5) {
			System.out.println(num++);
		}
		return;
		*/

		int i = 1;

		while(i <= 5) {
			System.out.println(i);
			i++;
		}


		// 10부터 1까지 콘솔에 출력하는 코드를 작성하시오


		int num = 10;

		while(num > 0) {
			System.out.println(num);
			num--;
		}
	}

}