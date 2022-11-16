package day15abstract;

public abstract class Animals {
	private String name;
	private int age;
	public Animals() {
		super();
	}
	public Animals(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void drink() {
		System.out.println("动物在喝水");
	}
	public abstract void eat();
}
