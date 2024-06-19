package day16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Ex04 {

	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<Student>();
		
		list.add(new Student(1,1,1,"홍길동",100,20,30));
		list.add(new Student(1,1,2,"고길동",100,100,100));
		list.add(new Student(1,2,1,"둘리",10,20,30));
		
		
		// 국어 평균, 영어 평균, 수학 평균을 계산해서 출력하는 코드를 작성하시오
		// 가능하면 함수형 인터페이스와 메소드를 이용하시오
		
		System.out.println("영어 평균 : " + sum(list, s -> s.getKor()) / (double)list.size());
		System.out.println("영어 평균 : " + sum(list, s -> s.getEng()) / (double)list.size());
		System.out.println("수학 평균 : " + sum(list, s -> s.getMath()) / (double)list.size());
		
		System.out.println("================================");
		
		// 각 학생의 국어, 영어, 수학 성적을 출력하는 코드를 작성하시오
		// 가능하면 함수형 인터페이스와 메소드를 이용하시오
		
		print(list, c -> System.out.println(c));
		
		System.out.println("================================");
		
		// 국어 성적이 80점 이상인 학생을 출력하는 코드를 작성하시오
		
		print2(list, c -> c.getKor() >= 80);
		
		System.out.println("================================");
		
		// 1학년 1반 학생들을 출력하는 코드를 작성하시오
		
		print2(list, c -> c.getGrade() == 1 && c.getClassNum() == 1);
		
		System.out.println("================================");
		
		// 1학년 1반 1번 학생을 출력하는 코드를 작성하시오
		
		print2(list, c -> c.getGrade() == 1 && c.getClassNum() == 1 && c.getNum() == 1);

		System.out.println("================================");
		
		Collections.sort(list, (s1, s2) -> {
			
			if(s1.getGrade() != s2.getGrade()) {
				return s1.getGrade() - s2.getGrade();
			}
			if(s1.getClassNum() != s2.getClassNum()) {
				return s1.getClassNum() - s1.getClassNum();
			}
			return s1.getNum() - s2.getNum();
		});
		
		print2(list, s -> true);
		
		System.out.println("================================");
		
		Collections.sort(list, (s1, s2) -> s2.getEng() - s1.getEng());
		
		print2(list, s -> true);
		
	}
	
	
	
	public static int sum(List<Student> list, Function<Student, Integer> f) {
		
		int sum = 0;
		for(Student tmp : list) {
			sum += f.apply(tmp);
		}
		return sum;
	}
	
	public static void print(List<Student> list, Consumer<Student> c) {
		for(Student tmp : list) {
			c.accept(tmp);
		}
	}
	
	
	public static void print2(List<Student> list, Predicate<Student> p) {
		
		for(Student tmp : list) {
			if(p.test(tmp)) {
				System.out.println(tmp);
			}
		}
	}
	

}




@Data
@AllArgsConstructor
class Student {
	
	private int grade, classNum, num;
	private String name;
	private int kor, eng, math;
	
	@Override
	public String toString() {
		return grade + "학년 " + classNum + "반 " + num + "번 " + name + 
				" - 국어: " + kor + "점, 영어: " + eng + "점, 수학: " + math + "점";
	}
	
	
	
}