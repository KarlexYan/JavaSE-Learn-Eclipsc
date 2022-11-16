package day15;

public class Car {
	String carName;
	int carAge;
	String carColor;
	
	public void show() {
		System.out.println(carName);
		
	}
	
	class Engine{
		String engineName;
		int engineAge;
		
		public void show() {
			System.out.println(carName);
			System.out.println(engineName);
		}
	}
}
