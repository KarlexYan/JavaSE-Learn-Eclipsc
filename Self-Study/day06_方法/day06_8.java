package day06_方法;

import java.util.Arrays;

/*
 	需求：
​	定义一个方法fill(int[] arr,int fromIndex,int toIndex,int value)
	功能：
​	将数组arr中的元素从索引fromIndex开始到toIndex（不包含toIndex）对应的值改为value
 */
public class day06_8 {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		arr = fill(arr,3,7,5);
		System.out.println(Arrays.toString(arr));
	}
	public static int[] fill(int[] arr,int fromIndex,int toIndex,int value) {
		for(int i=fromIndex-1;i<toIndex-1;i++) {
			arr[i]=value;
		}
		return arr;
	}
}
