package day10_字符串;

import java.util.Scanner;
public class StringDemo4 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("请输入字符串：");
		String str = reader.nextLine();
		
		int bigCount = 0;
		int smallCount = 0;
		int numCount = 0;
		
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
//			System.out.println(c);
			if(c >= 'a' && c<= 'z') {
				smallCount++;
			}else if(c >= 'A' && c<='Z') {
				bigCount++;
			}else if(c >= 48 && c<=57) {
				numCount++;
			}
		}
		System.out.println("bigCount="+bigCount+" smallCount="+smallCount+" numCount="+numCount);
	}
}
