package day06_方法;

import java.util.Arrays;

/*
 	需求：
​定义一个方法fill(int[] arr,int value)
	功能：
​将数组arr中的所有元素的值改为value
 */

public class day06_7 {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		arr = fill(arr,4);
		System.out.println(Arrays.toString(arr));
	}
	public static int[] fill(int arr[],int value) {
		for (int i=0;i<arr.length;i++) {
			arr[i] = value;
		}
		return arr;
	}
}
