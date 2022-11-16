package day13_面向对象进阶;

import java.util.ArrayList;

public class StudentUtil {
	private StudentUtil() {
		
	}
	
	public static int getMax(ArrayList<Student> list) {
		int max = list.get(0).getAge();
		for(int i=0;i<list.size();i++) {
			Student stu = list.get(i);
			if(stu.getAge()>max) {
				max = stu.getAge();
			}
		}
		return max;
		
	}
}
