package day10_字符串;
import java.util.Scanner;
public class StringDemo10 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("请输入对话：");
		String talk = reader.next();
		
		String[] arr = {"CNM","NMSL","SB","NT"};
		
		for(int i=0;i<arr.length;i++) {
			talk = talk.replace(arr[i], "***");
		}
		System.out.println(talk);
	}
}
