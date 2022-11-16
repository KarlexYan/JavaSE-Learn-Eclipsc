package day10_字符串;

public class StringDemo5 {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		String result = arrToString(arr);
		System.out.println(result);
	}
	
	public static String arrToString(int[] arr) {
		if(arr == null) {
			return "";
		}
		if(arr.length == 0) {
			return "[]";
		}
		String result = "[";
		for(int i=0;i<arr.length;i++) {
			result = result + arr[i];
			if(i<arr.length-1) {
				result = result + ", ";
			}
		}
		
		return result+"]";
	}
}
