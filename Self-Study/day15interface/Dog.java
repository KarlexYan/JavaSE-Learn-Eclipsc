package day15interface;

public class Dog extends Animal implements Swim{

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("狗刨");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("狗吃骨头");
	}
	
}
