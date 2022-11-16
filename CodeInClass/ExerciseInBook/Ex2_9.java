package ExerciseInBook;
import java.util.Scanner;
public class Ex2_9 {
	public static void main(String[] args) {
		System.out.print("输入星期的数字（0~6）：");
		int week = new Scanner (System.in).nextInt();
		switch (week) {
		case 0:System.out.println("周日");break;
		case 1:System.out.println("周一");break;
		case 2:System.out.println("周二");break;
		case 3:System.out.println("周三");break;
		case 4:System.out.println("周四");break;
		case 5:System.out.println("周五");break;
		case 6:System.out.println("周六");break;
		default:System.out.println("Error");
		}
	}
}
