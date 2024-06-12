package day11;

public class PolymorphismEx01 {

	public static void main(String[] args) {
		
		TV tv = new TV();
		AirConditioner aircon = new AirConditioner();
		
		turnOn(tv);
		turnOn(aircon);

	}
	
	/*
	
	// 가전 제품 종류가 20개이면 turnOn 메소드가 20개여야 한다
	// turnOff 메소드가 추가된다면 메소드가 총 40개여야 한다
	
	public static void turnOn(TV tv) {
		tv.power = true;
		System.out.println(tv.name + "이 켜졌습니다.");
	}
	public static void turnOn(AirConditioner aircon) {
		aircon.power = true;
		System.out.println(aircon.name + "이 켜졌습니다.");
	}
	
	*/
	
	// 매개변수 다형성을 이용하면 가전 제품 종류에 상관 없이 하나의 메소드로 처리할 수 있다
	
	public static void turnOn(Appliances app) {
		app.power = true;
		System.out.println(app.name + "이 켜졌습니다.");
	}

}


class Appliances {
	
	boolean power;
	String name = "가전제품";
}

class TV extends Appliances {
	
	public TV() {
		name = "TV";
	}
	
}

class AirConditioner extends TV {
	
	public AirConditioner() {
		name = "에어컨";
	}
	
	
}