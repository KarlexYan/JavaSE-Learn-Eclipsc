package day11_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList4 {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		Scanner reader = new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
			Student stu = new Student();
			System.out.println("请输入名字：");
			String name = reader.next();
			System.out.println("请输入年龄：");
			int age = reader.nextInt();
			
			stu.setName(name);stu.setAge(age);
			
			list.add(stu);
		}
		
		System.out.println(list.size());
	}
}
