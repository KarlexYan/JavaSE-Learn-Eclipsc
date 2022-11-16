package day06_方法;
// 定义一个方法，该方法能够找出三个整数中的最大值并返回。在主方法中调用方法测试执行。
public class day06_2 {
	public static int getMax(int a,int b,int c) {
		int max = a>b?a:b;
		max = max>c?max:c;
		return max;
	}
	public static void main(String[] args) {
		System.out.println("max="+getMax(10,20,30));
	}
}
