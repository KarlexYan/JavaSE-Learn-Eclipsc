package day06_方法;
// 数字是有绝对值的，负数的绝对值是它本身取反，非负数的绝对值是它本身。请定义一个方法，方法能够得到小数类型数字的绝对值并返回。
import java.util.Scanner;
public class day06_4 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("输入一个小数：");
		double num = reader.nextDouble();
		System.out.println("Absolute="+getAbs(num));
	}
	public static double getAbs(double a) {
		double result = a;
		if (a<0) {
			result = a - (a*2);
		}
		return result;
	}
}
