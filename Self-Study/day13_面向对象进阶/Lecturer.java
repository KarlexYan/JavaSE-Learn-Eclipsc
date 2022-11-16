package day13_面向对象进阶;

public class Lecturer extends Teacher{
	
	public Lecturer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lecturer(String id, String name, String work) {
		super(id, name, work);
		// TODO Auto-generated constructor stub
	}

	public void work() {
		System.out.println("讲师在讲课");
	}
}
