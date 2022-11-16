package day13_面向对象进阶;

public class Test {
	public static void main(String[] args) {
		Employee ee = new Employee("000","公司","工作");
		System.out.println(ee.getId()+","+ee.getName()+","+ee.getWork());
		ee.work();
		Teacher t = new Teacher("005","教研部","负责教研");
		System.out.println(t.getId()+","+t.getName()+","+t.getWork());
		t.work();
		
		AdminStaff a = new AdminStaff("006","行政部","负责行政");
		System.out.println(a.getId()+","+a.getName()+","+a.getWork());
		a.work();
		
		Lecturer l = new Lecturer("001","讲师","讲课");
		System.out.println(l.getId()+","+l.getName()+","+l.getWork());
		l.work();
		Tutor t1 = new Tutor("002","助教","帮助老师教学");
		System.out.println(t1.getId()+","+t1.getName()+","+t1.getWork());
		t1.work();
		Maintainer m = new Maintainer("003","维护专员","维护");
		System.out.println(m.getId()+","+m.getName()+","+m.getWork());
		m.work();
		Buyer b = new Buyer("004","采购员","采购");
		System.out.println(b.getId()+","+b.getName()+","+b.getWork());
		b.work();
	}
	
}
