package day10_字符串;
import java.util.Scanner;
public class StringDemo12 {
	public static void main(String[] args) {
//		String str = "123456";
		Scanner reader = new Scanner(System.in);
		String str;
		while(true) {
			System.out.println("请输入一个字符串");
			str = reader.next();
			
			boolean flag = checkStr(str);
//			System.out.println(flag);
			
			if(flag) {
				break;
			}else {
				System.out.println("当前字符串不符合规定，请重新输入");
				continue;
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			int number = c - 48;
//			System.out.println(c+","+number);
			String s = changeLuoMa(number);
			sb.append(s);
		}
		System.out.println(sb);
	}
	
	public static String changeLuoMa(int number) {
		String arr[] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
		return arr[number];
	}
	
	public static boolean checkStr(String str) {
		if(str.length() > 9) {
			return false;
		}
		
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(c < '0' || c > '9') {
				return false;
			}
		}
		return true;
	}
}
