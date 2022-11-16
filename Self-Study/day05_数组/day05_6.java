package day05_数组;
/*
 有一个数组，其中有十个元素从小到大依次排列 {12,14,23,45,66,68,70,77,90,91}。
 再通过键盘录入一个整数数字。要求：把数字放入数组序列中，生成一个新的数组，并且数组的元素依旧是从小到大排列的。
 
 请输入一个整数数字：50
 生成的新数组是：12 14 23 45 50 66 68 70 77 90 91
 */
import java.util.Scanner;
public class day05_6 {
	public static void main(String[] args) {
		int arr[] = {12,14,23,45,66,68,70,77,90,91};
		int arr2[] = new int [11];
		System.out.print("输入一个数：");
		int number = new Scanner(System.in).nextInt();
		int index=0;
		for (int i=0;i<arr.length;i++) {
			if(arr[i]<=number) {
				arr2[i]=arr[i];
				index++;
			}else {
				arr2[i+1]=arr[i];
			}
		}
		arr2[index]=number;
		System.out.println("新数组为：");
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
	}
}
