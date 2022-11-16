package ExerciseInBook;
class Persons{
	String name;  //实例变量
	static int count= 0;  //类变量
	Persons(String xm){
		name=xm;
		count++;
	}
	
	//类方法，只能访问类变量
	public static void displayCount() {
		System.out.println("当前人数是："+count);
	}
	
	public void  display() {
		System.out.println("第"+count+"个人的姓名是："+name);
	}
	//析构方法
	public void finalize() {
		count--;
	}
}
public class Ex3_5 {
	public static void main(String[] args) {
		Persons p1 = new Persons("张三");
		p1.display(); //调用对象的实例方法
		p1.displayCount(); //调用对象的类方法
		Persons p2 = new Persons("李四");
		p2.display();
		p2.displayCount();
		p1.finalize(); //调用对象的析构方法，释放对象p1
		System.out.print("删除p1后，");
		Persons.displayCount(); //通过类名调用类方法
	}
}
