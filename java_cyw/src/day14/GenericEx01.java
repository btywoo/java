package day14;

import lombok.Data;

public class GenericEx01 {

	public static void main(String[] args) {

		Array<String> list1 = new Array<>(10);
		list1.set(0, "안녕하세요");
		list1.set(1, "사과");
		
		list1.print();
		
		
		Array<Integer> list2 = new Array<>(10);
		list2.set(0, 1);
		list2.set(1, 10);
		
		list2.print();
		
		
		String [] list3 = new String[10];
		list3[0] = "안녕";
		list3[1] = "귤";
		
		Integer [] list4 = new Integer[10];
		list4[0] = 10;
		list4[1] = 100;
		
		printArray(list3);
		printArray(list4);
		
	}

	
	public static <T> void printArray(T [] array) {
		
		for(T element : array) {
			if(element != null) {
				System.out.println(element);
			}
		}
		
	}
	
	
}

class Array<T> {
	
	private T [] list;
	
	@SuppressWarnings("unchecked")
	public Array(int size) {
		list = (T[]) new Object[size];
	}
	
	public void print() {
		for(int i = 0; i<list.length; i++) {
			if(list[i] != null) {
				System.out.println(list[i]);
			}
		}
	}
	
	
	
	
	public void set(int index, T data) {
		if(index >= list.length || index < 0) {
			return;
		}
		list[index] = data;
	}
	public T get(int index) {
		if(index >= list.length || index < 0) {
			return null;
		}
		return list[index];
	}
	
	public void setList(T [] list) {
		this.list = list;
	}
	public T[] getList() {
		return list;
	}
}

@Data
class Test<A,B> {
	
	private A data1;
	private B data2;
	
}