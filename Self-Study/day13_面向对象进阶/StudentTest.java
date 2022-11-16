package day13_面向对象进阶;

import java.util.ArrayList;

public class StudentTest {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		Student stu1 = new Student("严炜轩",22,"男");
		Student stu2 = new Student("邓绮雯",23,"女");
		Student stu3 = new Student("潘倩怡",24,"女");
		list.add(stu1);list.add(stu2);list.add(stu3);
		
		System.out.println("max="+StudentUtil.getMax(list));
	}
}
