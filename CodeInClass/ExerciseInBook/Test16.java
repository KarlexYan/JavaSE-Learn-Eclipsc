package ExerciseInBook;
import java.util.Scanner;
public class Test16 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入范围的开始：");
		int start = sc.nextInt();
		System.out.print("请输入范围的末尾：");
		int end = sc.nextInt();
		
		int sum=0;int count=0;
		for (int i=start;i<=end;i++) {
			if (i%5==0 && i%3==0) {
					System.out.print(i+",");
					sum+=i;
					count++;
				
			}
		}
		System.out.println("范围是"+start+"到"+end+"，符合条件的有"+count+"个，加起来是"+sum);
	}
}
