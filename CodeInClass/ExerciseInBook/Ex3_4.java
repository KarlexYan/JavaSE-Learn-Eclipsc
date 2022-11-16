package ExerciseInBook;
class Person{
	private int weight,height;  //私有成员变量
	
	//构造方法
	Person(){
		weight=100;height=80;
	}
	
	//公有成员方法
	public int getWeight() {
		return weight;
	}
	
	//公有成员方法
	public int getHeight() {
		return height;
	}
}
public class Ex3_4 {
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println("体重："+p.getWeight()+"身高："+p.getHeight());
	}
}
