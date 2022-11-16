package ExerciseInBook;
//输入一个数，将数倒过来，如果是回文数true,否则false。
import java.util.Scanner;
public class Test18 {
	public static void main(String [] args) {
		System.out.print("输入一个数：");
		int x = new Scanner(System.in).nextInt();
		int y=x;
		int num=0;
		while (x!=0) {
			int ge = x%10;
			x=x/10;
			num=num*10+ge;
		}
		System.out.println("数字倒过来是："+num);
		if (num==y) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
}
