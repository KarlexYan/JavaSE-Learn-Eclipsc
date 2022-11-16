package ExerciseInClass;

public class SumOf1To100 {
	public static void main(String[] args) {
		int i=1;int sum=0;
		while(i<=200) {
			sum = sum + i;
			++i;
		}
		System.out.println("sum="+sum);
	}
}
