package test;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		
		fileSave("src/test/food.txt");
		
	}
	
	public static void fileSave(String fileName) {
			
		fileName = "src/test/food.txt";
		
		try(FileOutputStream fos = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			
			System.out.print("음식을 입력하세요 : ");
			String name = scan.nextLine();
			
			System.out.print("음식의 칼로리를 입력하세요 : ");
			int kcal = scan.nextInt();
			
			Food f = new Food(name, kcal);
			
			oos.writeObject(f);
			oos.flush();
			
			System.out.println(f.toString());
			
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	
}

class Food implements Serializable{
	
	private static final long serialVersionUID = -6173219066011711914L;
	
	private String name;
	private int kcal;
	
	public Food() {}
	
	public Food(String name, int kcal) {
		this.name = name;
		this.kcal = kcal;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKcal() {
		return kcal;
	}
	public void setKcal(int kcal) {
		this.kcal = kcal;
	}
	
	@Override
	public String toString() {
		return name + "," + kcal;
	}
	
}