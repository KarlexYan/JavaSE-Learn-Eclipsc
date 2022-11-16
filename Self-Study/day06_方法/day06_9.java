package day06_方法;

import java.util.Arrays;

/*
需求：
​	定义一个方法copyOf(int[] arr, int newLength)
功能：
​	将数组arr中的newLength个元素拷贝到新数组中，并将新数组返回，从索引为0开始
 */
public class day06_9 {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int newArr[] = copyOf(arr,6);
		System.out.println(Arrays.toString(newArr));
	}
	
	public static int[] copyOf(int[] arr, int newLength) {
		int newArr[] = new int [newLength];
		for(int i=0;i<newLength;i++) {
			newArr[i]=arr[i];
		}
		return newArr;
	}
}
