package day08_面向对象;

public class MC {
	public static void main(String[] args) {
		Manager mg = new Manager("20130367","严炜轩",66000,12000);
		Coder cd = new Coder("logs100","横峰",12000);
		mg.work();
		cd.work();
	}
}
