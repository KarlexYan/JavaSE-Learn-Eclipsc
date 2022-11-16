package day15abstract;

public class Dog extends Animals{

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void eat() {
		System.out.println("狗吃骨头");
	}
}
