package test;

import java.util.ArrayList;

import test.model.Fruit;

public class MyCollection {
	
	public static void main(String[] args) {
		
		test();
	}
	
public static void test() {
	
	ArrayList<Fruit> list = new ArrayList<Fruit>();
	
	list.add(new Fruit("사과", "빨강"));
	list.add(new Fruit("메론", "초록"));
	list.add(new Fruit("포도", "보라"));
	list.add(new Fruit("맛있는 과일", ""));
	
	System.out.println(list);
	
}

}
