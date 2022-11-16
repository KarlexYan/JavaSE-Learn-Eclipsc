package StudentManageSystem;

import java.util.ArrayList;
import java.util.Scanner;

import day11_ArrayList.User;

public class StudentSystem {
	public static void startStudentSystem() {
		ArrayList<Student> list = new ArrayList<>();
		loop: while (true) {
			Scanner reader = new Scanner(System.in);
			System.out.println("----------欢迎来到学生管理系统----------");
			System.out.println("1：添加学生");
			System.out.println("2：删除学生");
			System.out.println("3：修改学生");
			System.out.println("4：查询学生");
			System.out.println("5：退出");
			System.out.println("请输入您的选择：");
			String choose = reader.next();
			switch (choose) {
			case "1" -> {
				System.out.println("添加学生");
				addStudent(list);
			}
			case "2" -> {
				System.out.println("删除学生");
				deleteStudent(list);
			}
			case "3" -> {
				System.out.println("修改学生");
				updateStudent(list);
			}
			case "4" -> {
				System.out.println("查询学生");
				queryStudent(list);
			}
			case "5" -> {
				System.out.println("退出");
				break loop;
			}
			default -> {
				System.out.println("没有这个选项");
			}
			}
		}
	}

	public static void addStudent(ArrayList<Student> list) {
		Student stu = new Student();
		Scanner reader = new Scanner(System.in);
		String id = null;
		while (true) {
			System.out.println("请输入学生的id：");
			id = reader.next();
			boolean flag = contains(list, id);
			if (flag) {
				System.out.println("id已存在，请重新输入");
			} else {
				stu.setId(id);
				break;
			}
		}

		System.out.println("请输入学生的姓名：");
		String name = reader.next();
		stu.setName(name);

		System.out.println("请输入学生的年龄：");
		int age = reader.nextInt();
		stu.setAge(age);

		System.out.println("请输入学生的住址：");
		String address = reader.next();
		stu.setAddress(address);

		list.add(stu);
		System.out.println("学生信息添加成功！");
	}

	public static void deleteStudent(ArrayList<Student> list) {
		Scanner reader = new Scanner(System.in);
		System.out.println("请输入要删除的id：");
		String id = reader.next();
		int index = getIndex(list, id);
		if(index>=0) {
			list.remove(index);
			System.out.println("id为："+id+"的学生删除成功！");
		}else {
			System.out.println("id不存在，删除失败！");
		}
	}

	public static void updateStudent(ArrayList<Student> list) {
		Scanner reader = new Scanner(System.in);
		System.out.println("请输入要修改的学生的id");
		String id = reader.next();
		
		int index = getIndex(list, id);
		
		if(index == -1) {
			System.out.println("要修改的id为："+id+"不存在，请重新输入");
			return;
		}
		
		Student stu = list.get(index);
		
		System.out.println("请输入要修改的学生姓名：");
		String newName = reader.next();
		stu.setName(newName);
		
		System.out.println("请输入要修改的学生年龄：");
		int newAge = reader.nextInt();
		stu.setAge(newAge);
		
		System.out.println("请输入要修改的学生住址：");
		String newAddress = reader.next();
		stu.setAddress(newAddress);
	}

	public static void queryStudent(ArrayList<Student> list) {
		if (list.size() == 0) {
			System.out.println("当前无学生信息，请添加后再查询");
			return;
		}
		System.out.println("id\t姓名\t年龄\t家庭住址");
		for (int i = 0; i < list.size(); i++) {
			Student stu = list.get(i);
			System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getAddress());
		}
	}

	public static boolean contains(ArrayList<Student> list, String id) {
//        for (int i = 0; i < list.size(); i++) {
//            Student stu = list.get(i);
//            String sid = stu.getId();
//            if(sid.equals(id)){
//                return true;
//            }
//        }
//        return false;
		return getIndex(list, id) >= 0;
	}

	public static int getIndex(ArrayList<Student> list, String id) {
		for (int i = 0; i < list.size(); i++) {
			boolean flag = list.get(i).getId().equals(id);
			if (flag) {
				return i;
			}
		}
		return -1;
	}
}
