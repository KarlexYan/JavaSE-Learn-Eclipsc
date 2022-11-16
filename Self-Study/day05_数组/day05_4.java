package day05_数组;
// 现有一个整数数组，数组中的每个元素都是[0-9]之间的数字，从数组的最大索引位置开始到最小索引位置，依次表示整数的个位、十位、百位。。。依次类推。
// 数组：{2, 1, 3, 5, 4}
// 表示的整数为：21354 // 注：是整数类型的两万一千三百五十四，不是字符串拼起来的。

//import java.util.Scanner;
public class day05_4 {
	public static void main(String[] args) {
//		Scanner reader = new Scanner(System.in);
		int arr[]= {1,3,5,7,9};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum = sum*10+arr[i];
		}
		System.out.println(sum);
	}
}
