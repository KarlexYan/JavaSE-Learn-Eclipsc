package day09_面向对象综合;

public class StudentTest {
	public static void main(String[] args) {
		Student arr[] = new Student[3];
		
		Student stu1 = new Student(1,"张三",22);
		Student stu2 = new Student(2,"李四",23);
		Student stu3 = new Student(3,"王五",24);
		
		arr[0]=stu1;arr[1]=stu2;
		arr[2]=stu3;
		
		Student stu4 = new Student(4,"赵六",25);
		
		
		boolean flag = contains(arr,stu4.getId());
		if (flag) {
			System.out.println("已存在，请修改");
		}else {
			int count = getCount(arr);
			if (count >= arr.length) {
				Student newArr[] = createArr(arr);
				newArr[count] = stu4;
				printArr(newArr);
			}else {
				arr[count] = stu4;
				printArr(arr);
			}
		}
		
//		int index = getIndex(arr,4);
//		if(index >=0) {
//			arr[index] = null;
//			printArr(arr);
//		}else {
//			System.out.println("当前id不存在，删除失败");
//		}
		int index = getIndex(arr,4);
		if(index >=0) {
			Student stu =arr[index];
			int newAge = stu.getAge() + 1;
			stu.setAge(newAge);
		}else {
			System.out.println("当前id不存在，修改失败");
		} 
	}
	
	
	
	public static boolean contains(Student arr[],int id) {
		for (int i=0;i<arr.length;i++) {
			Student stu = arr[i];
			if(stu != null) {
				int sid = stu.getId();
				if(sid == id) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static int getCount(Student arr[]) {
		int count = 0;
		for (int i=0;i<arr.length;i++) {
			if(arr[i] != null) {
				count++;
			}
		}
		return count;
	}
	
	public static Student[] createArr(Student arr[]) {
		Student newArr[] = new Student [arr.length +1];
		for (int i=0;i<arr.length;i++) {
			newArr[i] = arr[i];
		}
		return newArr;
	}
	
	public static void printArr(Student arr[]) {
		for(int i=0;i<arr.length;i++) {
			Student stu = arr[i];
			if (stu != null) {
				System.out.println(stu.getId() + ", " + stu.getName() + ", " + stu.getAge());
			}
		}
	}
	
	public static int getIndex(Student arr[],int id) {
		for (int i=0;i<arr.length;i++) {
			Student stu = arr[i];
			if(stu != null) {
				int sid = stu.getId();
				if (sid == id) {
					return i;
				}
			}
		}
		return -1;
	}
}
