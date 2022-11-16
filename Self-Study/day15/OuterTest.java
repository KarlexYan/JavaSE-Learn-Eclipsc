package day15;

public class OuterTest {
	public static void main(String[] args) {
		Outer.Inner in = new Outer().new Inner();
		in.show();
	}
}
