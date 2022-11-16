package day13_面向对象进阶;

public class Maintainer extends AdminStaff{
	public void work() {
		System.out.println("维护专员在工作");
	}

	public Maintainer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Maintainer(String id, String name, String work) {
		super(id, name, work);
		// TODO Auto-generated constructor stub
	}
}
