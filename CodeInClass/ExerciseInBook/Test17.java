package ExerciseInBook;
// 一张足够大的纸，厚度0.1毫米，珠穆朗玛峰8844430毫米，算需要折多少次
public class Test17 {
	public static void main(String [] args) {
		double thickness = 0.1;
		double mountain = 8844430;
		int count=0;
		while(thickness<mountain) {
			thickness*=2;
			count++;
			System.out.println(thickness);
		}
		System.out.println("需要折"+count+"次");
	}
}
