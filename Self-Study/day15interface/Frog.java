package day15interface;

public class Frog extends Animal implements Swim{

	public Frog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Frog(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("蛙泳");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("青蛙吃虫子");
	}
	
}
