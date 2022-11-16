package day10_字符串;

public class StringDemo13 {
	public static void main(String[] args) {
		String strA = "abcde";
		String strB = "bcdea";
		
		boolean result = checkStr(strA, strB);
		System.out.println(result);
	}
	
	
	public static boolean checkStr(String strA,String strB) {
		for(int i=0;i<strA.length();i++) {
			strA = rotateStr(strA);
			if(strA.equals(strB)) {
				return true;
			}
		}
		return false;
	}
	
	
	public static String rotateStr(String str) {
		char first = str.charAt(0);
		String end = str.substring(1);
		return end + first;
	}
}
