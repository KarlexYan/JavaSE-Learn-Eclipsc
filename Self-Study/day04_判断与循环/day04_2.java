package day04_判断与循环;
import java.util.Scanner;
//让用户依次录入三个整数，求出三个数中的最小值，并打印到控制台。
public class day04_2 {
	public static void main(String [] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("输入第一个数字：");
		int one = reader.nextInt();
		System.out.print("输入第二个数字：");
		int two = reader.nextInt();
		System.out.print("输入第三个数字：");
		int three = reader.nextInt();
		int compare = one>two?two:one;
		compare = compare>three?three:compare;
		System.out.println("min="+compare);
	}
}
