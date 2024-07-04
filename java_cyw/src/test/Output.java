package test;

import java.io.FileWriter;
import java.io.IOException;

public class Output {
	
	public static void main(String[] args) {
		
		output();
		
	}
	
	public static void output() {
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("src/test/test.txt", true);
			fw.write(97);
			fw.write(65);
			fw.flush();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
