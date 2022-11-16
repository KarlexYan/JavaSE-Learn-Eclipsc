package ExerciseInBook;
import java.util.Scanner;
public class Test19 {
	public static void main(String [] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("输入被除数：");
		int a = reader.nextInt();
		System.out.print("输入除数：");
		int b = reader.nextInt();
		int count = 0;
		
		while(a>=b) {
			a-=b;
			count++;
		}
		System.out.println("商是："+count+",余数是"+a);
		
	}
}
