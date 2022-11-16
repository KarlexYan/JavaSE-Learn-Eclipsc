package day09_面向对象综合;

public class GoodsTest {
	public static void main(String[] args) {
		Goods arr[] = new Goods[3];
		
		Goods g1 = new Goods("001","华为13",5999,10);
		Goods g2 = new Goods("001","华为13Pro",7999,10);
		Goods g3 = new Goods("001","华为13ProMax",8999,10);
		
		arr[0] = g1;arr[1] = g2;arr[2] = g3;
		
		for(int i=0;i<arr.length;i++) {
			Goods goods = arr[i];
			System.out.println(goods.getId()+","+goods.getName()+","+goods.getPrice()+","+goods.getCount());
		}
	}
}
