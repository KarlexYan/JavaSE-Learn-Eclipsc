package day10_字符串;
import java.util.Scanner;
public class StringDemo11 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("请输入一个字符串:");
		String str = reader.next();
		
		String result = new StringBuilder().append(str).reverse().toString();
		
		if(result.equals(str)) {
			System.out.println("是对称字符串");
		}else {
			System.out.println("不是对称字符串");
		}
	}
}
