package ExerciseInBook;
import java.util.Scanner;
public class Ex2_4 {
	public static void main(String[] args) {
		int num,a,b,c,d,sum;
		System.out.print("请输入一个四位数的整数：");
		num=new Scanner (System.in).nextInt();
		a=num/1000;b=num/100%10;c=num/10%10;d=num%10;
		sum=a+b+c+d;
		System.out.printf("%d+%d+%d+%d=%d\n",a,b,c,d,sum);
	}
}
