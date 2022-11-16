package ExerciseInBook;

public class Ex2_16 {
	public static void main(String[] args) {
		final int N = 30;
		long f[] = new long [N];
		int i;
		f[0]=1;f[1]=1;
		for(i=2;i<N;i++) {
			f[i]=f[i-2]+f[i-1];
		}
		System.out.println("前"+N+"项 Fibonacci：");
		for(i=0;i<f.length;i++) {
			System.out.printf("%8d", f[i]);
			if((i+1)%5==0)
				System.out.println();
		}
	}
}
