package day15abstract;

public class Sheep extends Animals{

	public Sheep() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sheep(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void eat() {
		System.out.println("羊吃草");
	}
}
