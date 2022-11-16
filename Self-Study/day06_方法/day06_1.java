package day06_方法;
// 定义一个方法，该方法能够找出两个小数中的较小值并返回。在主方法中调用方法进行测试。
import java.util.Scanner;
public class day06_1 {
	public static double getMin(double a,double b) {
		double result = a>b?b:a;
		return result;
	}
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("输入第一个：");
		double a = reader.nextDouble();
		System.out.println("输入第二个：");
		double b = reader.nextDouble();
		System.out.println("min="+getMin(a,b));
	}
}
