package ExerciseInBook;

public class Ex2_15 {
	public static void main(String[] args) {
		System.out.println("九九乘法表");
		for (int i=1;i<=9;i++) {
			for (int j=1;j<=i;j++) {
				System.out.printf("%d*%d=%2d ",i,j,i*j);
			}
			System.out.println();
		}
	}
}
