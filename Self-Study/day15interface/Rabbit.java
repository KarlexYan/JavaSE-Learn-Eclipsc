package day15interface;

public class Rabbit extends Animal{

	public Rabbit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rabbit(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("兔子在吃胡萝卜");
	}
	
}
