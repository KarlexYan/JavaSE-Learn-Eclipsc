package ExerciseInBook;
class Persones{
	String name;char sex;
	
	Persones (String name,char sex){
		this.name=name;
		this.sex=sex;
	}
	
	void display() {
		System.out.println("姓名："+name+"性别："+sex);
	}
	
	public void print() {
		System.out.println("姓名："+name);
	}
}

class Student extends Persones{
	long number;  //增加成员变量number
	
	Student(long number, String name,char sex){
		super(name,sex);
		this.number=number;
	}
	
	//覆盖超类的display方法
	void display() {
		System.out.println("学号："+number+"姓名："+name+"性别："+sex);
	}
}
public class Ex3_6 {
	public static void main(String[] args) {
		Persones p = new Persones("张三",'M');
		p.display();
		Student s = new Student(1001,"李四",'M');
		s.display();
		s.print();//调用超类的成员方法
	}
}
