package day13;

public class ExceptionEx04 {

	public static void main(String[] args) {
		
		//예외를 발생시키고 미루는 예제
		
		int [] arr = null;
		
		try {
			printArray(arr);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			// e.getMessage()는 예외클래스에 있는 message 값을 가져오는 메소드
			// 보통 생성자에서 넣은 문자열을 가져옴
			e.printStackTrace();
			// e.printStackTrace()
			// 예외가 발생한 경로를 순차적으로 콘솔에 출력
		}
		System.out.println("프로그램 종료");

	}
	
	public static void printArray(int [] arr) throws Exception {
	// NullPointerException을 제외한 Exception은 throws를 작성해야 한다
		
		if(arr == null) {
			throw new Exception("배열이 생성되지 않았습니다");
		}
		for(int tmp : arr) {
			System.out.println(tmp);
		}
		
	}

}
