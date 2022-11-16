package day15abstract;

public class Frog extends Animals{
	
	
	public Frog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Frog(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		System.out.println("青蛙在吃虫子");
	}
}
