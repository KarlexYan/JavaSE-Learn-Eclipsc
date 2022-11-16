package day09_面向对象综合;
import java.util.Scanner;
public class CarsTest {
	public static void main(String[] args) {
		Cars arr[] = new Cars[3];
		
		Scanner reader = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			Cars c = new Cars();
			
			System.out.println("请输入汽车的品牌：");
			String brand = reader.next();
			c.setBrand(brand);
			
			System.out.println("请输入汽车的价格：");
			double price = reader.nextDouble();
			c.setPrice(price);
			
			System.out.println("请输入汽车的颜色：");
			String color = reader.next();
			c.setColor(color);
			
			arr[i]=c;
		
		}
		for(int i=0;i<arr.length;i++) {
			Cars car = arr[i];
			System.out.println(car.getBrand()+","+car.getPrice()+","+car.getColor());
		}
	}
}
