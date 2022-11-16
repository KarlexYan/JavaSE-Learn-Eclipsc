package day13_面向对象进阶;

public class AnimalsTest {
	public static void main(String[] args) {
		Ragdoll rd = new Ragdoll();
		rd.eat();
		rd.drink();
		rd.catchMouse();
		System.out.println("-------------------------");
		Lihua lh = new Lihua();
		lh.eat();
		lh.drink();
		lh.catchMouse();
		System.out.println("-------------------------");
		Husky hs = new Husky();
		hs.eat();
		hs.drink();
		hs.lookHome();
		hs.breakHome();
		System.out.println("-------------------------");
		Teddy td = new Teddy();
		td.eat();
		td.drink();
		td.lookHome();
		td.touch();
	}
}
