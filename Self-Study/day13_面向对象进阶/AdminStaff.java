package day13_面向对象进阶;

public class AdminStaff extends Employee{

	public AdminStaff() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdminStaff(String id, String name, String work) {
		super(id, name, work);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void work() {
		System.out.println("行政部在工作");
	}
}
