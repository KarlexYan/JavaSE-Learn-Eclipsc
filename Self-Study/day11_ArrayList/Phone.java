package day11_ArrayList;

public class Phone {
	private String brand;
	private int price;
	public Phone(String brand, int price) {
		super();
		this.brand = brand;
		this.price = price;
	}
	public Phone() {
		super();
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
