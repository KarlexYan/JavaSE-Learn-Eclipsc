package day13_面向对象进阶;

public class Buyer extends AdminStaff{
	public void work() {
		System.out.println("采购专员在工作");
	}

	public Buyer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Buyer(String id, String name, String work) {
		super(id, name, work);
		// TODO Auto-generated constructor stub
	}
}
