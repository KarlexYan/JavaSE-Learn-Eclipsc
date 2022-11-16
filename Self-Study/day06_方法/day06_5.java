package day06_方法;
/*
 	键盘录入一个正整数
	定义一个方法,该方法的功能是计算该数字是几位数字,并将位数返回
	在main方法中打印该数字是几位数
演示格式如下:
(1)演示一:
	请输入一个整数:1234
	控制台输出:1234是4位数字
(2)演示二:
	请输入一个整数:34567
	控制台输出:34567是5位数字
 */
import java.util.Scanner;
public class day06_5 {
	public static void main(String[] args) {
		System.out.println("输入一个正整数：");
		int num = new Scanner(System.in).nextInt();	
		System.out.println(num+"是"+getIndex(num)+"位数字");
	}
	public static int getIndex(int num) {
		int index=0;
		while(num!=0) {
			num = num / 10;
			index++;
		}
		return index;
	}
}
