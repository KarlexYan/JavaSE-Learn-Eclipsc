package Homework;

public class Fibonacci {
	public static void main(String[] args) {
		int f[] = new int [10];
		f[0]=0;f[1]=1;
		for(int i=2;i<10;i++) {
			f[i]=f[i-2]+f[i-1];
		}
		for(int i=0;i<f.length;i++) {
			if(i<f.length-1) {
				System.out.print(f[i]+",");
			}else {
				System.out.print(f[i]);
			}
		}
	}
}
