package day11_ArrayList;

import java.util.ArrayList;

public class ArrayList3 {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		
		Student s1 = new Student("严炜轩",22);
		Student s2 = new Student("邓绮雯",22);
		list.add(s1);list.add(s2);
		for(int i=0;i<list.size();i++) {
			Student stu = list.get(i);
			System.out.println(stu.getName()+","+stu.getAge());
			
		}
	}
}
