package day04_判断与循环;
/*
 某商场购物可以打折，具体规则如下：
​	普通顾客购不满100元不打折，满100元打9折；
​	会员购物不满200元打8折，满200元打7.5折；
​	不同打折规则不累加计算。
请根据此优惠计划进行购物结算，键盘录入顾客的类别（0表示普通顾客，1表示会员）和购物的折前金额（整数即可），输出应付金额（小数类型）。
 */
import java.util.Scanner;
public class day04_4 {
	public static void main(String [] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("0表示普通顾客，1表示会员：");
		int level = reader.nextInt();
		System.out.print("购物的折前金额："); 
		int money = reader.nextInt();
		double aftermoney = 0;
		switch(level) {
		case 0 -> {
			if(money>=100) {
				aftermoney = money*0.9;break;
			}else {
				aftermoney = money;break;
			}
		}
		case 1 -> {
			if(money>=200) {
				aftermoney = money*7.5;break;
			}else {
				aftermoney = money*8;break;
			}
		}
		default -> {
			System.out.println("你眼睛是不是瞎了？");
		}
		}
		System.out.println("money="+aftermoney);
	}
}
