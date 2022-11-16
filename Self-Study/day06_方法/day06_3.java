package day06_方法;
// 在主方法中通过键盘录入三个整数。定义一个方法，方法接收三个整数变量，在方法中从大到小依次打印三个变量。
import java.util.Scanner;
public class day06_3 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("输入第一个整数：");
		int a = reader.nextInt();
		System.out.println("输入第二个整数：");
		int b = reader.nextInt();
		System.out.println("输入第三个整数：");
		int c = reader.nextInt();
		int max = getMax(a,b,c);
		int min = getMin(a,b,c);
		int mid = a+b+c-max-min;
		System.out.println("从大到小的顺序是："+max+" "+mid+" "+min);
		
	}
	public static int getMax(int a,int b,int c) {
		int temp = a>b?a:b;
		int max = temp>c?temp:c;
		return max;
	}
	public static int getMin(int a,int b,int c) {
		int temp = a>b?b:a;
		int min = temp>c?c:temp;
		return min;
	}
}
