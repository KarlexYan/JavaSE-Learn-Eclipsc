package day05_数组;

import java.util.Arrays;

// 定义一个数组其中包含多个数字。用自己的方式最终实现，奇数放在数组的左边，偶数放在数组的右边。（可以创建其他数组，不必须在原数组中改变）
// {12,23,34,45,67,78,11,22}
public class day05_7 {
	public static void main(String[] args) {
		/*
		int a[]= {12,23,34,45,67,78,11,22};
		int j=a.length-1;
		for(int i=0;i<a.length;i++) {
			if(i==j||i>j)break;
			int t=0;
			if(a[i]%2==0) {
				while(true) {
					if(a[j]%2!=0) {
						j--;
					}else {
						t=a[i];
						a[i]=a[j];
						a[j]=t;
						j--;
						break;
					}
				}	
			}
			System.out.println(Arrays.toString(a));	
		}
		*/
		int arr[] = {12,23,34,45,67,78,11,22};
		int brr[] = new int[arr.length];
		int left = 0;int right = arr.length-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==1 ) {
				brr[left]=arr[i];
				left++;
			}else {
				brr[right]=arr[i];
				right--;
			}
		}
		System.out.println(Arrays.toString(brr));
	}
}
