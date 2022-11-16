package ExerciseInBook;
import java.util.Scanner;
public class Ex2_20 {
	public static void main(String [] args) {
		System.out.print("原文：");
		String oldstr = new Scanner(System.in).nextLine();
		StringBuffer newstr = new StringBuffer();
		char ch;
		for(int i=0;i<oldstr.length();i++) {
			ch = oldstr.charAt(i);
			ch = (char)(ch^'A');
			newstr.append(ch);
		}
		System.out.println("密文：" +newstr);
	}
}
