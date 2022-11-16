package day13_面向对象进阶;

public class Teacher extends Employee{

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(String id, String name, String work) {
		super(id, name, work);
		// TODO Auto-generated constructor stub
	}
	
	public void work() {
		System.out.println("教研部老师在工作");
	}
}
