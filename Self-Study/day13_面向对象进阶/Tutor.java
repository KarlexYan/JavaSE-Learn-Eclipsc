package day13_面向对象进阶;

public class Tutor extends Teacher{
	
	public Tutor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tutor(String id, String name, String work) {
		super(id, name, work);
		// TODO Auto-generated constructor stub
	}

	public void work() {
		System.out.println("助教在工作");
	}
}
