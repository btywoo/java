package day12;

public class StringBufferEx01 {

	public static void main(String[] args) {
		
		// String과 차이는 String은 수정이 아니가 교체, StringBuffer은 수정
		// 프로그램 내에서 문자열 수정이 자주 일어난다 > StringBuffer가 좋음
		
		StringBuffer sb = new StringBuffer("Hello world");
		
		sb.append("!"); 
		// append(문자열) : 문자열을 제일 뒤에 추가
		System.out.println(sb);
		
		sb.insert(0, "\""); 
		// insert(시작번지, 문자열) : 시작번지에 문자열을 추가
		sb.append("\"");
		System.out.println(sb);
		
		sb.delete(6, sb.length()-1); 
		// delete(시작번지, 끝번지) : 시작번지부터 끝번지 전까지를 삭제 (끝번지 포함X)
		System.out.println(sb);

	}

}
