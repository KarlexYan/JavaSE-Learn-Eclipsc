package day10_字符串;

public class StringDemo6 {
	public static void main(String[] args) {
		String result = reverser("HelloWorld");
		System.out.println(result);
	}
	
	public static String reverser(String str) {
		String result = "[";
		for(int i=str.length()-1;i>=0;i--) {
			char c =str.charAt(i);
			result = result + c;
			if (i>0) {
				result = result + ",";
			}
		}
		return result+"]";
		
	}
}
