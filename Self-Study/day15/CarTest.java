package day15;

import day15.Car.Engine;

public class CarTest {
	public static void main(String[] args) {
		Car c = new Car();
		c.carName="宾利";
		c.carAge=1;
		c.carColor="黑色";
		c.show();
		
		Engine e = new Car().new Engine(); 
		e.show();
	}
}
