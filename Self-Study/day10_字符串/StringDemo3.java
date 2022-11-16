package day10_字符串;
import java.util.Scanner;
public class StringDemo3 {
	public static void main(String[] args) {
		String rightUsername = "yanweixuan";
		String rightPassword = "karlex";

		Scanner reader = new Scanner(System.in);
		int count = 0;
		for(int i=0;i<3;i++) {
			;
			System.out.println("请输入账号：");
			String username = reader.next();
			System.out.println("请输入密码：");
			String password = reader.next();
			if(username.equals(rightUsername) && password.equals(rightPassword)) {
				System.out.println("登录成功！");
				break;
			}else {
				System.out.println("登录失败，账号或密码错误，你还剩下"+(2-count)+"次机会");
				count++;
			}
		}
		if(count==3) {
			System.out.println("错误次数过多，爪巴");
		}
	}
}
