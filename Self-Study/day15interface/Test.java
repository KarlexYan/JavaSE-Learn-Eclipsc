package day15interface;

public class Test {
	public static void main(String[] args) {
		Rabbit rb = new Rabbit("小白",1);
		System.out.println(rb.getName()+","+rb.getAge());
		rb.eat();
		
		Frog f = new Frog("小绿",2);
		System.out.println(f.getName()+","+f.getAge());
		f.eat();
		f.swim();
		
		Dog d = new Dog("旺财",3);
		System.out.println(d.getName()+","+d.getAge());
		d.eat();
		d.swim();
	};
}
