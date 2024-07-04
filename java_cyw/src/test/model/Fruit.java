package test.model;

public class Fruit {
	
	public String name;
	public String color;
	
	public Fruit(String name, String color) {
		this.name = name;
		this.color = color;
	}

	@Override
	public String toString() {
		return name + ", " + color;
	}
	
	

}
