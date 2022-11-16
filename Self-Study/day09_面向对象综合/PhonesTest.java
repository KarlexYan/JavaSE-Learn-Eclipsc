package day09_面向对象综合;

public class PhonesTest {
	public static void main(String[] args) {
		Phones arr[] = new Phones [3];
		
		Phones p1 = new Phones("苹果14",5999,"远峰蓝");
		Phones p2 = new Phones("苹果14Plus",6999,"基佬紫");
		Phones p3 = new Phones("苹果14Pro",7999,"暗夜黑");
		
		arr[0]=p1;arr[1]=p2;arr[2]=p3;
		
		
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			Phones phone = arr[i];
			sum += phone.getPrice();
		}
		double avg = sum / arr.length;
		System.out.println("avg="+avg);
	}
}
