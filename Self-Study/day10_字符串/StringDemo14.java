package day10_字符串;
import java.util.Random;
public class StringDemo14 {
	public static void main(String[] args) {
		String str = "abcdefg";
		
		char[] arr = str.toCharArray();
		
		for(int i=0;i<str.length();i++) {
			Random rd = new Random();
			int index = rd.nextInt(str.length());
			char temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
		}
		String result = new String(arr);
		System.out.println(result);
	}
}
