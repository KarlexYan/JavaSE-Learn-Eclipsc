package day09_面向对象综合;

public class Cars {
	private String brand;
	private double price;
	private String color;
	
	public Cars() {
		super();
	}

	public Cars(String brand, double price, String color) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
