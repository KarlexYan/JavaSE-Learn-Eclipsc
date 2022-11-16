package day15abstract;

public class Test {
	public static void main(String[] args) {
		Frog f = new Frog("小绿",1);
		System.out.println(f.getName()+","+f.getAge());
		f.drink();
		f.eat();
		
		Dog d = new Dog("旺财",2);
		System.out.println(d.getName()+","+d.getAge());
		d.drink();
		d.eat();
		
		Sheep s = new Sheep();
		s.drink();
		s.eat();
		
	}
}
