package day15;

public class Outer {
	private int a = 10;
	
	class Inner{
		private int a = 20;
		public void show() {
			int a = 30;
			Outer o = new Outer();
			System.out.println(o.a);
			System.out.println(this.a);
			System.out.println(a);
		}
	}
}
